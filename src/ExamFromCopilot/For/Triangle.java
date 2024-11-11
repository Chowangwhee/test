package ExamFromCopilot.For;

public class Triangle {
    public static void main(String[] args) {

        //문제 4: 별로 삼각형 출력하기
        //별을 이용하여 삼각형을 출력하는 프로그램을 작성하세요.

        for(int i=0;i<5;i++){
            for(int j=5;j>5-i;j--)
                System.out.print(" ");
            for(int k=0;k<5-i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<6;i++){
            for(int j=1;j<6-i;j++)
                System.out.print(" ");
            for(int k=6;k>6-i;k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
