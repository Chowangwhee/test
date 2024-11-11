package Practice.Interface;

class Tv{
    public void on(){
        System.out.println("티비 켬");
    }
}
interface Computer{
    public void m();
}
class Com{
    public void m(){
        System.out.println("켬");
    }
}
class Ipad extends Tv implements Computer{

    Com c=new Com();

    @Override
    public void m(){
        c.m();
    }
    public void ip(){
        m();
        on();
    }
}
public class InterfaceExam3 {
    public static void main(String[] args) {

        Ipad i=new Ipad();
        Tv t=i;             //upcasting
        Computer c=i;       //upcasting
        i.ip();
    }
}

