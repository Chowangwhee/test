package Practice.CollectionFramework;

import java.util.Iterator;

public class VectorExample {
    public static void main(String[] args) {

        java.util.Vector<Integer> v=new java.util.Vector<>();
        v.add(4);
        v.add(5);
        v.add(2);
        v.add(2,100);
        //p.656
        Iterator<Integer> it=v.iterator();  //Iterator 객체 얻기(순차검색)

        while(it.hasNext()){
            Integer n=it.next();
            System.out.println(n);
        }
        int sum=0;
        it=v.iterator();                    //이어서 합계를 구하기 위해 it객체 초기화
        while(it.hasNext()){
            int n=it.next();
            sum+=n;
        }
        System.out.println(sum);

    }
}
