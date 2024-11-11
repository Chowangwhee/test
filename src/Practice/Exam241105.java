package Practice;

class Cal {
    int a;
    int b;

    static int add(int a, int b) {
        return a + b;
    }

    static int div(int a, int b) {
        return a / b;
    }
}
public class Exam241105 {
    public static void main(String[] args) {

        int a=Cal.add(10,5); //합

        int b=Cal.div(10,5); //몫

        System.out.println(a +" " +b);

    }
}