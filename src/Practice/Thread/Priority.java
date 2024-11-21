package Practice.Thread;
class Pri extends Thread{
    Pri(int n){
        setPriority(n);     //스레드 우선순위 세팅
    }
    @Override
    public void run(){
        System.out.println(getPriority());
        //스레드 우선순위 알아 냄
    }
}

public class Priority {
    public static void main(String[] args) {

        //스레드의 우선순위를 정할 수 있다.
        Pri t1=new Pri(Thread.MAX_PRIORITY);
        Pri t2=new Pri(Thread.MIN_PRIORITY);
        Pri t3=new Pri(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();

    }
}
