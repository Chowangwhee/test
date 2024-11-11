package Exam241108;

import java.util.StringTokenizer;

public class ExamNo05 {
    public static void main(String[] args) {

        //2. 문자열 “1+2+3+4+5”를 “+”로 구분해서 총합 15를 출력해라

        //(StringTokenizer,parseInt 다 사용)
        int sum=0;
        String s="1+2+3+4+5";

        StringTokenizer stringTokenizer=new StringTokenizer(s,"+");
        while(stringTokenizer.hasMoreTokens()){
            sum+=Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(sum);
    }
}
