package Practice.Inheritances.Class;

class A{
    int n;                      //인스턴스 필드
    //func(int x){           //인스턴스 메소드
    //    n=x;

    //static int max(int a,int b){
        //return a>b ? a:b;
    //}
    static int m;               //정적 필드

    //static void s1(int x){
    //    n=x;                    //static 메소드는 non-static 필드 사용 불가
    //}
    //static void s2(int x){
        //func(3);             //static 메소드는 non-static 필드 사용 불가
    //}
    static void s3(int x){
        m=x;
    }
    static void s4(int x){
        s3(5);
    }
}
public class ClassExam3 {
    public static void main(String[] args) {

        //System.out.println(A.max(3,54));
    }
}
