package Practice.ServerAndClient.No01;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        ServerSocket ss = null;

        try {
            ss = new ServerSocket(9999);
            System.out.println("서버 기다림....");
        } catch (Exception e) {
            e.printStackTrace();
            return;  //서버 소켓 생성 실패시 종료
        }
        while(true){
            Socket socket=null;
            try{
                if(ss!=null){
                    socket=ss.accept();  //연결수락
                    System.out.println("클라이언트와 연결성공");

                    //클라이언트가 전송한 메시지 받기
                    InputStream in=socket.getInputStream();
                    DataInputStream dis=new DataInputStream(in);
                    String msg=dis.readUTF();
                    System.out.println(msg);

                    //클라이언트한테 메시지 전송

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}