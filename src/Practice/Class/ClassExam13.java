package Practice.Class;

class Person1{
    String name;
    String id;

    public Person1(String name){                 //인스턴스 생성자
        this.name=name;
    }
    void show(){
        System.out.println("AA");
    }
}
class Student1 extends Person1 {                  //자식클래스
    String aa;
    Student1(String name){
        super(name);                            //부모생성자 호출
    }
    @Override
    void show(){
        System.out.println("BB");
    }
    void pr(){
        System.out.println("CC");
    }
}

public class ClassExam13 {
    public static void main(String[] args) {

        Person1 p=new Student1("길동");    //upcasting
        //Student1 s=new Student1("길동");
        Student1 s=(Student1) p;               //downcasting
        System.out.println(s.name);
        p.id="aa";
        p.name="rr";
        s.aa="33";

        p.show();
        s.pr();
    }
}
