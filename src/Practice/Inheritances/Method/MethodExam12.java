package Practice.Inheritances.Method;

import java.util.Scanner;

public class MethodExam12 {
    static double average(int a,int b){
        return (a+b)/2.0;
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int x=s.nextInt();
        int y=s.nextInt();

        double avg=average(x,y);
        System.out.println(avg);

        //두 정수 입력받아 평균 반환하는 함수
    }
}
