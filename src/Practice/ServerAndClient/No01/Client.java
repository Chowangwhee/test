package Practice.ServerAndClient.No01;

import java.io.DataOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try{
            Socket socket = new Socket("127.0.0.1",9999); //-->accept()
            System.out.println("연결성공");

            //클라이언트가 서버에게 메시지 보냄
            Scanner scanner=new Scanner(System.in);
            String msg=scanner.nextLine();  //안녕 연결해줬네?

            OutputStream out=socket.getOutputStream(); //데이터를 서버에 전송하기위해
            DataOutputStream dos=new DataOutputStream(out);
            dos.writeUTF(msg);//p.807

            //서버가 전송한 데이터 받기

        }catch (Exception e){}
    }
}