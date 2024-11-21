package Exam241113;
class Timer extends Thread{
    @Override
    public void run(){
        System.out.println("go to bed");
        for(int i=0;i<10;i++){
            try{
                sleep(1000);
                System.out.println("sleeping..");
            }catch (Exception e){}
        }
        System.out.println("Just woke up now");
    }
}
public class ExampleNo03 {
    public static void main(String[] args) {

        Timer t = new Timer();
        t.start();

        //3. Main()를 보고 클래스 작성해라. (0~10까지 1초동안 잠을 잔 후 깨워라)

    }
}
