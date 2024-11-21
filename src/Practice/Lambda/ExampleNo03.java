package Practice.Lambda;
interface B{
    int cal(int x,int y);
}

public class ExampleNo03 {
    static void pr(int x,int y, B b){
        System.out.println(b.cal(4,2));
    }
    public static void main(String[] args) {

        pr(3,4,(x,y)->x+y);

    }
}
