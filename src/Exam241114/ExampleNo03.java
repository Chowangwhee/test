package Exam241114;
import javax.swing.*;

class MovieThread extends Thread{
    String str="영화";
    String getStr(){
        return str;
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            try {
                Thread.yield();
                System.out.println(getName()+": "+getStr()+"를 재생합니다.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class MusicThread implements Runnable {
    String str="음악";
    public void run(){
        for(int i=0;i<3;i++){
            try{
                Thread.yield();
                System.out.println("MusicThread: 음악을 재생합니다.");
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class ExampleNo03 {
    public static void main(String[] args) {

        Thread th1 = new MovieThread();
        th1.start();

        Thread th2 = new Thread(new MusicThread());
        th2.start();

    }
}
