package Practice.Method;

import java.util.Scanner;

public class MethodExam10 {
    static void cal(char a, int b, int c){

        switch(a){
            case '+':
                System.out.println(b+c);
                break;
            case '-':
                System.out.println(b-c);

        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        char a=s.next().charAt(0);
        int b=s.nextInt();
        int c= s.nextInt();

        cal(a,b,c);                         //함수 호출
    }
}
