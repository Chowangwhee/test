package Practice.Inheritances.Method;

import java.util.Scanner;

public class MethodExam11 {
    static int in(int p){
        return p;
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int n= s.nextInt();

        System.out.println(in(n));  //입력한 정수 출력
    }
}
