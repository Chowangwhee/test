package Practice.Method;

public class MethodExam {
    //리턴 타입 함수 명(매개변수)
    static void pro(int age){
        System.out.println("안녕");
        System.out.println("나이는 "+age+"이다.");
        //반환형이 void인 함수는 대부분 출력문이 들어간다.
    }
    public static void main(String[] args)  {
        //메소드는 반드시 클래스 안에 있어야 함(캡슐화 원칙)

        System.out.println("시작");
        pro(2);                         //함수 호출 -> 함수를 찾아 {} 확인
        pro(53);                        //함수 호출
        System.out.println("끝");
    }
}
