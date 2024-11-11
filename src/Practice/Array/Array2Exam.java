package Practice.Array;

public class Array2Exam {
    public static void main(String[] args) {

        //하나의 문자 5행5열 구조
        char a[][]=new char[5][5];
        //실수형 5행 2열 구조
        double [][]b=new double[5][2];

        //정수배열 선언해서 초기화 함
        int c[][]={{1,2,3},{4,5,6}};            //2행 3열

        for(int i=0;i<2;i++){                   //i=0,1
            for(int j=0;j<3;j++){               //j=0,1,2
                System.out.println(c[i][j]);
            }
        }
        /*  c[0][0]=1;
            c[0][1]=2;
            c[0][2]=3;
            c[1][0]=4;
            c[1][1]=5;
            c[1][2]=6; */
    }
}

