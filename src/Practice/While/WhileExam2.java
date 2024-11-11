package Practice.While;

public class WhileExam2 {
    public static void main(String[] args){

        int n=1;
        while(n<=99){
            if(n%2==0 || n%3==0){
                System.out.println(n);
            }
            n++;
        }
    }
}