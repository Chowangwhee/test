package Practice.Inheritances.Method;

import java.util.Scanner;

public class MethodExam7 {
    static double big(double a, double b){
        return a>b?a:b; //삼항연산자 활용
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        double c=s.nextDouble();
        double d=s.nextDouble();

        System.out.println(big(c,d));   //두 수 중 큰 값 리턴
    }
}
