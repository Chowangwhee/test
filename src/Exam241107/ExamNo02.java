package Exam241107;

interface Po{
    void pr(int a,String b);
    void pr(String c);
}
class Point implements Po{

    @Override
    public void pr(int a,String b){
        System.out.println(b+"책은 "+a+"원");
    }

    @Override
    public void pr(String c) {
        System.out.println(c);
    }
}
public class ExamNo02 {
    public static void main(String[] args) {

        Po p=new Point();

        p.pr(30000,"java");

        p.pr("python");
    }
}
