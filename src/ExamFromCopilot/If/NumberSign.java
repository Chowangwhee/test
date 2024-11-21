package ExamFromCopilot.If;

import java.util.Scanner;

public class NumberSign {
    public static void main(String[] args) {

        //문제 2: 양수, 음수, 0 판별하기
        //사용자가 입력한 숫자가 양수인지 음수인지 또는 0인지 판별하는 프로그램을 작성하세요.

        Scanner scanner=new Scanner(System.in);

        System.out.println("숫자를 입력하시오.");
        double a= scanner.nextDouble();
        if(a>=1){
            System.out.println("입력하신 숫자는 양수 입니다.");
        }else if(a<=-1){
            System.out.println("입력하신 숫자는 음수 입니다.");
        }else{
            System.out.println("입력하신 숫자는 0 입니다.");
        }

    }
}
