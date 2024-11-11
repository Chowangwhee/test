package ThisIsJava;

public class P201ExamNo8 {
    public static void main(String[] args) {

        System.out.println("8. 주어진 배열 항목의 전체 합과 평균을 구해 출력하는 코드를 작성해 보세요.");

        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };

        int sum=0;
        int count=0;

        for (int num1=0;num1< array.length;num1++){
            for (int num2=0;num2< array[num1].length;num2++){
                sum+=array[num1][num2];
                count++;
            }
        }


    System.out.println("배열의 합: "+sum+"\n배열의 평균: "+(double)sum/count);
    }
}
