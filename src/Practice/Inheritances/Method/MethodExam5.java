package Practice.Inheritances.Method;

public class MethodExam5 {
    static void total(int a,int b){
        int sum=0;

        for(int i=a;i<=b;i++){
            sum+=1;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {

        total(1,10);    //1부터 10까지의 합
        total(1,100);   //1부터 100까지의 합
    }
}
