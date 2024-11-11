package Exam241106;

class Friend {

    private String name;

    private String phone;

    Friend(String name, String phone) {

        this.name = name;
        this.phone = phone;
    }

    String get() {

        return name + " 번호 " + phone;
    }
}
class ITFriend extends Friend{

    String c;

    ITFriend(String a, String b,String c){
        super(a,b);
        this.c=c;
    }

    String get(){
        return super.get();
    }
    void show(){
        System.out.println(c+" "+get());
    }
}
public class ExamNo01 {
    public static void main(String[] args) {

        System.out.println("1. Friend클래스를 상속받은 ITFriend클래스를구현해라.");

        ITFriend it=new ITFriend("홍길동", "010-111-1111", "컴퓨터");

        it.show();

        System.out.println("실행 결과) 컴퓨터 홍길동 번호 010-111-1111");
    }
}