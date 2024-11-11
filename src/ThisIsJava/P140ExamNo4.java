package ThisIsJava;

public class P140ExamNo4 {
    public static void main(String[] args) {

        System.out.println("4. While 문과 Math.random() 메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1,눈2) 형태로 출력하고, 눈의 합이5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성해 보세요. 눈의 합이 5가 되는 경우는 (1,4), (4,1),(2,3),(3,2)입니다.\n");
        boolean esc=false;
        while(!esc){
            int x=(int)(Math.random()*6)+1;
            System.out.println(x);
            int y=(int)(Math.random()*6)+1;
            System.out.println(y);
            int z=x+y;
            if(z==5){
                esc=true;
            }
        }
    }
}
