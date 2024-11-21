import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Person{
    private String name;
    private int id;

    Person(String n,int i){
        name=n;
        id=i;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object o){
        Person p=(Person)o;
        if(p.getId()==this.id && p.getName().equals(this.name)){
            return true;
        }
        return false;
    }
}
class Game{

    ArrayList<Person> a=new ArrayList<>(5);
    Scanner scanner=new Scanner(System.in);

    Game(){
        a.add(new Person("도현",123));    //[0]
        a.add(new Person("하형",456));    //[1]
        a.add(new Person("왕휘",789));    //[2]
        a.add(new Person("다훈",112));    //[3]
    }
    void in(){
        System.out.println("이름, id입력");
        String name= scanner.next();
        while (true) {
            if (name.equals("stop")) {
                break;
            }
            int id = scanner.nextInt();
            Person pp = new Person(name, id);  //Person 클래스 객체 생성

            if (a.contains(pp)) {             //리스트에 있는 객체인지 아닌지 여부
                System.out.println(pp.getName() + "은 이미 리스트에 있다");
            } else {
                a.add(pp);
            }
        }
    }
    void out(){
        while(true){
            Random r=new Random();
            int n=r.nextInt(a.size());
            //0~4 사이의 난수 발생시켜서 n에 저장

            Person person=a.get(n); //get(index)
            String string= person.getName();
            int id=person.getId();

            System.out.println(string+"의 id는?");

            Scanner scanner=new Scanner(System.in);

            int id2= scanner.nextInt();

            if(id2==-1){
                break;
            }
            if(id2==id){
                System.out.println("정답");
            }
            else{
                System.out.println("정답 아님");
            }
        }
    }
    void end(){
        System.out.println("종료");
        System.exit(0);
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Game g=new Game();
        while(true){
            System.out.println("1,2,3");
            int select= scanner.nextInt();

            switch(select){
                case 1:
                    g.in();
                    break;
                case 2:
                    g.out();
                    break;
                case 3:
                    g.end();
                    break;

            }
        }

    }
}