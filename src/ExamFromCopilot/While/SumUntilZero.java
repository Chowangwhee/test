package ExamFromCopilot.While;

import java.util.Scanner;

public class SumUntilZero {

    //문제 4: 사용자 입력 합계 구하기
    //사용자가 0을 입력할 때까지 숫자를 입력받아 합계를 구하는 프로그램을 작성하세요.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        double summaryValue = 0;
        int count = 0;

        while (!validInput) {
            System.out.println("숫자를 입력하세요.");
            double i = scanner.nextDouble();
            if (i == 0) {
                System.out.println("입력받은 숫자가 0 이므로 프로그램을 종료합니다.");
                break;
            }
            summaryValue += i;
            count++;
        }
        if (summaryValue == 0) {
            System.out.println("총합은 0입니다.");
        } else {
            System.out.println("입력받은 숫자 " + count + "개 의 총합은 " + summaryValue + "입니다.");
        }

    }
}