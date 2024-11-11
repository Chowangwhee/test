package Exam241107;

import java.util.Scanner;

class Rectangle1{
    int x=0;
    int y=0;

    public void setXY(int x,int y) {
        this.x=x;
        this.y=y;
    }

    void result(){
        System.out.println("입력하신 너비"+x+"와 높이"+y+"인 사각형의 면적은 "+x*y+"입니다.");
    }
}
public class ExamNo09 {
    public static void main(String[] args) {

        // 2- B. 클래스 Prob2: Rectangle 클래스를 이용하는 응용프로그램
        // Main 메소드에서 키보드로 사각형의 너비와 높이의 값을 입력받는다.
        // 키보드 입력값이 int 가 아닌 경우 예외처리를 하고
        // 유효값이 입력될 때까지 계속 입력받게 한다.
        // 키보드로 입력한 유효값을 저장하는 Rectangle 객체를 만들고
        // Rectangle 객체의 면적을 출력한다.

        Scanner scanner=new Scanner(System.in);

        int x=0;
        int y=0;
        String width = null;
        String height = null;

        boolean validInput=false;

        while(!validInput){
            try {
                if (x == 0) {
                    System.out.println("사각형의 너비를 입력하시오.");
                    width = scanner.next();
                    if (width.contains(".")) {
                        throw new NumberFormatException();
                    }
                }
                x=Integer.parseInt(width);
                if (y == 0) {
                    System.out.println("사각형의 높이를 입력하시오.");
                    height = scanner.next();
                    if (height.contains(".")) {
                        throw new NumberFormatException();
                    }
                }
                y=Integer.parseInt(height);
                validInput=true;
            }catch(NumberFormatException e){
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
        Rectangle1 rec=new Rectangle1();
        rec.setXY(x,y);
        rec.result();

    }
}
