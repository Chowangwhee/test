package Exam241114;

import Practice.Stream.BufferedWriter01;

import java.io.*;
import java.util.StringTokenizer;

public class ExampleNo02 {
    public static void main(String[] args) throws IOException {

        //2. Sample.txt파일에 “저는 자바를 좋아합니다”를 저장하고 파일을 읽어 화면에 출력해라.
        //(String [] 배열로 초기화해서 for문으로 읽기)

        FileWriter fw=new FileWriter("Sample.txt");
        BufferedWriter bw=new BufferedWriter(fw);

        bw.write("저는 자바를 좋아합니다.");
        bw.close();

        FileReader fr=new FileReader("Sample.txt");
        BufferedReader br=new BufferedReader(fr);
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        String []str=new String[3];
        for(int i=0;i<str.length;i++){
            str[i]=st.nextToken();
        }
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}
