package ThisIsJava.ch05;

public class P201ExamNo6 {
    public static void main(String[] args) {

        System.out.println("6. 다음은 배열 길이를 출력하는 코드입니다. 실핼 결과를 작성해 보세요.");

        int[][] array = {
                {95, 86},
                {83, 92, 96},               //첫번째로 출력
                {78, 83, 93, 87, 88}        //두번째로 출력
        };

        System.out.println(array.length);
        System.out.println(array[2].length);
    }
}
