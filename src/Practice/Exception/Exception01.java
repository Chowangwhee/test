package Practice.Exception;
import java.util.Scanner;

class Num extends Exception{    //상위 클래스 Exception을 상속받음
    Num(){
        super("잘못된 값");      //부모 생성자 호출
    }
}
public class Exception01 {
    static int in() throws Num {    //값을 입력받아 예외발생여부 검토
        Scanner s=new Scanner(System.in);
        int n= s.nextInt();

        if(n<0){
            Num num= new Num();
            throw num;
        }
        return n;
    }
    public static void main(String[] args) {

        System.out.println("양수 입력");

        try{            //예외발생 가능성이 있는 코드
            int n=in();
            System.out.println(n);
        }catch (Exception e){       //예외처리
            System.out.println(e.getMessage());
        }
    }
}
