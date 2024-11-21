package Practice.Inheritances.Class;
class Rectangle{
    int width;
    int height;

    int getArea(){
        return width*height;
    }
    Rectangle(int a,int b){
        width=a;
        height=b;
    }
    Rectangle(){
        this(3,2);
        //width=3;
       //height=2;
    }
}
public class ClassExam {
    public static void main(String[] args) {

        Rectangle r=new Rectangle(10,20);
        Rectangle r1=new Rectangle();

        //r.width=4;
        //r.height=3;
        System.out.println(r.getArea());

        System.out.println(r1.getArea());

    }
}
