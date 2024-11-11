package ExamFromCopilot.For;

public class SumExample {
    public static void main(String[] args) {

        //문제 1: 1부터 10까지의 합 구하기
        //1부터 10까지의 정수를 더하여 합을 출력하는 프로그램을 작성하세요.

        int sum=0;

        for(int i=0;i<=10;i++){
            System.out.print(sum+"+"+i+"=");
            sum+=i;
            System.out.println(sum);
        }
        System.out.println("합계 : "+sum);
    }

}
