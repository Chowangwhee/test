package Practice.Stream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordOutput {
    public static void main(String[] args) throws IOException {

        //a.txt에 저장된 문자를 읽어와서 출력
        char ary[]=new char[10];//SW
        int r;

        FileReader in=new FileReader("a.txt");
        //파일에 저장한 문자를 읽어들여서
        r=in.read(ary,0,ary.length);
        //배열의 길이만큼 저장
        for(int i=0;i<r;i++){
            System.out.println(ary[i]);
        }
        in.close();

    }
}
