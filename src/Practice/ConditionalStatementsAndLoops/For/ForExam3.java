package Practice.ConditionalStatementsAndLoops.For;

public class ForExam3 {
    public static void main(String[] args) {

        for(int m=2;m<=9;m++){
            for(int n = 1; n <=9; n++){
                System.out.println(m*n);
            }
        }
    }
}//바깔 for문을 기준으로 안쪽 for문이 반복된다
/*ex)    m = 2_n = 1
         m = 2_n = 2
         m = 2_n = 3
         m = 2_n = 4
         m = 2_n = 5
         m = 2_n = 6
         m = 2_n = 7
         m = 2_n = 8
         m = 2_n = 9
         m = 3_n = 1*/
