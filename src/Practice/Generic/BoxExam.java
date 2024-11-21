package Practice.Generic;

class Box<T>{
    Box<T> next;
    T t;

    void in(T t){
        this.t=t;
    }
    T out(){
        return t;
    }
}
public class BoxExam {
    public static void main(String[] args) {

        Box<Integer> b=new Box<>();
        b.in(30);

        b.next=new Box<Integer>();
        b.next.in(40);

        b.next.next=new Box<Integer>();
        b.next.next.in(50);

        Box<Integer> tmp;
        tmp=b.next;
        System.out.println(tmp.out());

    }
}
