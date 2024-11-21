package ThisIsJava.ch15.VerificationNo10;

public class Student implements Comparable<Object> {
    public String id;
    public int score;

    public Student(String id, int score){
        this.id=id;
        this.score=score;
    }
    @Override
    public int compareTo(Object object){
        Student student=(Student)object;
        if(score<student.score)return -1;
        else if(score==student.score)return 0;
        else return 1;
    }
}
