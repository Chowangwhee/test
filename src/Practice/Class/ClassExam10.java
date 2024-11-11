package Practice.Class;
import java.util.Scanner;
class Song{
    String singer;
    String title;
    Song(String singer, String title){
        this.singer=singer;
        this.title=title;
    }
}
public class ClassExam10 {
    public static void main(String[] args) {

        Song so[]=new Song[2];                      //객체 배열 생성

        Scanner s=new Scanner(System.in);

        for(int i=0;i< so.length;i++){
            System.out.println("가수");
            String singer=s.next();
            System.out.println("제목");
            String title=s.next();

            so[i]=new Song("가수","제목");//객체 생성해서 객체 배열에 저장 함
        }
        for(int i=0;i<2;i++){
            System.out.println(so[i].singer+" "+so[i].title);
        }
    }
}