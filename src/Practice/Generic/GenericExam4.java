package Practice.Generic;

class Food{
    void show(){
        System.out.println("음식");
    }
}
class Pizza extends Food{
    void show(){
        super.show();       //"음식"
        System.out.println("피자");
    }
}
class Fo<T>{
    T t;
    void in(T t){
        this.t=t;
    }
    T out(){                    //꺼내다
        return t;
    }
}
public class GenericExam4 {
    static void pr(Fo<? extends Food> food){
        Food fo=food.out();
        fo.show();
    }
    public static void main(String[] args) {

        Fo<Food> food=new Fo<Food>();
        //food 로부터 in 함수 호출
        //Food food2=new food();
        //food2.in(food2);
        food.in(new Food());
        pr(food);       //Fo<? extends Food>food =food

        Fo<Pizza> pizza=new Fo<Pizza>();

        pizza.in(new Pizza());
        pr(pizza);

    }
}
