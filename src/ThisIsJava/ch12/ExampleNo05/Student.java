package ThisIsJava.ch12.ExampleNo05;

public class Student {
    private String studentNum;

    public Student(String studentNum){
        this.studentNum=studentNum;
    }
    public String getStudentNum(){
        return studentNum;
    }
    //여기에 코드를 작성하세요.
    @Override
    public boolean equals(Object obj){
        if(this.studentNum==((Student)obj).studentNum){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return Integer.parseInt(studentNum);
    }
}
