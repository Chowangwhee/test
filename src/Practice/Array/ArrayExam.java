package Practice.Array;

import java.util.Scanner;

public class ArrayExam {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        double ary[] = new double[3];

        for (int i = 0; i < 3; i++) {
            ary[i] = s.nextDouble();
            System.out.println(ary[i]);
        }
    }
}
