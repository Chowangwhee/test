package Practice.Inheritances.Class;

//부모클래스
class XY1{
    private int x,y;
    void set(int x, int y){
        this.x=x;
        this.y=y;
    }
    public void show(){
        System.out.println(x+","+y);
    }
}
class XYZ1 extends XY1{
    private String name;
    void setname(String name){
        this.name=name;
    }
    void pr(){
        show();
        System.out.println(name);
    }
}
public class ClassExam11 {
    public static void main(String[] args) {

        XY1 x=new XY1();
        x.set(4,8);
        x.show();                           //4,8 출력

        XYZ1 y=new XYZ1();                    //XY를 상속받은 XYZ 클래스
        y.set(6,8);                         //부모클래스로부터 상속받은 메소드
        y.setname("xyz");
        y.pr();
    }
}