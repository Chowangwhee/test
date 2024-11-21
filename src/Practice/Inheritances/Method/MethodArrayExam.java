package Practice.Inheritances.Method;

import java.util.Scanner;

public class MethodArrayExam {
    static int big(int ary[]){  //a[]
        int max=0;

        for(int i=0;i< ary.length;i++){
            if(max<ary[i]){
                max=ary[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        //정수 7개 배열 생성
        int a[]=new int[7];

        for(int i=0;i<a.length;i++){
            a[i]= s.nextInt();
        }
        System.out.println(big(a));         //7개 정수 중 제일 큰 값 출력

        //배열을 호출 할 때 배열명만 입력
    }
}
