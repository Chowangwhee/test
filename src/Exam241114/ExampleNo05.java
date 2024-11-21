package Exam241114;

import java.io.*;

public class ExampleNo05 {
    public static void main(String[] args) throws IOException {

        //3. FileOutputStream을 이용하여 byte[]배열 속에 들어있는 바이너리 값을
        // fi.txt파일에 저장해라. (byte b[]={1,2,3,4,5}; 로초기화)

        //byte b[]={1,2,3,4,5};

        //FileOutputStream fos=new FileOutputStream("fi.txt");
        //for(int i=0;i<b.length;i++){
        //    try {
        //        fos.write(b[i]);
        //    } catch (IOException e) {
        //        throw new RuntimeException(e);
        //    }
        //}

        //3.1 저장한 후 값을 읽어와서 출력해라.

        FileInputStream fis=new FileInputStream("fi.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

        int r=0;
        while((r= bis.read())!=-1){
            try{
                System.out.println(r);
            }catch (Exception e){}
        }
        bis.close();
    }
}
