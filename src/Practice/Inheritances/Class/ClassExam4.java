package Practice.Inheritances.Class;

class Shape{
    //인스턴스 필드 선언
    int a,b;
    String str;
    //생성자 선언
    Shape(){
        this(1,3);
    }
    Shape(int a, int b){
        this.a=a;
        this.b=b;
    }

    //인스턴스 메소드 구현

    void pr(String str){
        this.str=str;
    }
    void show(){
        for(int i=1;i<=a;i++){
            for(int j=1;j<=b;j++){
                System.out.println(str);
            }
            System.out.println();
        }
    }
}
public class ClassExam4 {
    public static void main(String[] args) {

        Shape s = new Shape();

        Shape s1 = new Shape(2,5);

        s.pr("@");

        s1.pr("#");

        s.show(); //@@@-> 1행 3열로 출력

        s.show(); //#####->2행 5열로 출력

        //#####

    }
}