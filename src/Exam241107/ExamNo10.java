package Exam241107;

import java.util.Scanner;
public class ExamNo10 {
    public static void main(String[] args) {

        // 5. 무한루프안에 두 정수를 입력받아 합을 구하고
        // 실수를 입력하면 “실수는 안된다”라고 출력하고
        // 다시 두 정수를 입력받는 코드를 작성해라.

        // 실행 결과) 두 정수 입력: 3 3.5

        // 실수는 안된다

        // 두 정수 입력: 3 5

        // 답: 8

        Scanner scanner=new Scanner(System.in);
        int num1=0;
        int num2=0;
        int sum=0;
        boolean validInput=false;

        while(!validInput) {
            String y = null;
            String x = null;
            try {
                if (num1 == 0) {
                    System.out.println("정수를 입력하시오.");
                    x = scanner.next();
                    if (x.contains(".")) {
                        System.out.println("실수는 안된다.");
                        throw new NumberFormatException();
                    }
                    num1 =(int)Integer.parseInt(x);
                }
                if (num2 == 0) {
                    System.out.println("정수를 입력하시오.");
                    y = scanner.next();
                    if (y.contains(".")) {
                        System.out.println("실수는 안된다.");
                        throw new NumberFormatException();
                    }
                    num2 =Integer.parseInt(y);
                    validInput=true;
                    sum=num1+num2;
                }
            } catch (NumberFormatException e) {
                System.out.println("정수를 다시 입력하십시오.");
            }
        }
        System.out.println("두 정수 "+num1+"과(와) "+num2+"의 합은 "+sum+"입니다.");
    }
}
