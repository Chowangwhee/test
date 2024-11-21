package Practice.ServerAndClient.No03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class Server {
    HashMap clientMap;

    Server(){
        clientMap=new HashMap();    //연결된 클라이언트 정보 저장하기 위해
        Collections.synchronizedMap(clientMap); //key: 이름, value: 메시지
        //동기화된 앱으로 초기화 - 멀티 스레드 환경에서도 안전하게 접근 가능
        //p.867
    }
    public void start(){
        ServerSocket serverSocket=null;
        Socket socket=null;

        try{
            serverSocket=new ServerSocket(9999);    //클라이언트 연결 기다림
            System.out.println("Practice.ServerAndClient.No01.Server Start");
            while (true){
                socket=serverSocket.accept();   //클라이언트 요청을 수락
                System.out.println(socket.getInetAddress()+":"+
                        socket.getPort()+" connected");
                ServerReceiver serverReciver=new ServerReceiver(socket);
                serverReciver.start();
                //각각의 클라이언트 통신 독립적으로 처리하기 위해 스레드 생성
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //모든 클라이언트한테 메시지 전송하는 기능
    void sendAll(String msg){
        Iterator iterator=clientMap.keySet().iterator();//키 값만 반복
        //각각 클라이언트 맵의 모든 값을 순차적으로 돌면서
        //각각의 클라이언트의 정보들을 가져온다(이름,메시지)
        while(iterator.hasNext()){
            try{
            DataOutputStream outputStream=
                    (DataOutputStream) clientMap.get(iterator.next());
                    //메시지 가져오기(키와 매핑되어지는 값 가져오기)
            outputStream.writeUTF(msg);
            }catch (Exception e){
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        new Server().start();
    }
    class ServerReceiver extends Thread{
        Socket socket;
        DataInputStream inputStream;    //클라이언트로부터 데이터를 읽는 스트림
        DataOutputStream outputStream;  //클라이언트로부터 데이터를 보내는 스트림

        ServerReceiver(Socket socket){
            this.socket=socket;
            try{
                inputStream=new DataInputStream(socket.getInputStream());
                outputStream=new DataOutputStream(socket.getOutputStream());
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        @Override
        public void run(){
            String name="";
            try{
                name=inputStream.readUTF(); //클라이언트가 보내온 이름을 읽는다
                if(clientMap.get(name)!=null){
                    outputStream.writeUTF("they has same name already : "+name);
                    outputStream.writeUTF("please retry to connect");
                    System.out.println(socket.getInetAddress()+" : "+
                    socket.getPort()+" disconnected");
                    inputStream.close();
                    outputStream.close();
                    socket.close();
                    socket=null;
                }
                else{   //동일한 이름이 아니라면(HashMap에 이름이 없다면)
                    sendAll(name+" has been connected");  //모든 클라이언트한테 알림
                    clientMap.put(name,outputStream);   //해당 클라이언트를 맵에 추가
                    while(inputStream!=null){
                        sendAll(inputStream.readUTF());
                    }
                }
            }catch (Exception e){
                throw new RuntimeException(e);
            }
            finally {
                if(socket!=null){
                    sendAll(name+" has been disconnected");
                    clientMap.remove(name);
                    System.out.println(socket.getInetAddress()+" : "+
                            socket.getPort()+" disconnected");
                }
            }
        }
    }
}
