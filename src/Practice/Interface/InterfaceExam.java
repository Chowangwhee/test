package Practice.Interface;

//interface 는 추상적인 기본 베이스를 가지고 있다.
interface Addin{
    public int add(int a, int b);
    public int add(int a);

    default void pr(){
        System.out.println("히히");
    }
    //default 라는 예약어를 제시하지 않으면 추상메소드로 인식한다
}
class Add implements Addin {

    @Override
    public int add(int a, int b){
        return a+b;
    }
    @Override
    public int add(int a){
        int sum=0;
        for(int i=1;i<=a;i++){
            sum+=i;
        }
        return sum;
    }
}

public class InterfaceExam {
    public static void main(String[] args)  {

        Add a=new Add();
        System.out.println(a.add(1,4));
        System.out.println(a.add(10));  //1~10까지 합
    }

}

