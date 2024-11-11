package ExamFromCopilot.For;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //문제 5: 팩토리얼 계산하기
        //사용자가 입력한 숫자의 팩토리얼을 계산하여 출력하는 프로그램을 작성하세요.

        Scanner s=new Scanner(System.in);
        int sum=0;
        System.out.println("정수를 입력하시오.");
        int n=s.nextInt();
        sum=n;
        for(int i=1;i<n;i++){
            sum=sum*i;
        }
        System.out.println(sum);
    }
}
