package Exam241113;

import java.util.Random;
import java.util.Scanner;

interface Calculator{

    double Cal(char c);
}
class Calcu implements Calculator{
    int a;
    int b;
    Calcu(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public double Cal(char c){
        switch (c){
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                return (double)a/b;
        }
        return 10001;
    }
}
public class ExampleNo01 {
    public static void main(String[] args) {

        //1. Interface를 상속받은 Calcu클래스를 작성해라.
        // Main()에서 a,b에 대해 적절한 값을 설정해라.
        Random random=new Random();
        int a=random.nextInt(100)+1;
        System.out.println("난수 a의 값: "+a);
        int b=random.nextInt(100)+1;
        System.out.println("난수 b의 값: "+b);

        Scanner scanner=new Scanner(System.in);
        System.out.println("연산자를 입력하시오.");
        char c=scanner.next().charAt(0);
        Calcu calcu=new Calcu(a,b);
        while(true) {
            if (calcu.Cal(c) > 10000) {
                System.out.println("연산자를 다시 입력하시오.");
                c = scanner.next().charAt(0);
            } else {
                System.out.println(calcu.Cal(c));
                break;
            }
        }

    }
}
