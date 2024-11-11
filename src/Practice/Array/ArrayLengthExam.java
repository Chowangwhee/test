package Practice.Array;

import java.util.Scanner;

public class ArrayLengthExam {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        double a[]=new double[5];
        int sum=0;

        for(int i=0;i<a.length;i++){
            a[i]=s.nextDouble();
            sum+=a[i];
        }
        System.out.println((double)sum/a.length);
    }
}
