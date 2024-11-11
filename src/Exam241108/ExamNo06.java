package Exam241108;
class Number{
    int a;


    static void pr(int a){
        System.out.println(a);
    }
    void show(double b){
        System.out.println(b);
    }
}
public class ExamNo06 {
    public static void main(String[] args) {

        //1. 다음 main()을보고 pr함수와 show함수를작성해라.(Number는클래스명)

        //        pr, show함수는 매개변수 데이터 출력

            Number.pr(100);
            Number n=new Number();
            n.show(3.14);
    }
}
