package Practice.Class;
class   AAA{
    void ride(){
        System.out.println("오버라이딩 AAA");
    }
    void load(){
        System.out.println("오버로딩 AAA");
    }
}
class BBB extends AAA {
    @Override
    void ride(){
        System.out.println("오버라이딩 BBB");
    }
    void load(int n){
        System.out.println("오버로딩 BBB");
    }
}
public class ClassOverrideExam {
    public static void main(String[] args) {

        AAA a=new AAA();
        a.ride();
        a.load();

        BBB b=new BBB();
        b.ride();
        b.load(10);

    }
}
