package Exam241114;

import java.util.ArrayList;
import java.util.HashMap;

class Circle{

    private double x,y;

    private int r;

    Circle(double x, double y, int r){

        this.x=x; this.y=y; this.r=r; }

    void show(){

        System.out.println(x + " " +y + " " +r);}}
public class ExampleNo04 {
    public static void main(String[] args) {

        //2. 3개의 Circle 객체 배열을 만들고 x, y, r값을 읽어
        // 3개의 Circle객체를 만들어 show()함수에서 다 출력해라.

        Circle []c=new Circle[3];

        for(int i=0;i<3;i++){
            if(i==0) {
                c[i] = new Circle(1.0, 1.0, 4);
            }else if(i==1){
                c[i] = new Circle(2.5, 3.5, 6);
            }else{
                c[i] = new Circle(4.2, 1.2, 4);
            }
            System.out.println(c[i]);
        }
    }
}
