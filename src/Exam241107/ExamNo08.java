package Exam241107;

import java.util.Scanner;

class Rectangle{
    private int width;
    private int height;

    public void setWidth(int width){
        this.width=width;
    }
    public void setHeight(int height) {
        this.height=height;
    }
    int show(){
        return width*height;
    }
}
public class ExamNo08 {
    public static void main(String[] args) {

        //1- A. 클래스 Prob1: Rectangle

        //필드는 int 형 너비 (width)와 높이 (height)가 있고, 모두private으로 선언하라. 생성자는 구현하지 말고 메소드는 클래스에서 필요한 내용을 판단하여구현하라.

        Scanner scanner=new Scanner(System.in);

        int x=0;
        int y=0;

        while(true){
            try{
                System.out.println("너비값 입력");
                x=scanner.nextInt();
                System.out.println("높이값 입력");
                y=scanner.nextInt();
                break;
            }catch (Exception e){
                System.out.println("정수를 입력하시오.");
                scanner.next();
                continue;
            }
        }
        Rectangle rectangle=new Rectangle();
        rectangle.setWidth(x);
        rectangle.setHeight(y);
        rectangle.show();

    }
}
