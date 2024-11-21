package Practice.Inheritances.Class;

class Circle1{
    private int r;

    public Circle1(int r){
        this.r=r;
    }
    protected int get(){
        return r;
    }
}
class NCircle extends Circle1 {
    String color;

    NCircle(int r,String c){
        super(r);
        color=c;
    }
    void show(){
        System.out.println("반지름: "+get()+"\n"+color+"색");
    }
}
public class ClassOverrideExam2 {
    public static void main(String[] args) {

    NCircle n=new NCircle(10,"red");
    n.show();

    }
}