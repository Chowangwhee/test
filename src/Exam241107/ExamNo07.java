package Exam241107;

interface Figure{
    void circle_area();
    void rec_area();

}
class Circle implements Figure{
    int a;
    Circle(int a){
        this.a=a;
    }
    public void circle_area() {
        System.out.println("원 면적 : "+(3.14)*a*a);
    }
    public void rec_area(){}
}
class Rec implements Figure{
    int a,b;
    Rec(int a, int b){
        this.a=a;
        this.b=b;
    }
    public void circle_area(){}
    public void rec_area(){
        System.out.println("사각형의 면적 : "+(a*b));
    }
}

public class ExamNo07 {
    public static void main(String[] args) {

        //5. main 세팅을 아래와 같이 하고, Figure 인터페이스를 새로 세팅하여
        // circle_area()에는 원 면적, rec_area에는 사각형의 면적을 출력하시오.

        Figure f1=new Circle(5);
        Figure f2=new Rec(2,5);
        f1.circle_area();
        f2.rec_area();

    }
}

