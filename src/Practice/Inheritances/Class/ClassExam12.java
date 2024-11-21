package Practice.Inheritances.Class;

class Person{
    private String name;
    Person(String name){//        this.name.name;
        this.name=name;
    }
    void name(){
        System.out.println(name);
    }
}
class Student extends Person{
    private String major;
    private String school;

    Student(String name, String major, String school){
        super(name);
        //부모생성자를 불러올 때 super 키워드는 생성자의 첫번째 줄에만 생성가능
        this.major=major;
        this.school=school;
    }
    void show(){
        name();
        System.out.println(major);
        System.out.println(school);
    }
}
public class ClassExam12 {
    public static void main(String[] args) {

        //    Person p=new Person("승민");
        //    p.name();

        Student s=new Student("승민","컴퓨터","컴공");
        s.show();

    }
}