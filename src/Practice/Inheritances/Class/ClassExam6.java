package Practice.Inheritances.Class;

import java.util.Scanner;

class Score2 {

    int math,eng,com;

    Score2(int math, int eng, int com){
        this.math=math;
        this.eng=eng;
        this.com=com;
    }
    double avg(){
        return (math+eng+com)/3.0;
    }
}

public class ClassExam6 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int math=scanner.nextInt();
        int eng=scanner.nextInt();
        int com=scanner.nextInt();

        Score2 s= new Score2(math, eng, com);
        //매개변수 값을 필드에 저장
        System.out.println("평균은" + s.avg());
    }
}