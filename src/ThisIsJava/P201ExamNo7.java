package ThisIsJava;

public class P201ExamNo7 {
    public static void main(String[] args) {

        System.out.println("7. 주어진 배열 항목에서 최대값을 출력하는 코드를 작성해 보세요(for 문 이용).");

        int[] array = { 1, 5, 3, 8, 2 };

        int sum=0;

        for(int num=0;num< array.length;num++){
            if(sum<array[num]){
                sum=array[num];
            }

        }
        System.out.println(sum);

    }
}
