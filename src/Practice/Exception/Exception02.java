package Practice.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception02 {
    public static void main(String[] args)  {

        Scanner scanner=new Scanner(System.in);

        //정수 5개 넣을 수 있는 배열
        int n[]=new int[5];
        int cnt=0;
        int sum=0;

        while(cnt<5){
            try{
                System.out.println((cnt+1)+"번째 정수");
                n[cnt]=scanner.nextInt();   //배열에 [0]부터 입력함
                //n[0],n[1],n[2],n[3],n[4]
                sum+=n[cnt];
                cnt++;
            }catch (InputMismatchException e){
                System.out.println("정수가 아닙니다. 다시 입력해 주세요.");
                scanner.next(); //오입력시 앞 토큰 지우기
                continue;
            }
        }
        System.out.println("총합 : "+sum);

    }

}
