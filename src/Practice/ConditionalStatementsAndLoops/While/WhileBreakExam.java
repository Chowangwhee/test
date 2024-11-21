package Practice.ConditionalStatementsAndLoops.While;

import java.util.Scanner;

public class WhileBreakExam {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        while(true){
            System.out.println("이름 입력");
            String name=scanner.next();

            if(name.equals("길동")){
                break;
            }
            System.out.println(name);
        }
    }
}
