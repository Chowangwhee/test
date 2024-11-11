package ExamFromCopilot.While;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //문제 3: 팩토리얼 계산하기
        //사용자가 입력한 숫자의 팩토리얼을 계산하여 출력하는 프로그램을 작성하세요.

        Scanner scanner=new Scanner(System.in);

        int n=1;
        int sum=0;

        System.out.println("숫자를 입력하시오.");
        int s=scanner.nextInt();
        sum=sum+s;
        while(true){
            if(s>n){
                sum=sum*n;
            }
            else{
                break;
            }
            n++;
        }
        System.out.println(sum);
    }
}
