package ExamFromCopilot.For;

public class ArrayPrint {
    public static void main(String[] args) {

        //문제 3: 배열의 모든 요소 출력하기
        //정수 배열의 모든 요소를 출력하는 프로그램을 작성하세요.

        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8}, {9, 10, 11, 12}};

        for (int i = 0; i < a[0].length; i++) {
            System.out.println(a[0][i]);
        }
        for (int j = 0; j < a[1].length; j++) {
            System.out.println(a[1][j]);
        }
        for (int k = 0; k < a[2].length; k++) {
            System.out.println(a[2][k]);
        }
    }
}
