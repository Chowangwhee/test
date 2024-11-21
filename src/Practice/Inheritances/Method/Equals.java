package Practice.Inheritances.Method;

class Point1{
    int a;
    int b;
    Point1(int a,int b){
        this.a=a;
        this.b=b;
    }
    @Override
    public boolean equals(Object obj){
        Point1 p=(Point1)obj;
        if(a==p.a && b==p.b){
            return true;
        }
        else {
            return false;
        }
    }
}
public class Equals {
    public static void main(String[] args) {

        Point1 a=new Point1(1,2);
        Point1 b=new Point1(1,2);
        Point1 c=new Point1(2,3);

        if (a == b) {
            System.out.println("a==b");
        }
        if(a.equals(b)){
            System.out.println("a와 b는 같다");
        }
        if(b.equals(c)){
            System.out.println("b와 c는 같다");
        }
    }
}
