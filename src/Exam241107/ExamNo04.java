package Exam241107;

import java.util.Scanner;

abstract class Calc{
    double op1,op2;

    void set(double op1,double op2){

    }
    double calculate(){
        return op1+op2;
    }
}
class Add extends Calc{
    @Override
    double calculate() {
        return super.calculate();
    }
}
class Sub extends Calc{
    @Override
    double calculate() {
        return op1-op2;
    }
}
class Mul extends Calc{
    @Override
    double calculate() {
        return op1*op2;
    }
}
class Div extends Calc{
    @Override
    double calculate() {
        return op1/op2;
    }
}
public class ExamNo04 {
    public static void main(String[] args) {

        //2. 추상 클래스 Calc를 작성해라.
        //A.
        //2.1 필드는 double형 op1, op2가 있고, 두 개는 피연산자다.
        //2.2 void set(double op1, double op2); 메서드는 필드값을 설정한다.(초기화)
        //        2.3 double calculate()는 추상 메서드로 Calc를 상속받아 사용하는
        //클래스의 목적에 맞는 연산 실행하고 결과를 반환한다.
        //        B.
        //        C.
        //        Add, Sub, Mul, Div클래스는 Calc를 상속받아 클래스 이름에 맞는 연산을
        //하도록 구현해라.
        //메인 메소드에서 다음 실행결과와 같이 두 개의 정수와 연산자를 입력받은 후
        //Add, Sub, Mul, Div 중 연산자를 처리할 수 있는 객체를 생성하고 set()와
        //calculate()를 호출하여 결과값을 화면에 출력해라.(switch-case)
        //실행결과) 두 피연산자와 연산자 입력: 10 5 /
         //       답: 2.0
        Calc calc=new Add();

        Scanner scanner=new Scanner(System.in);
        System.out.println("첫번째 숫자를 입력하시오");
        int op1=scanner.nextInt();
        System.out.println("두번째 숫자를 입력하시오");
        int op2=scanner.nextInt();
        System.out.println("연산자를 입력하시오");
        char calValue=scanner.next().charAt(0);

        switch (calValue){
            case '+':

        }
    }
}
