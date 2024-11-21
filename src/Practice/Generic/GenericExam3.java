package Practice.Generic;

class AA{
    @Override
    public String toString(){
        return "AA";
    }
}
class BB{
    @Override
    public String toString(){
        return "BB";
    }
}
class In{
    <T>void show(T t){      //Generic Method
        System.out.println(t);
    }
    void show(){
        System.out.println("generic");
    }
}
public class GenericExam3 {
    public static void main(String[] args) {

        AA a=new AA();
        BB b=new BB();
        In i=new In();

        i.<AA>show(a);      //AA t=a;
        i.<BB>show(b);
        i.show();

    }
}
