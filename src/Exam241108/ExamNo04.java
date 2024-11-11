package Exam241108;

//3. 다음 class를 보고 코드를 작성해라.

import java.util.Scanner;

class Profile{

    String name,id;

    Profile(String name, String id){

        this.name=name; this.id=id;

    }

    String getname(){ return name;}

    String getid(){ return id;}

}
public class ExamNo04 {
    public static void main(String[] args) {

        //Prob1: main()에서인원수를입력받아인원수를
        // Profile에대한객체배열개수로설정한다.
        // 이름과아이디도입력받아객체배열에저장한후출력해라.

        Scanner scanner=new Scanner(System.in);

        System.out.println("인원수를 입력하시오.");
        int validInputPerson=scanner.nextInt();
        Profile []p=new Profile[validInputPerson];

        for(int i=0;i<p.length;i++){
            System.out.println((i+1)+"번째 인원의 이름을 입력하시오.");
            String name=scanner.next();

            System.out.println((i+1)+"번째 인원의 ID를 입력하시오.");
            String id=scanner.next();

            p[i]=new Profile(name,id);
        }
        for(int j=0;j<p.length;j++){
            System.out.println((j+1)+"번째 인원의 이름: "+p[j].getname()+"\n"+(j+1)+"번째 인원의 ID: "+p[j].getid());
        }


    }
}
