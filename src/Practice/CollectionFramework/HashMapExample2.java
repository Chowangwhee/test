package Practice.CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample2 {
    public static void main(String[] args) {

        HashMap<String,String> n=new HashMap();
        n.put("water","물");
        n.put("apple","사과");
        n.put("java","자바");

        Set<String> keys=n.keySet();    //키 값은 중복될 수 없음
        //모든 키를 Set 컬렉션에 받아 옴

        Iterator<String> it=keys.iterator();

        while(it.hasNext()){
            String k= it.next();
            String v=n.get(k);
            System.out.println(k+","+v);
        }
    }
}
