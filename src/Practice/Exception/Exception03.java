package Practice.Exception;
import java.util.InputMismatchException;
import java.util.Scanner;

class Calc{
    public int calculate(int n){
        //1~n까지 홀수만 더한 총합
        int sum=0;

        for(int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            sum+=i;
        }
        return sum;
    }
}
public class Exception03 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        Calc c=new Calc();
        int n;

        while(true){
            try{
                System.out.println("정수를 입력하시오.");
                n= scanner.nextInt();
                if(n>=5 && n<=10){  //5~10까지의 정수가 입력되었을 경우
                    break;  //루프 종료
                }
                System.out.println("다시 입력");    //5~10까지의 정수가 아닐 경우
            }catch (InputMismatchException e){
                System.out.println("다시 입력");
                scanner.next();
            }
        }
        System.out.println(c.calculate(n));
    }
}