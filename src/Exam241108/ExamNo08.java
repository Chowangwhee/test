package Exam241108;

interface Person1 {
    String work();
}
class Worker1 implements Person1 {
    @Override
    public String work(){
        return "일한다";
    }
}
class Student1 implements Person1 {
    @Override
    public String work(){
        return "공부한다";
    }
}

public class ExamNo08 {
    static void pr(Person1 p){
        System.out.println(p.work());
    }

    public static void main(String[] args) {

        pr(new Worker1());
        pr(new Student1());

    }
}
