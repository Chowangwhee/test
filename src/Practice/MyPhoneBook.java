package Practice;
import java.util.Scanner;

class PhoneNum{
    String name;
    String phone;

    PhoneNum(String n,String p){
        name=n;
        phone=p;
    }
    void show(){
        System.out.println("이름 : "+name);
        System.out.println("번호 : "+phone);
    }
}
class School extends PhoneNum{
    String major;

    School(String n,String p,String major){
        super(n,p);
        this.major=major;
    }
    @Override
    void show(){
        super.show();   //System.out.println("이름 : "+name);
        //System.out.println("번호 : "+phone);
        System.out.println("전공 : "+major);
    }
}
class Worker extends PhoneNum{
    String grade;

    Worker(String n,String p,String grade){
        super(n,p);
        this.grade=grade;
    }
    @Override
    void show(){
        super.show();   //System.out.println("이름 : "+name);
        //System.out.println("번호 : "+phone);
        System.out.println("직급 : "+grade);
    }
}
class Arr{
    PhoneNum[] ary;
    int n;

    Arr(int n){         //생성자 역할 : 초기화 작업
        ary=new PhoneNum[n]; //PhoneNum[] ary=new PhoneNum[5];
        n=0;
    }
    void add(PhoneNum p){
        ary[n++]=p;     //친구목록 확장
    }
    void friend(char ch){
        Scanner scanner=new Scanner(System.in);

        System.out.println("이름: ");
        String name=scanner.next();
        System.out.println("번호: ");
        String num=scanner.next();

        switch (ch){
            case 'A':
                System.out.println("전공: ");
                String major=scanner.next();
                add(new School(name,num,major));
                //PhoneNum p=new School(name,num,major);
                break;
            case 'B':
                System.out.println("직급: ");
                String grade=scanner.next();
                add(new Worker(name,num,grade));
                break;
        }
    }
    void all(){
        for(int i=0;i<n;i++){
            ary[i].show();
        }
    }
}
public class MyPhoneBook {
    public static void main(String[] args)  {

        Arr ar=new Arr(5);
        //객체 생성
        while(true){//무한반복
            System.out.println("A. 학교 친구");
            System.out.println("B. 직장 동료");
            System.out.println("C. 종료");
            System.out.println("D. 출력");

            System.out.println("문자 입력");

            Scanner s=new Scanner(System.in);
            char c=s.next().charAt(0);         //A~D 중 하나만 입력

            switch (c){
                case 'A':
                    ar.friend(c);
                    break;
                case 'B':
                    ar.friend(c);
                    break;
                case 'C':
                    System.out.println("종료");
                    return;
                case 'D':
                    ar.all();
                    break;
            }
        }
    }
}
