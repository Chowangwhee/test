package Practice.Thread;

class Music extends Thread{
    String name;
    Music(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name);
        }
    }
}
class Movie implements Runnable{
    String name;
    Movie(String name){
        this.name=name;
    }
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println(name);
        }
    }
}
public class ThreadAndRunnable {
    public static void main(String[] args) {

        Music m=new Music("음악 재생");
        m.start();  //10번 출력

        Movie m1=new Movie("영화 재생");
        Thread t=new Thread(m1);
        t.start();

        try{
            m.join();
            t.join();
        }catch (Exception e){}

    }
}
