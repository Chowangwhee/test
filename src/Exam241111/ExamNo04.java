package Exam241111;

import java.util.ArrayList;
import java.util.Iterator;

public class ExamNo04 {
    public static void main(String[] args) {

        //4. ArrayList에 0~100사이의 임의의 정수 10개를 삽입하고 모두 출력해라.
        // 출력할때는 Iterator인터페이스를 사용해서 출력해라.

        ArrayList<Integer> a=new ArrayList<>();

        int lotto=0;
        for(int i=0;i<10;i++){
            lotto=(int)(Math.random()*100)+1;
            a.add(lotto);
        }
        Iterator<Integer> it= a.iterator();
        while(it.hasNext()){
            int n= it.next();
            System.out.println(n);
        }
    }
}
