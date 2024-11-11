package Practice;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        System.out.println("한 문자 입력");

        char c= scanner.next().charAt(0);
        int n=(int)c;

        for(int i=97;i<=n;i++){                 //i=97, i=98
            for(int j=i;j<n;j++){               //j=97, i=97,98
                char ch=(char)j;                //a b
                System.out.print(ch);
            }
        }

        System.out.println();
    }
}
