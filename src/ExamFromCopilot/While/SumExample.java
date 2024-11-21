package ExamFromCopilot.While;

public class SumExample {
    public static void main(String[] args) {

        //문제 1: 1부터 10까지의 합 구하기
        //1부터 10까지의 정수를 더하여 합을 출력하는 프로그램을 작성하세요.

        int summaryValue=0;
        int level=0;

        while(level<10){
            level++;
            summaryValue+=level;
        }
        System.out.println("1부터 10까지 정수들의 총합은 "+summaryValue+"입니다.");
    }
}
