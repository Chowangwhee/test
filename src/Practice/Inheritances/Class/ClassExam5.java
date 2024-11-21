package Practice.Inheritances.Class;

class Tv{
    //1. 필드
    String company;
    int year;
    int inch;
    //2. 생성자
    Tv(String com, int y, int i){
        company=com;
        year=y;
        inch=i;
    }
    //3. 메소드
    void show(){
        System.out.println(year+"년에 "+company+"에서 나온 "+inch+"인치 Tv");
    }
}
public class ClassExam5 {
    public static void main(String[] args) {

        Tv t = new Tv("삼성", 2024, 22);

        t.show(); //2024년에 삼성에서 나온 22인치 Tv 출력
    }
}