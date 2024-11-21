package Practice.Inheritances.Method;

public class MethodExam9 {
    static int a;               //전역 변수(global variable)

    static void aa(){
        a=10;
    }
    static void bb(){
        int a=20;               //지역 변수(local variable)
    }
    public static void main(String[] args) {

        aa();                   //a=10
        bb();                   //b=20

        System.out.println(a);
    }
}
