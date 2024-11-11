package Exam241107;

import java.util.Scanner;

public class ExamNo11 {
    public static void main(String[] args) {

        // 4. 정수를 입력받아 짝수이면 “짝수”, 홀수이면 “홀수” 라고 출력해라.

        // 정수를 입력하지 않은 경우에는 프로그램을 종료시켜라.(try-catch 사용)

        Scanner scanner=new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        boolean key=false;

        while(!key){
            try{
                int inputValue=scanner.nextInt();
                if(inputValue%2==0){
                    System.out.println("짝수");
                }else{System.out.println("홀수");}
                inputValue=0;
            }catch(Exception e){
                System.out.println("프로그램을 종료합니다.");
                key=true;
            }
        }
    }
}
