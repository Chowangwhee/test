package ExamFromCopilot.If;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {

        //문제 4: 성적 등급 계산하기
        //사용자가 입력한 점수에 따라 성적 등급을 출력하는 프로그램을 작성하세요.

        Scanner scanner=new Scanner(System.in);

        System.out.println("점수를 입력하시오.");
        int n=scanner.nextInt();
        if(n<=100 && n>=90){
            if(n==100){
                System.out.println("A+");
            }else{
                System.out.println("A");
            }
        }else if(n<90 && n>=80){
            System.out.println("B");
        }else if(n<80 && n>=70){
            System.out.println("C");
        }else if(n<70){
            System.out.println("F");
        }
        scanner.close();

    }
}
