package ThisIsJava.ch13.VerificationNo02;

public class ContainerExample {
    public static void main(String[] args) {
        Container<String> container1=new Container<String>();
        container1.set("홍길동");
        String str=container1.get();

        Container<Integer> container2=new Container<Integer>();
        container2.set(6);
        int value=container2.get();

        //System.out.println(str+","+value); 홍길동,6 출력 됨
    }
}
class Container<T>{
    T t;
    T set(T t){
        return this.t=t;
    }
    T get(){
        return t;
    }
}
