package Practice.Inheritances.Interface;

interface Animal{
    void bear();
}
interface fish{
    void swim();
}
class Animals implements Animal,fish{
    @Override
    public void bear(){
        System.out.println("으쓱으쓱");
    }
    public void swim(){
        System.out.println("어푸어푸");
    }
}
public class InterfaceExam4 {
    public static void main(String[] args) {

        Animals a=new Animals();
        a.bear();
        a.swim();
    }
}
