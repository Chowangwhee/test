package ThisIsJava.ch13.VerificationNo03;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String,String> container1=new Container<String,String>();
        container1.set("홍길동","도적");
        String name1=container1.getKey();
        String job=container1.getValue();

        Container<String,Integer> container2=new Container<String,Integer>();
        container2.set("홍길동",35);
        String name2=container2.getKey();
        int age=container2.getValue();

        //System.out.println(name1+","+job); 홍길동,도적 출력 됨
        //System.out.println(name2+","+age); 홍길동,35 출력 됨
    }
}
class Container<K,V> {
    K k;
    V v;

    void set(K k,V v) {
        this.k=k;
        this.v=v;
    }

    K getKey() {
        return k;
    }
    V getValue(){
        return v;
    }
}