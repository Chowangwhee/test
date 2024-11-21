package Practice.Inheritances.Class;
abstract class Ca{
    abstract int add(int a, int b);
    abstract double avg(int a[]);
}
class Cal1 extends Ca{
    @Override
    int add(int a,int b){
        return a+b;
    }
    @Override
    double avg(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
}
public class AbstractClassExam2 {
    public static void main(String[] args)  {

        Cal1 c=new Cal1();
        System.out.println(c.add(3,7));
        System.out.println(c.avg(new int[]{1,2,3}));
    }
}