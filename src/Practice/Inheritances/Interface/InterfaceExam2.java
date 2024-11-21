package Practice.Inheritances.Interface;
interface A{
    void funcA();
}
interface  B{
    void funcB();
}
interface C extends A, B {
    void funcC();
}
class D implements C {
    @Override
    public void funcA(){
        System.out.println("funcA");
    }
    @Override
    public void funcB(){
        System.out.println("funcB");
    }
    @Override
    public void funcC(){
        System.out.println("funcC");
    }
}
public class InterfaceExam2 {
    public static void main(String[] args) {

        D d1=new D();
        //인터페이스에서 객체 생성이  불가능하기 때문에 상속받은 클래스 D 에서 객체 생성 해 줌
        A a1=d1; //업캐스팅
        a1.funcA();

        B b1=d1;
        b1.funcB();

        C c1=d1;
        c1.funcC();
    }
}
