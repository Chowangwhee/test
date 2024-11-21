package Practice.Inheritances.Class;
class Num{
    int n;
    Num(int n){
        this.n=n;
    }
    int get(){
        return n;
    }
}
public class ClassExam17 {
    public static void main(String[] args)  {

        Num[] ary = new Num[]{new Num(1),new Num(2),new Num(3)};

        for(Num n:ary){
            System.out.println(n.get());
        }
    }
}
