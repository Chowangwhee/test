package Practice.Generic;

//1. 다형성(형변환)
class Program<T>{
    T t;
    void in(T t){
        this.t=t;
    }
    T get(){
        return t;
    }
}
class Java{
    String a;
    Java(String a){
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }
}
class DB{
    String a;
    DB(String a){
        this.a=a;
    }
    void show(){
        System.out.println(a);
    }
}
public class GenericExam {
    public static void main(String[] args) {
//<> : angle blanket
        Program<Java> p=new Program<Java>(); //객체 생성
        //Java j=new Java("Java");
        p.in(new Java("Java"));
        Java j=p.get();
        j.show();

        Program<DB> p2=new Program<DB>();
        //DB db=new DB("DB");
        p2.in(new DB("DB"));
        DB db=p2.get();
        db.show();

    }
}