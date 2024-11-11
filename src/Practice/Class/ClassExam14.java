package Practice.Class;
class Animal{
    String str;
    Animal(String str){
        this.str=str;
    }
    String ani(){
        return str;
    }
}
class Dog extends Animal {
    String str;
    Dog(String a, String b){
        super(a);
        str=b;
    }
    @Override
    String ani(){
        return super.ani()+" "+str;
    }
}
public class ClassExam14 {
    public static void main(String[] args) {

        Animal a1=new Dog("강아지","푸들");
        System.out.println(a1.ani());
    }
}

