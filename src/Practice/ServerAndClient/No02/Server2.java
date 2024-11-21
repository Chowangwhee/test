package Practice.ServerAndClient.No02;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
    public static void main(String[] args) {
        //서버
        ServerSocket ser=null;
        try{
            //1. 서버 소켓 생성
            ser=new ServerSocket();
            //2. 서버 소켓과 소켓이 연결될 ip 주소와 포트번호
            ser.bind(new InetSocketAddress("localhost",5001));
            while(true){
                System.out.println("연결 대기 중..");
                //3.연결요청을 수락하면서 소켓을 생성한다.
                Socket so=ser.accept();

                byte[] b=null;
                String msg=null;
                //읽어오기
                InputStream is=so.getInputStream();
                b=new byte[100];
                int r=is.read(b);
                //Byte 배열을 문자로 변형
                msg=new String(b,0,r,"UTF-8");
                System.out.println("데이터 수신 완료");

                OutputStream os=so.getOutputStream();
                msg="Hi Practice.ServerAndClient.No01.Client";
                //문자열을 Byte 로 변경해서 전송
                b=msg.getBytes("UTF-8");

                os.write(b);
                System.out.println("데이터 전송 완료");
                os.close();
                is.close();
                so.close();
                ser.close();
            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
