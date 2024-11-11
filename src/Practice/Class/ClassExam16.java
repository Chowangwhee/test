package Practice.Class;
class Vegetable{

    void vegetable(){
        System.out.println("채소");
    }

}
class Cucumber extends Vegetable{
    void cucumber(){
        System.out.println("오이");
    }
}
class Carrot extends Vegetable{
    void carrot(){
        System.out.println("당근");
    }
}

public class ClassExam16 {
    static void pr(Vegetable v1){
        if(v1 instanceof Carrot){
            ((Carrot) v1).carrot();
    }
        else if (v1 instanceof Cucumber) {
            ((Cucumber) v1).cucumber();
    }
        else{v1.vegetable();
        }
    }

    public static void main(String[] args) {

        Vegetable v1=new Vegetable();
        Cucumber c1=new Cucumber();
        Carrot c2=new Carrot();

        pr(v1); //Vegetable v1 = new Vegetable
        pr(c1); //Vegetable c1 = new Cucumber
        pr(c2); //Vegetable c2 = new Carrot

    }
}
