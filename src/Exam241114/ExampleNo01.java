package Exam241114;

import java.io.*;
import java.util.Arrays;

public class ExampleNo01 {
    public static void main(String[] args) throws FileNotFoundException {

        //1. FileOutputStream 을 이용하여 byte[] 배열 속에 들어있는 값을
        // test.txt파일에 저장해라.

        //byte b[]={4,6,7,8,-1,24};
        //ByteArrayInputStream in=null;
        //in=new ByteArrayInputStream(b);

        //FileOutputStream out=null;
        //out=new FileOutputStream("test.txt");

        //try{
        //    out.write(b);
        //} catch (IOException e) {
        //    throw new RuntimeException(e);
        //}

        //1.2 FileInputStream을 이용하여 test.txt파일을 읽어
        // byte[] 속에 저장하고 화면에 출력해라.

        FileInputStream in=null;
        ByteArrayOutputStream out=null;

        try{
            in=new FileInputStream("test.txt");
            out=new ByteArrayOutputStream();

            int r=-1;

            while((r=in.read())!=-1){
                out.write(r);
            }
            byte []b= out.toByteArray();

            for(int i=0;i<b.length;i++){
                System.out.println(b[i]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
