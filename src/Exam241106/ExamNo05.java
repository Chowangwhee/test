package Exam241106;
class XY{

    private int x,y;

    XY(int x, int y){

        this.x=x; this.y=y; }

    int getx(){

        return x; }

    int gety(){

        return y;}

    protected void move(int x, int y){

        this.x=x;

        this.y=y;

    }
}
class XYZ extends XY{
    String color;
    XYZ(int x, int y, String color){
        super(x,y);
        this.color=color;
    }
    void setxy(int x,int y){
        this.move(x,y);
    }
    void setcolor(String color){
        this.color=color;
    }
    void show(){
        System.out.println(getx()+","+gety()+"인 "+color+"색!");
    }
}
public class ExamNo05 {
    public static void main(String[] args)  {

        System.out.println("5. main(), XY클래스를 보고 XY를 상속받는 XYZ 클래스를 작성해라.");

        XYZ xyz= new XYZ(10,10, "red");

        xyz.setxy(20,30);

        xyz.setcolor("blue");

        xyz.show();

        System.out.println("실행결과) 20,30인 blue색!");

    }

}
