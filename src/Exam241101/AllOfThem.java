package Exam241101;

import java.util.Scanner;

public class AllOfThem {

    static int adder(int a, int b) {
        return a + b;
    }

    static double exp(double a) {
        return a * a;
    }

    static double circle1(int a) {
        return 3.14 * a * a;
    }

    static void circle2(double a, int b, int c) {
        System.out.println(3.14 * b * c);
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int num1 = 1;
        int sum1 = 1;

        while (true) {
            num1++;
            sum1 *= num1;
            if (num1 == 10) {
                System.out.println(sum1);
                break;
            }
        }

        for (int num2 = 2; num2 < 9; num2++) {
            for (int num3 = 1; num3 < 9; num3++) {
                if (num2 % 2 == 0) {
                    if (num2 < num3) {
                        break;
                    }
                    System.out.println(num2 + "*" + num3 + "=" + num2 * num3);
                }


            }
        }

        int result = adder(10, 20);            //두 수의 합 출력
        System.out.println(result);
        System.out.println(exp(3.5));       //3.5의 제곱 값 출력

        int input = s.nextInt();
        System.out.println(circle1(input));

        circle2(3.14, input, input);


    }
}
