package Practice.Stream;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ReadFileAndOutput {
    public static void main(String[] args) throws FileNotFoundException {

        //g.dat 파일을 읽어와서 콘솔에 출력
        FileInputStream in=null;
        ByteArrayOutputStream out=null;

        try{
            //g.dat 파일을 읽어와서
            in=new FileInputStream("g.dat");
            //바이트 배열에 저장하겠다
            out=new ByteArrayOutputStream();

            int r=-1;
            while ((r=in.read())!=-1){
                out.write(r);
            }
            //스트림에 저장된 데이터를 바이트 배열로 변환 함
            byte []b= out.toByteArray();
            //출력
            for(int i=0;i<b.length;i++){
                System.out.println(b[i]);
                out.close();
                in.close();
            }
        }catch (Exception e){}
    }
}
