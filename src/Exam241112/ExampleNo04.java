package Exam241112;

import java.util.Scanner;

public class ExampleNo04 {

    public static void main(String[] args) {

        int[][] ary=new int[3][3];

        high(ary,3,3);

    //정수 입력받아 high라는 함수안에서 입력한 수 중 최대값 구해라.
    }
    static void high(int[][] ary, int a, int b){
        int maxValue=0;
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                System.out.println("정수를 입력하세요.");
                ary[i][j]=scanner.nextInt();
                if(maxValue<ary[i][j])maxValue=ary[i][j];
            }
        }
        System.out.println("가장 큰 수: "+maxValue);
    }
}
