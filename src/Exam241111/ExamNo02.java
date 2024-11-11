package Exam241111;

class Gen<T>{
    T a,b;

    Gen(T a,T b){
        this.a=a;
        this.b=b;
    }
    T one(){
        return a;
    }
    T two(){
        return b;
    }
    boolean three(){
        if(a.equals(b)){
            return true;
        }
        return false;
    }
}
public class ExamNo02 {
    public static void main(String[] args) {

        //2. 다음 main()을 보고 Gen클래스를 만들어라.

        Gen<String> g=new Gen<String>("seoul","busan");

        System.out.println(g.one()); //seoul 출력

        System.out.println(g.two()); //busan 출력

        System.out.println(g.three()); //false 출력 (두 문자열 비교)
    }
}
