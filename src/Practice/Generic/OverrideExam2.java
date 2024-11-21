package Practice.Generic;

import java.util.HashSet;
import java.util.Iterator;

class Number {
    int num;
    Number(int num){
        this.num=num;
    }
    @Override
    public String toString(){
        return num+"";
    }
    @Override
    public int hashCode(){
        return num;
    }
    @Override
    public boolean equals(Object object){
        Number number1 =(Number)object;
        if(num== number1.num){
            return true;
        }
        return false;
    }
}

public class OverrideExam2 {
    public static void main(String[] args) {

        HashSet<Number> hashSet=new HashSet<Number>();
        hashSet.add(new Number(30));
        hashSet.add(new Number(40));
        hashSet.add(new Number(50));
        hashSet.add(new Number(50));

        Iterator<Number> iterator=hashSet.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
