package Practice.CollectionFramework;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        java.util.HashMap<String,String> h=
                new java.util.HashMap<>();

        h.put("computer","컴퓨터");
        h.put("coffee","커피");
        h.put("cream","크림");

        //키들의 집합 생성
        Set<String> key=h.keySet();
        //Iterator객체 생성
        Iterator<String> it= key.iterator();    //computer,coffee,cream

        while(it.hasNext()){
            String k=it.next(); //computer
            //computer 기준으로 한글 뽑기
            String v=h.get(k);
            System.out.println(k+" "+v);
        }

        Scanner s=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.println("찾을 단어?");
            String str=s.next();        //키 cream
            String str2=h.get(str);     //값 크림

            if(str2==null){
                System.out.println(str+"은 없는 단어");
            }
            else {
                System.out.println(str2);
            }
        }

    }
}
