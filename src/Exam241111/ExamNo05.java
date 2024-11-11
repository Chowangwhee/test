package Exam241111;

import java.util.HashMap;
import java.util.Scanner;

public class ExamNo05 {
    public static void main(String[] args) {

        //5. Map만들어 이름, 나이저장해서 이름과 일치하는 나이출력해라.

        HashMap<String,Integer> hashMap=new HashMap<>();
        Scanner scanner=new Scanner(System.in);
        String name="";
        int age=0;
        System.out.println("저장할 데이터를 입력하시오.\n"+"exit을 입력하면 조회화면으로 넘어갑니다.");
        while (true) {
            System.out.println("이름을 입력하시오.");
            name = scanner.next();
            if(name.equals("exit")){
                break;
            }
            System.out.println("나이를 입력하시오.");
            age=scanner.nextInt();

            hashMap.put(name,age);
        }
        name="";
        age=0;
        while(true) {
            System.out.println("나이를 알아보고 싶은 이름을 입력하시오.\n"+"exit을 입력하면 프로그램이 종료됩니다.");
            name=scanner.next();
            if(name.equals("exit")){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

                if(hashMap.containsKey(name)){
                    System.out.println(name+"님의 나이는 "+hashMap.get(name)+"세 입니다.");
                }else{
                    System.out.println("뉘신지..");

            }
        }
    }
}
