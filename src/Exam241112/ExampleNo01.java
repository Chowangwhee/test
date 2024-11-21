package Exam241112;

import java.util.ArrayList;
import java.util.Iterator;

public class ExampleNo01 {
    public static void main(String[] args) {

        //1. ArrayList에“one”,”two”,”three”를저장한다.
        // 저장후 Iterator로반복한후(while) “three”라는단어가보이면(comepareTo함수사용) 삭제해라.

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        Iterator<String> iterator=arrayList.iterator();

        while(iterator.hasNext()){
            String num=iterator.next();
            if(num.compareTo("three")==0){
                iterator.remove();
                System.out.println("단어 값이 Three 인 객체가 삭제되었습니다.");
            }
        }
        System.out.println(arrayList);
    }
}
