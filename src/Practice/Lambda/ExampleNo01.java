package Practice.Lambda;
@FunctionalInterface
interface Function{
    int cal(int x);
}
public class ExampleNo01 {
    public static void main(String[] args) {

        Function f=x->x*x;

        System.out.println(f.cal(3));

    }
}
