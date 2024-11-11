package ThisIsJava.ch04;

public class P140ExamNo3 {
    public static void main(String[] args) {

        System.out.println("3. for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 출력하는 코드를 작성해 보세요.\n");

        int sum=0;

        for(int num=0;num<100;num++){
            if(num%3==0){
                sum+=num;
            }
        }
        System.out.println(">1부터 100까지의 정수 중 3의 배수의 총 합 : "+sum);
    }
}
