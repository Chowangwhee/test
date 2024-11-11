package Practice.Array;

import java.util.Scanner;

public class Array2Exam2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double ary[][] = new double[2][3];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("ary 배열 [%.1f][%.1f]에 들어갈 실수를 입력하세요.\n", i, j);
                ary[i][j] = s.nextDouble();
                System.out.printf("ary 배열 [%.1f][%.1f]에 입력된 실수 : %.1f\n", i, j, s);
            }
        }

    }
}