package Exam241112;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ExampleNo02 {
    public static void main(String[] args) {

        //2. HashMap에 (1,”one”),(2,”two”),(3,”three”)를저장하여 키값을 다 출력한다.
        // 출력후, 1을입력하면 one, 2를입력하면 two, 3을입력하면
        // three가 출력될 수 있게 코드를 작성해라.

        HashMap<Integer,String> hashMap=new HashMap<>();

        hashMap.put(1,"one");
        hashMap.put(2,"two");
        hashMap.put(3,"three");
        //1
        for(int i=0;i<hashMap.size();i++){
            System.out.println(hashMap.get(i));
        }
        //2
        for(Map.Entry<Integer,String> entry:hashMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        //3
        Iterator<Integer> iterator=hashMap.keySet().iterator();
        while (iterator.hasNext()){
            int i= iterator.next();
            String string=hashMap.get(i);
            System.out.println(i+" "+string);
        }
        //1
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("키 값을 입력하시오.");
            int validInput = scanner.nextInt();
            System.out.println(hashMap.get(validInput));
            break;
        }
        //2
        System.out.println("키 입력");
        int key=scanner.nextInt();

        if(hashMap.containsKey(key)){
            String str=hashMap.get(key);
            System.out.println("매핑된 값" +str);
        }
        else{
            System.out.println("해당 값 없다");
        }
    }
}
