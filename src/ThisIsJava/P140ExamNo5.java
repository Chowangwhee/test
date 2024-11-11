package ThisIsJava;

public class P140ExamNo5 {
    public static void main(String[] args) {

        System.out.println("5. 중첩 for 문을 이용하여 방정식 4x+5y=60의 모든 해를 구해서 (x,y) 형태로 출력하는 코드를 작성해 보세요. 단, x와 y는 10 이하의 자연수 입니다.\n");

        int xsum=0;
        int ysum=0;

        for(int x=1;x<=10;x++){
            xsum=x*4;
            for(int y=1;y<=10;y++){
                ysum=y*5;
                if(xsum+ysum==60){
                    System.out.println(x+","+y);
                }
            }
            xsum=0;
            ysum=0;
        }
    }
}
