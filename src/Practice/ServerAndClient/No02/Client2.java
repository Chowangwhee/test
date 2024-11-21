package Practice.ServerAndClient.No02;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client2 {
    public static void main(String[] args) {
        //클라이언트
        Socket s=null;

        try{
            s=new Socket();
            System.out.println("연결요청 중..");
            //클라이언트와 서버에게 연결요청할 때 사용되는 메소드
            s.connect(new InetSocketAddress("localhost",5001));
            System.out.println("연결 됨");

            byte []b=null;
            String msg=null;

            OutputStream os=s.getOutputStream();
            msg="Hi Practice.ServerAndClient.No01.Server";

            //문자열을 byte 로 변경해서 전송하겠다
            b=msg.getBytes("UTF-8");
            os.write(b);
            System.out.println("데이터 보내기 성공");

            InputStream is=s.getInputStream();
            DataInputStream dis=new DataInputStream(is);
            System.out.println(dis.readUTF());

            dis.close();
            os.close();
            is.close();

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
