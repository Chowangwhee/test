package Practice.Stream;

import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddNewFileWithByteArray {
    public static void main(String[] args) throws IOException {

        ByteArrayInputStream in=null;   //읽어들임
        FileOutputStream out=null;      //파일을 생성 && 값 생성

        try{
            byte []b=new byte[]{1,2,3};
            //1,2,3 바이트 배열 읽어들임
            in=new ByteArrayInputStream(b);
            //g.dat 파일을 생성해서 1,2,3을 파일에 저장
            out=new FileOutputStream("g.dat");

            int r=-1;
            while((r=in.read())!=-1){
                //1,2,3을 g.dat 파일에 저장
                out.write(r);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        out.close();
        in.close();
    }
}
