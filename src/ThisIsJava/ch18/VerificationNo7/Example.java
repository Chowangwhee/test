package ThisIsJava.ch18.VerificationNo7;

import java.io.BufferedReader;
import java.io.FileReader;

public class Example {
    public static void main(String[] args) throws Exception {
        String filePath="C:/Users/bitcamp/IdeaProjects/Test/src/ThisIsJava/ch02/sec01/VariableUseExample.java";

        FileReader fr=new FileReader(filePath);
        BufferedReader br=new BufferedReader(fr);

        int rowNumber=0;
        String rowData;
        while(true){
            rowNumber++;
            if((rowData= br.readLine())!=null) {
                System.out.println(rowNumber+": \t"+rowData);
            }else break;
        }

        br.close();
    }
}
