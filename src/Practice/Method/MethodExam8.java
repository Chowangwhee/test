package Practice.Method;

public class MethodExam8 {

    static void in(){
        int a=10;               //지역변수

        System.out.println(a);
    }
    public static void main(String[] args) {

        int a=0;                //지역 변수(Local Variable)

        in();                   //함수 호출

        System.out.println(a);
    }
}
