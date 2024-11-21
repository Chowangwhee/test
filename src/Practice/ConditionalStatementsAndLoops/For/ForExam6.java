package Practice.ConditionalStatementsAndLoops.For;

import java.util.Scanner;

public class ForExam6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("정수 5개 입력");
        int sum=0;

        for(int i=0;i<5;i++){                       //횟수 설정
            int n= scanner.nextInt();               //5번 입력 됨
            if(n<0){
                continue;                           //제외
            }
            else{                                   //n>=0
                sum+=n;
            }
        }
        System.out.println("양수의 합만 출력\n"+sum);

    }
}
