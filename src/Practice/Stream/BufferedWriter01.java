package Practice.Stream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriter01 {
    public static void main(String[] args) throws IOException {

        FileWriter fw=new FileWriter("fw.txt");
        BufferedWriter out=new BufferedWriter(fw);

        out.write("안녕!");
        out.newLine();
        out.write("오늘은 목요일~");
        out.newLine();
        out.write("aaa.naver.com");
        out.close();

    }
}
