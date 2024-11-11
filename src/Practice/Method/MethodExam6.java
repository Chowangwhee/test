package Practice.Method;

public class MethodExam6 {
    static int multi(int a,int b){
        int m=1;

        for(int i=1;i<=b;i++){  //횟수
            m=m*a;
        }
        return m;
    }
    public static void main(String[] args) {

        System.out.println(multi(2,10));

        //2의 10승
        //2*2*2*2*2*2*2*2*2*2
    }
}
