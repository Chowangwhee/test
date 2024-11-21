package Practice.Stream;

import java.io.FileWriter;
import java.io.IOException;

public class Word {
    public static void main(String[] args) throws IOException {

        char a='S';
        char b='W';

        //파일 생성해서 문자 저장
        FileWriter out=new FileWriter("a.txt");

        out.write(a);
        out.write(b);
        out.close();
    }
}
