package Practice.Array;

public class Array2Exam3 {
    public static void main(String[] args) {

        //2행 4열
        int[][] ary = {{1, 2, 3, 4}, {5, 6, 7, 8}};

        //4행 2열
        int[][] ary1 = new int[4][2];

        for (int i = 0; i < ary.length; i++)
        {
            for (int j = 0; j < ary[i].length; j++) {
                ary1[j][i] = ary[i][j];
            }
        }

        for (int i = 0; i < ary1.length; i++) {
            for (int j = 0; j < ary1.length; j++) {
                System.out.print(ary1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
