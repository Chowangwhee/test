package Practice.For;

import java.util.Scanner;

public class ForExam2 {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);

        System.out.println("몇단?");

        int dan= scanner.nextInt();

        for(int i=9;i>=1;i--){
            System.out.printf("%d*%d=%d\n",dan,i,dan*i);
        }
    }
}
