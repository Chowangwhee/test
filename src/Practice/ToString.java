package Practice;

class Po{
    int x;
    int y;
    Po(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString(){
        return x+" "+y;
    }
}
//toString()을 오버라이딩하여 문자열 리턴 가능
public class ToString {
    public static void main(String[] args) {

        Po p=new Po(3,4);
        System.out.println(p.hashCode());   //16진수
        System.out.println(p.getClass().getName()); //패키지+클래스명
        System.out.println(p.toString());   //객체의 문자열
        System.out.println(p);  //객체가 문자열로 자동변환 됨
    }
}
