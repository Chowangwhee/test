package Practice.For;

public class ForExam4 {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){               //행을 기준으로
            for(int j=0;j<4-i;j++){         //공백 출력
                System.out.print(" ");
            }
            int n=1;
            for(int k=0;k<(i*2)+1;k++){     //갯수 만큼
                System.out.print(n);
                n++;                        //정수를 1부터 하나씩 증가
            }
            for(int l=0;l<4-i;l++){
                System.out.print(" ");
            }
            System.out.println();           //공백, 정수 출력한 후 줄 바꿈
        }

    }
}
