package Practice.Method;

public class MethodExam13 {
    static int total(int ary[][]){

        int sum=0;

        for(int i=0;i< ary.length;i++){
            for(int j=0;j<ary[i].length;j++){
                sum+=ary[i][j];
            }

        }
        return sum;
    }
    public static void main(String[] args) {

        int ary[][]={{1,2,3},{4,5}};

        System.out.println(total(ary));
    }
}
