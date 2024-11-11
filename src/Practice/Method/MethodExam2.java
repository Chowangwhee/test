package Practice.Method;

public class MethodExam2 {
    static double area(double r){
        return 3.14*r*r;
    }
    static double round(double r){
        return 3.14*r*2;
    }
    public static void main(String[] args)  {

        System.out.println("원의 넓이 : "+area(5.5));   //함수 호출과 동시에 출력 함
        System.out.println("원의 둘레 : "+round(3.2));

        //넓이:3.14*반지름*반지름
        //둘레:3.14*반지름*2
    }
}
