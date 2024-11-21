package Practice.Thread;

class Run implements Runnable{
    private String s;

    Run(String s){
        this.s=s;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(s);
            try{
                Thread.sleep(1000); //1초(long)
            }catch (Exception e){}
        }
    }
}
public class ImplementsRunnable {
    public static void main(String[] args) {

        Run run=new Run("스레드1");    //1. 스레드 객체 생성
        Thread thread=new Thread(run);
        thread.start(); //public void run 실행 됨
        //Runnable task=new Run("스레드1");
        //Thread thread=new Thread(task);
        //스레드 시작 -> run 실행 -> JVM에 의해 스케쥴링 되기 시작함

    }
}
