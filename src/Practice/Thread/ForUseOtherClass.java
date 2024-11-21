package Practice.Thread;

class Share{
    int sum=0;

    synchronized void add(){
        int n=sum;
        Thread.yield();     //현재 실행중인 다른 스레드가끝날때까지 대기
        n+=10;
        sum=n;
        System.out.println(sum);
        //현재 스레드의 이름과 sum을 호출
        System.out.println(Thread.currentThread().getName()+" "+sum);
    }
    int getSum(){
        return sum;
    }
}
class Student extends Thread{
    Share share;            //다른 클래스 안의 함수를 활용하기 위해 해당 클래스 호출
    Student(String name,Share share){
        super(name);        //부모 생성자 호출
        this.share=share;
    }
    @Override
    public void run(){
        for(int i=0;i<5;i++){
            share.add();    //다른 클래스 안의 함수를 5번 호출
        }
    }
}
public class ForUseOtherClass {
    public static void main(String[] args) {

        Share s=new Share();
        Thread t1=new Student("a",s);
        Thread t2=new Student("b",s);
        t1.start();
        t2.start();

    }
}
