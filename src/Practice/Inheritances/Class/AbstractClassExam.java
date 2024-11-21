package Practice.Inheritances.Class;
//추상클래스 안에는 일반적인 메소드, 추상메소드 둘 다 가능
//추상메소드는 반드시 추상클래스에 있어야 한다
abstract class Car1{
    String name;//필드

    void run(){//메소드
        System.out.println("차가 움직인다.");
    }
    abstract void stop();//추상메소드(빈 껍데기 함수)
}
class Cars extends Car1{
    Cars(){
        name="쏘나타";
    }
    @Override
    void stop(){
        System.out.println("차가 멈춘다");
    }
}
public class AbstractClassExam {
    public static void main(String[] args) {
        //추상클래스는 객체 생성 불가능
        //Car c=new Car(); 컴파일 오류
        Car1 c=new Cars();
        c.run();
        c.stop();
    }
}