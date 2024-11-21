package Practice.Lambda;
interface A{
    void show();
}

public class ExampleNo02 {
    public static void main(String[] args) {

        A a=()-> System.out.println("hi");
        a.show();

        a=()-> System.out.println("안녕");
        a.show();
    }
}
