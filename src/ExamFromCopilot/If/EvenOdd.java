package ExamFromCopilot.If;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {

        //문제 1: 짝수와 홀수 판별하기
        //사용자가 입력한 숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성하세요.

        Scanner scanner=new Scanner(System.in);

        System.out.println("정수를 입력하시오.");
        int n=scanner.nextInt();
        if(n%2==0 && n!=0){
            System.out.println("짝수 입니다.");
        }else if(n%2!=0 && n!=0){
            System.out.println("홀수 입니다.");
        }else{
            System.out.println("정수가 아닙니다.");
        }

    }
}
