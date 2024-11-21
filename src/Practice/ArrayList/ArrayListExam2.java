package Practice.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExam2 {
    public static void main(String[] args) {

        //컬렉션: 가변 개수의 객체들의 저장소
        //제네릭기법으로 구현 됨(컬렉션의 요소는 객체만 가능)
        List<Integer> li=new ArrayList<>();
        li.add(5);  //li.add(new Integer(5));
        li.add(4);
        li.add(-1);

        li.add(2,100);

        System.out.println("객체 수 "+ li.size());

        int sum=0;

        for(int i=0;i<li.size();i++){
            int n=li.get(i);    //int n=Integer
            sum+=n;
            System.out.println(n);
        }
        System.out.println("합계: "+sum);

    }
}
