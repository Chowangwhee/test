package ThisIsJava.ch15.VerificationNo08;

public class Student {
    public int studentNum;
    public String name;

    public Student(int studentNum,String name){
        this.studentNum=studentNum;
        this.name=name;
    }
    //여기에 코드를 작성하세요.
    @Override
    public int hashCode(){
        return studentNum;
    }
    @Override
    public boolean equals(Object object){
        Student student=(Student) object;
        if(studentNum==student.studentNum){
            return true;
        }
        return false;
    }
}
