package Practice.Class;

class Circle {
    int r;
    Circle(int r){
        this.r=r;
    }
    double getArea(){
        return 3.14*r*r;
    }
}
public class ClassExam9 {
    public static void main(String[] args) {

        Circle[]ary=new Circle[4];
        //4개의 객체 배열
        for(int i=0;i< ary.length;i++){
            ary[i]=new Circle(i);
            //객체 4개를 생성해서 배열 위치에 저장
            System.out.println(ary[i].getArea());
        }
    }
}