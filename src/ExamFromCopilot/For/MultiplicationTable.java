package ExamFromCopilot.For;

public class MultiplicationTable {
    public static void main(String[] args) {

        //문제 2: 구구단 출력하기
        //사용자가 입력한 숫자의 구구단을 출력하는 프로그램을 작성하세요.

        int[][] a=new int[9][9];
        int m=0;

        for(int i=1;i<=a.length;i++){
            for(int j=1;j<=a.length;j++){
                m=i*j;
                System.out.println(i+"x"+j+"="+m);
            }
        }
    }
}
