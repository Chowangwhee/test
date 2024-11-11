package Practice.Class;

class Score1{
    int a,b;

    Score1(int a, int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println((a+b)/2.0);
    }
}
public class ClassExam7 {
    public static void main(String[] args) {

        Score1 s=new Score1(100,80);

        s.show();
    }
}