package Exam241105;


public class ExamNo06 {
    public static void main(String[] args) {

        System.out.println("6. 배열 안에서 제일 높은 점수를 리턴받는 get함수를작성해라.");

        int[][] grade = {{55, 60, 65}, {85, 90, 95}};

        int high;

        high= get(grade);

        System.out.println("가장 높은 점수는 " + high+ "점 입니다.");

    }
    static int get(int[][] a) {
        int highest =a[0][0];
        for (int i = 0; i < a[i].length; i++) {
            for (int j = 0; j < a[j].length; j++) {
                if (highest < a[i][j]) {
                    highest = a[i][j];
                }
            }
        }
        return highest;
    }
}