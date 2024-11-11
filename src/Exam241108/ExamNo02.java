package Exam241108;

class Circle {
    int a;

    Circle(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        Circle c = (Circle) o;
        if (a == c.a) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public String toString(){
        return ":"+a;
    }
}
public class ExamNo02 {
    public static void main(String[] args) {

        //2. equals(두 원의 면적이 같은지 비교), toString메소드를 사용하여 완성시켜라.

        //(반지름이 30임)

        Circle a=new Circle(30);

        Circle b=new Circle(30);

        System.out.println("반지름"+a);

        System.out.println("반지름"+b);

        if(a.equals(b)) {

            System.out.println("같은 원");
        }

        else {

            System.out.println("다른 원");
        }
    }

}

