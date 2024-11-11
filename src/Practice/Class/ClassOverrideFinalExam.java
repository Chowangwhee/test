package Practice.Class;

class Car{
    public int gas;                         //필드

    public void up(){
        gas+=1;
        System.out.println(gas);
    }
    public final void stop(){               //final: 자식 클래스에서 오버라이드 할 수 없다
        System.out.println("stop");
        gas=0;
    }
}
class SportsCar extends Car {
    @Override
    public void up(){                       //재정의 오버라이딩
        gas+=100;
        System.out.println(gas);
    }
}
public class ClassOverrideFinalExam {
    public static void main(String[] args) {

        Car c=new Car();
        c.gas=0;
        c.stop();
        c.up();

        SportsCar s=new SportsCar();
        s.stop();
        s.up();

    }
}
