package ThisIsJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class WhatIsHashMap {
    public static void main(String[] args) {

        HashMap<String,String> h=
                new HashMap<>();
        h.put("물","water");
        h.put("커피","coffee");
        h.put("차","tea");

        Set<String> keys=h.keySet();    //물,커피,차

        Iterator<String> it=keys.iterator();    //키 값을 반복해서 반복객체에 저장

        while(it.hasNext()){
            String a= it.next();    //키
            String b=h.get(a);      //키에 맞는 값
            System.out.println(a+" "+b);
        }

        HashMap h2 =new HashMap();
        h2.put("hyejin","123");
        h2.put("hahyeong","234");
        h2.put("seungmin","345");

        Scanner s=new Scanner(System.in);

        while(true){
            System.out.println("ID,PW를 입력하시오.");
            String id= s.next();
            String pw=s.next();

            if(!h2.containsKey(id)){ //ID가 해시맵에 없을경우
                System.out.println("ID가 존재하지 않습니다.");
                continue;   //ID 다시 입력함
            }
            else {
                if(!h2.get(id).equals(pw)){
                    System.out.println("PW가 틀렸습니다.");
                    continue;   //ID 다시 입력함
                }
                else {  //비밀번호를 알맞게 입력했을 경우
                    System.out.println("로그인 성공");
                    break;
                }
            }
        }





    }
}
