package Exam241106;
class Elec {
    String color;

    Elec(String c) {
        color = c;
    }
}
class Note extends Elec {
    int number;

    Note(String c, int n){
        super(c);
        number = n;
    }
}
class Ipad extends Note {
    int inch;
    Ipad(String c,int n,int i){
        super(c,n);
        inch=i;
    }
    void show(){
        System.out.println(inch+"인치 "+super.color+"색 "+super.number+"세대 아이패드");
    }
}
public class ExamNo02 {
    public static void main(String[] args)  {

        Ipad i = new Ipad("빨간", 3, 18);
        i.show();

        //Ipad객체 만들어서 출력




    }
}
