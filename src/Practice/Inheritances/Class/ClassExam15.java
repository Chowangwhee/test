package Practice.Inheritances.Class;
class Fruit{
    String a;
    int b;
    Fruit(String a, int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println(a+"색의 과일이 "+b+"개 있습니다.");
    }
}
class Apple extends Fruit{
    Apple(String a1, int b1){
        super(a1,b1);
        //this.a=a;
        //this.b=b;
    }
    @Override
    void show(){
        System.out.println(a+"색의 사과가 "+b+"개 있습니다.");
    }
}
public class ClassExam15 {
    public static void main(String[] args) {

        Fruit f1=new Apple("red",10);
        f1.show();
    }
}
