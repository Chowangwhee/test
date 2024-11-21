package Exam241113;
class Th implements Runnable{
    String string;
    Th(String string){
        this.string=string;
    }
    @Override
    public void run(){
        System.out.println(string);
    }
}
public class ExampleNo02 {
    public static void main(String[] args) {

        Th t=new Th("쓰레드 1");
        Thread th=new Thread(t);
        th.start();

        //2. Main()를 보고 “쓰레드1”을 출력해라.
    }
}
