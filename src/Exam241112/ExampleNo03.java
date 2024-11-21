package Exam241112;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Calc{
    int a;
    int b;
    Calc(int a){
        this.a=a;
    }
    //int calculate(){

    //}
}
public class ExampleNo03 {
    public static void main(String[] args) {

        //1. 5부터 10까지의 정수형 데이터를 입력받아 5~10이외의 정수형이 입력되면
        // “다시입력”이라고출력한다. 입력받은 정수값을Calc class의calculate()함수를 이용하여
        // 1부터 입력받은숫자까지 홀수만 더하는 프로그램을작성해라.
        // (calculate()함수는 int형정수를 입력받아 1부터입력받은숫자까지
        // 홀수의합을 구하여 리턴하는 함수)

        Scanner scanner=new Scanner(System.in);
        Set<Calc> calc=new HashSet<Calc>();
        int i=0;
        System.out.println("5~10의 정수 중 하나를 입력하시오.");
        int value=scanner.nextInt();
        while(true){
            if(value<=5 && value>=10){
                break;
            }
            calc.add(new Calc(value));
            i++;
        }
        //System.out.println(calc.calculator());
    }
}
