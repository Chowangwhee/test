package Practice.Stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteArrayWithOutput {
    public static void main(String[] args) {

        //1,2,3,4,5 를 읽어와서 OutputStream 에 저장
        byte []in={1,2,3,4,5};
        byte []out=null;

        ByteArrayInputStream input=null;
        ByteArrayOutputStream output=null;

        output=new ByteArrayOutputStream();
        input=new ByteArrayInputStream(in);

        int r=0;
        while ((r=input.read())!=-1){
            //스트림에 저장
            output.write(r);
        }
        //바이트스트림을 바이트배열로 바꿈
        out=output.toByteArray();

        System.out.println(Arrays.toString(in));
        System.out.println(Arrays.toString(out));
        //toString() : 객체를 문자열로 변환해주는 메소드

    }
}
