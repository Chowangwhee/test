package Practice.Interface;

interface Food{
    public String name();
}
class Pizza implements Food {
    @Override
    public String name(){
        return "피자";
    }
}
class Steak implements Food {
    @Override
    public String name(){
        return "스테이크";
    }
}
public class InterFaceExam1 {
    static void pr(Food f){
        System.out.println(f.name());
    }
    public static void main(String[] args) {

        pr(new Pizza());    //함수 호출
        pr(new Steak());    //함수 호출

    }
}
