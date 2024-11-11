package ExamFromCopilot.While;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        //문제 2: 숫자 맞추기 게임
        //사용자가 맞출 때까지 숫자를 입력받는 프로그램을 작성하세요.

        Scanner scanner=new Scanner(System.in);

        System.out.println("1부터 100까지의 숫자 중 하나를 입력하시오.");
        int s=scanner.nextInt();
        int r=(int)(Math.random()*(100))+1;
        int count=1;

        Boolean inputValue=false;
        while(!inputValue){
            if(s==r){
                System.out.println("정답이다!");
                System.out.println("시도한 횟수는 "+count+"번이다.");
                inputValue=true;
            }
            else if(s>r){
                System.out.println(s+"보다 작다!");
                System.out.println("숫자를 입력하시오.");
                s=scanner.nextInt();
                count++;
            }
            else if(s<r){
                System.out.println(s+"보다 크다!");
                System.out.println("숫자를 입력하시오.");
                s=scanner.nextInt();
                count++;
            }
        }
    }
}
