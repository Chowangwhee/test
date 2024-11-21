package Practice.Generic;
//<> : Generic
class St<T>{
    int n;
    Object []st;

    St(){
        st=new Object[3];
        //Object []st=new Object[3];
        n=0;
    }

    public void push(T t) {
        if(n==3){
            return; //함수 종료
        }
        st[n]=t;
        n++;
    }
    public T pop(){
        if(n==0){
            return null;
        }
        n--;
        return (T)st[n];
    }
}
public class GenericExam2 {
    public static void main(String[] args) {

        St<String> s=new St<String>();
        s.push("java"); //st[0]="java"
        s.push("db");   //st[1]="db"
        s.push("react");//st[2]="react"

        for(int i=0;i<3;i++){
            System.out.println(s.pop());
        }

        St<Integer> s2=new St<Integer>();
        s2.push(1);     //Integer i[0]=1;
        s2.push(2);     //Integer i[1]=2;
        s2.push(3);     //Integer i[2]=3;

        for(int i=0;i<3;i++){
            System.out.println(s2.pop());
        }

    }
}