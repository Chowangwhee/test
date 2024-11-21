package Practice.WhatIsJava;

@FunctionalInterface
interface Fun{
    int cal(int x,int y);
}
public class WhatIsLambda {
    public static void main(String[] args) {

        //(매개변수)->{함수코드}
        //(num) ->{
        //System.out.println(num);
        //}

        Fun f=(x,y) ->{
            return x+y;
        };
        System.out.println(f.cal(1,2));

        Fun f2=(x,y) -> x+y;
        System.out.println(f.cal(4,5));

        //함수형 인터페이스의 추상 메소드에 매개변수가 없고 실행문이 하나일 경우
        // 람다식은 중괄호를 생략할 수 있다.



    }
}
