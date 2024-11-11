package Exam241111;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person{
    String name;
    int num;

    Person(int num,String name){
        this.name=name;
        this.num=num;
    }
    @Override
    public boolean equals(Object obj){
        if(this.num==((Person)obj).num){
            return true;
        }
        return false;
    }
    @Override
    public int hashCode(){
        return num;
    }
}
public class ExamNo07 {
    public static void main(String[] args) {

        //5. HashSet에 Person객체를저장한다.
        // 학번이같으면 동일한 Person객체라 판단하고 중복저장이 되지 않도록 하게 코드를 작성해라.

        Set<Person> s = new HashSet<Person>();

        s.add(new Person(12, "홍길동"));

        s.add(new Person(23, "김길동"));

        s.add(new Person(12, "이길동"));

        Iterator<Person> it = s.iterator();

        while (it.hasNext()) {

            Person p = it.next();

            System.out.println(p.num + " " + p.name);

        }
    }
}
