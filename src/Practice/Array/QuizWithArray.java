package Practice.Array;

import java.util.Scanner;

public class QuizWithArray {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        String [][]strArray1={{"Korea","한국어"},{"England","영어"},{"Japan","일본어"}};

        for(int int1=0;int1<strArray1.length;int1++){
            System.out.println(strArray1[int1][0]+"의 모국어는?");
            String str1=s.next();

            if(str1.equals(strArray1[int1][1])){
                System.out.println("정답");
            }else{
                System.out.println("오답, 정답은 : "+strArray1[int1][1]);
            }

        }
    }
}
