package Practice.While;

import java.util.Scanner;

public class DoWhileExam {
    public static void main(String[] args) {

        String str;
        Scanner scanner=new Scanner(System.in);

        do{
            System.out.println("문자열 입력");
            str=scanner.next();

            if(str.equals("exit")){
                System.out.println("프로그램 종료");
            }
            else{
                System.out.println(str);
            }
        }while(!str.equals("exit"));
    }
}
