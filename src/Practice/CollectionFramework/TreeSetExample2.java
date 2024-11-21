package Practice.CollectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

class Pro implements Comparable<Pro>{
    String s;
    int i;
    Pro(String s,int i){
        this.s=s;
        this.i=i;
    }
    void show(){
        System.out.println(s+","+i);
    }
    //x.compareTo(y) <= 0
    @Override
    public int compareTo(Pro pro){//객체 특정필드를 비교하는 메소드
        //오름차순으로 정렬 됨
        //내림차순으로 정렬할 경우 등호를 반대로
        if(i> pro.i)return 1;          //객체(i)와 매개변수 객체(pro.i) 값을 비교
        //if(s.compareTo(s)>0)return 1;  문자열일 경우
        else if(i< pro.i)return -1;
        else return 0;
    }
}

public class TreeSetExample2 {
    public static void main(String[] args) {

        TreeSet<Pro> t=new TreeSet<Pro>();
        t.add(new Pro("cc",128));
        t.add(new Pro("aa",333));
        t.add(new Pro("bb",123));

        Iterator<Pro> it=t.iterator();
        while (it.hasNext()){
            it.next().show();
        }

    }
}
