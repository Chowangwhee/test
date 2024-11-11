package Exam241111;

import java.util.Scanner;

interface Cal{
    int a = 0;
    int b=0;

    public int cal(int a, int b);
}
class Show implements Cal{

    @Override
    public int cal(int a,int b){
        int sum=0;
        for(int i=a;i<=b;i++){
            sum+=i;
        }
        return sum;
    }
}
public class ExamNo01 {
    public static void main(String[] args) {

        //1. 다음 main()을 보고 코드를 작성해라. (Cal은 인터페이스, a,b,는 두 정수를 입력받아 a부터 b까지 총합)

        Cal c= new Show();

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        System.out.println(c.cal(a,b));
    }
}
