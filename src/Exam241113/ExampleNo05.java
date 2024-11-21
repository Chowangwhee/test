package Exam241113;

import java.util.*;

class Person{
    String name;
    int id;
    Person(String name,int id){
        this.name=name;
        this.id=id;
    }
}
public class ExampleNo05 {
    public static void main(String[] args) {

        //1. 이름과 id를입력받아 Person클래스작성하고입력한값다출력해라.(객체배열의개수는 3개)

        //1.2 1번에이어다음과같은실행결과가나오도록코드를추가해라. (Person객체배열사용해라.)

        //실행결과)
        //이름, id입력: 홍길동 111
        //이름, id입력: 김길동 222
        //이름, id입력: 박길동 333
        //이름뭐니? 홍길동
        //답: 111
        //이름뭐니? 최길동
        //이름없다.
        //이름뭐니? Stop

        Person []p=new Person[3];
        Scanner scanner=new Scanner(System.in);

        Map<String,Integer> map=new HashMap<>();

        for(int i=0;i<3;i++) {
            System.out.print("이름, id입력: ");
            String name = scanner.next();
            int id= scanner.nextInt();
            p[i]=new Person(name,id);
            map.put(name,id);
        }
        while(true){
            System.out.println("이름뭐니?");
            String name=scanner.next();
            if(name.equals("Stop")){
                break;
            }
            if(map.containsKey(name)){
                System.out.println("답: "+map.get(name));
            }else{
                System.out.println("이름없다.");}
        }
    }
}


