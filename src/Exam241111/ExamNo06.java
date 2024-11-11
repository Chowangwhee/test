package Exam241111;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExamNo06 {
    public static void main(String[] args) {

        //6. HashMap으로 이름과 나이를 입력받아 3명의 값을 저장한다.

        //        저장한 후 나이가 가장 많은 사람의 이름을 출력해라.

        HashMap<Integer,String> a=new HashMap<>();
        Scanner s=new Scanner(System.in);
        int max=0;
        for(int i=0;i<3;i++){
            System.out.println("나이");
            int age= s.nextInt();
            System.out.println("이름");
            String name=s.next();
            a.put(age,name);
        }
        Set<Integer> age=a.keySet();
        Iterator<Integer> it=age.iterator();

        while(it.hasNext()){
            Integer b=it.next();
            if(max<b){
                max=b;
            }
        }
        String str=a.get(max);
        System.out.println("나이 가장 많은 사람의 이름은 "+a.get(max));
    }
}
