package ExamFromCopilot.If;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {

        //문제 3: 최대값 찾기
        //세 개의 숫자를 입력받아 그 중 가장 큰 숫자를 출력하는 프로그램을 작성하세요.

        Scanner scanner=new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하시오.");
        double a=scanner.nextDouble();
        System.out.println("두번째 숫자를 입력하시오.");
        double b= scanner.nextDouble();
        System.out.println("세번째 숫자를 입력하시오.");
        double c= scanner.nextDouble();

        if(a>b && a>c){
            System.out.println("가장 큰 숫자는 첫번째 숫자인 "+a+"입니다.");
        }else if(b>a && b>c){
            System.out.println("가장 큰 숫자는 두번째 숫자인 "+b+"입니다.");
        }else{
            System.out.println("가장 큰 숫자는 세번째 숫자인 "+c+"입니다.");
        }

    }
}
