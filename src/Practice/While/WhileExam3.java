package Practice.While;

import java.util.Scanner;

public class WhileExam3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int sum=0, n=100;

        while(n!=0){
            System.out.println("입력해라");
            n=scanner.nextInt();
            sum+=n;
        }
        System.out.println(sum);
    }
}
