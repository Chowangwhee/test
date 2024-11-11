package Exam241108;
class Point{
    int a;
    int b;
    Point(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public String toString(){
        return a+", "+b;
    }
}
public class ExamNo01 {
    public static void main(String[] args) {

        //1. main()를 보고 클래스를 작성해라.

        Point p = new Point(3,4);

        System.out.println(p.toString()); //3, 4출력

    }
}
