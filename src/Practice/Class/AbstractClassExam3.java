package Practice.Class;
import java.util.Scanner;

abstract class Circle2{
    protected double r;

    Circle2(double r){
        this.r=r;
    }
    abstract double get();
}
class Cir extends Circle2{
    Cir(double r){
        super(r);
    }
    @Override
    double get(){
        return r;
    }
}
public class AbstractClassExam3 {
    public static void main(String[] args)  {

        Scanner s=new Scanner(System.in);
        //객체배열
        Circle2 c[]=new Circle2[5];//Circle 객체

        for(int i=0;i<c.length;i++){
            double r=s.nextDouble();
            c[i]=new Cir(r);
            System.out.println(c[i].get());
        }
    }
}
