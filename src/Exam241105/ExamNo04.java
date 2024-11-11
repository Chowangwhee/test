package Exam241105;
class XY{
    int x;
    int y;
    void set(int x,int y){
        this.x=x;
        this.y=y;
    }
    void show(){
        System.out.println(x+","+y);
    }
}
class XYZ extends XY {
    String color;
    void color(String color){
        this.color=color;
    }
    void show(){
        System.out.println(x+","+y+","+color);
    }

}
public class ExamNo04 {
    public static void main(String[] args) {

        System.out.println("4. Main()를 보고 클래스 구현해라"
                +"(XY는 슈퍼클래스, XYZ는 서브클래스)");

        XY x= new XY();

        x.set(1,2);

        x.show(); //1,2 출력

        XYZ xy=new XYZ();

        xy.set(4,5);

        xy.color("blue");

        xy.show(); //4,5,blue 출력
    }
}
