package Exam241113;

class Total{
    int sum;
    Total(){
        sum=0; }
    void total(int n){
        sum+=n; }
    int get(){
        return sum; }
}
class AThread extends Thread{
    Total t;
    int a,b;
    AThread(Total t,int a,int b){
        this.t=t;
        this.a=a;
        this.b=b;
    }
    @Override
    public void run(){
        for(int i=a;i<=b;i++){
            t.total(i);
        }
        System.out.println(a+"부터 "+b+"까지의 합은 "+t.get());
    }
}
public class ExampleNo04 {
    public static void main(String[] args) {

        Total t=new Total();
        AThread a=new AThread(t, 1, 50);  //1275
        AThread b=new AThread(t, 51, 100);//5050
        a.start(); b.start();

    }
}
