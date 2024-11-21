package Practice.ConditionalStatementsAndLoops.For;

import java.util.Scanner;

public class SwitchForExam {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("정수 입력");
        int n= scanner.nextInt();

        switch (n){
            case 2:
                System.out.println("2단");
                for(int i=1;i<=9;i++){
                    System.out.println(2*i);
                }
                break;
            case 3:
                System.out.println("3단");
                for(int i=1;i<=9;i++){
                    System.out.println(3*i);
                }
                break;
            default:
                System.out.println("2,3단 아님");
                break;
        }
    }
}
