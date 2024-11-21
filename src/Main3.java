import java.util.Random;

class Account{
    int money=3000;

    synchronized void deposit(int n){
        money+=n;
        System.out.println(money+"원이 입금되었습니다.");
    }
    synchronized void withdraw(int n){
        if(money>=n){
            money-=n;
            System.out.println(money+"원이 출금되었습니다.");
        }else{
            System.out.println("출금이 거절되었습니다.(사유:잔액부족)");
        }
    }
    void show(){
        System.out.println("잔액: "+money);
    }
}

class Bank implements Runnable{
    Account account;
    Random r=new Random();
    Bank(Account account){
        this.account=account;
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            int n= r.nextInt(1000)+1;

            if(r.nextBoolean()){
                account.deposit(n);
            }
            else {
                account.withdraw(n);
            }
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){}
        }
    }
}
public class Main3 {
    public static void main(String[] args) {

        Account account=new Account();  //공유 계좌

        //3개의 스레드
        Thread t1=new Thread(new Bank(account),"홍길동");
        Thread t2=new Thread(new Bank(account),"김길동");
        Thread t3=new Thread(new Bank(account),"박길동");

        t1.start(); //run()
        t2.start();
        t3.start();

        //모든 스레드가 완료될때까지 대기
        try{
            t1.join();
            t2.join();
            t3.join();
        }catch (Exception e){}

        account.show();

    }
}
