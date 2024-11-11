package Exam241105;

import java.util.Scanner;

public class ExamNo05 {
    public static void main(String[] args) {

        System.out.println("5. 두 사람이 가위바위보를 한다. 가위,바위,보 중 하나를"
                +"문자열로 입력받아 누가 이겼는지 판단하는 프로그램을작성해라."
                +"(중첩 if문 사용해야함, 문자열 비교)");
        System.out.println("실행결과) 영수 : 가위\n"
                +"철수 : 보\n"
                +"철수가 이겼다.\n");

        Scanner scanner=new Scanner(System.in);

        System.out.println("영수,철수: 가위, 바위, 보!");
        System.out.println("영수: ");
        String boy1=scanner.next();
        System.out.println("철수: ");
        String boy2=scanner.next();
        if(boy1.equals("가위")) {
            if(boy2.equals("바위")){
                System.out.println("철수가 이겼다.");
            }else if(boy2.equals("보")) {
                System.out.println("영수가 이겼다.");
            }else{System.out.println("비겼다");}
        }
        else if(boy1.equals("바위")){
            if(boy2.equals("보")){
                System.out.println("철수가 이겼다.");
            }else if(boy2.equals("가위")) {
                System.out.println("영수가 이겼다.");
            }else{System.out.println("비겼다");}
        }
        else if(boy1.equals("보")){
            if(boy2.equals("가위")){
                System.out.println("철수가 이겼다.");
            }else if(boy2.equals("바위")) {
                System.out.println("영수가 이겼다.");
            }else{System.out.println("비겼다");}
        }

        System.out.println("5. 직삼각형 출력해라");
        //   0
        //  012
        // 01234
        //0123456

        for(int i=0;i<7;i++){
            for(int j=4;j==0;j--){

            }
        }
    }
}