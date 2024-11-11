package Practice;

import java.util.Scanner;

public class Exam241031 {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("1. 1~10까지 합을 구해라. (for, while, do~while) \n");

        // for 문

        int sum1 =0;

        for(int num1 = 0; num1 <=10; num1++){
            sum1 += num1;
        }
        System.out.println("for 문으로 구한 답 : "+sum1);

        //while 문

        int num2=0;
        int sum2=0;

        while(num2!=10){
            num2++;
            sum2 +=num2;
        }
        System.out.println("while 문으로 구한 답 : "+sum2);

        //do-while 문

        int num3=0;
        int sum3=0;

        do{
            num3++;
            sum3+=num3;
        }while(num3!=10);
        System.out.println("do-while 문으로 구한 답 : "+sum3);
        System.out.println();

        System.out.println("2. while 문을 이용하여 정수를 여러 개 입력받고 평균 출력해라. (0이 입력되면 입력이 종료된다.)\n" );

        int num4=0;
        int sum4=0;
        int avg=0;
        System.out.println("정수를 입력하세요.");

        while(true){
            num4=s.nextInt();
            if(num4!=0) {
                sum4 += num4;
                avg++;
                while (true) {
                    System.out.println("두번째 정수를 입력하세요.");
                    num4 = s.nextInt();
                    if (num4 != 0) {
                        sum4 += num4;
                        avg++;
                        while(true) {
                            System.out.println("정수를 입력하세요.(0을 입력할 시 입력되어있는 정수들의 평균을 구하고 프로그램을 종료합니다.)");
                            num4=s.nextInt();
                            if(num4==0){
                                break;
                            }
                            sum4+=num4;
                            avg++;
                        }
                        break;
                    }
                    System.out.println("처음과 두번째는 무조건 정수를 입력하셔야 합니다.");
                    System.out.println("정수를 다시 입력하세요.");
                }
                break;
            }
            System.out.println("처음과 두번째는 무조건 정수를 입력하셔야 합니다.");
            System.out.println("정수를 다시 입력하세요.");
        }
        System.out.println("입력된 정수들의 평균 : \n"+sum4/avg);

        System.out.println("3. 다음 while 문을 보고 실행결과가 동일하게 나오도록 2가지 과정으로 바꿔라.");

        //      int i=0;
        //      int sum=0;
        //      while(i<10){
        //          i=i+2;
        //         sum+=i;
        //      }
        //      System.out.println(sum); 결과값 : 30

        //for 문
        int sum=0;

        for(int i=1;i<10;i++){
            i=i+1;
            sum+=i;
        }
        System.out.println("for 문으로 구한 결과 값 :"+sum+"\n");

        //do-while 문
        int i=0;
        sum=0;

        do {
            i=i+2;
            sum+=i;
        }while(i<10);

        System.out.println("do-while 문으로 구한 결과 값 :"+sum+"\n");

        System.out.println("3.1) while(true)와 break 문을 사용하여 바꿔라.\n");

        i=0;
        sum=0;

        while(true){
            i=i+2;
            if(i>10){
                break;
            }
            sum+=i;
        }

        System.out.println("결과 값 : "+sum+"\n");

        System.out.println("3.2) do~while 문, continue 문을 사용하여 바꿔라.\n");

        i=0;
        sum=0;
        boolean value=true;

        do{

            i=i+2;
            sum+=i;
            if(i<10) {
                continue;
            }
            value=false;
        }while(value);


        System.out.println("결과 값 : "+sum+"\n");

        System.out.println("4-1) 10개의 문자를 가지는 배열 a를 선언하고 생성해라.\n");

        String[] a={"A","B","C","D","E","F","G","H","I","J"};

        System.out.println(a.length+"\n");

        System.out.println("4-2) 0~4까지 정수형으로 초기화된 배열 b를 선언하고 생성해라.\n");

        int[] b={1,2,3,4,5};

        System.out.println(b.length+"\n");

        System.out.println("4-3) “java”, “c”, “c++”로 초기화된 배열 c를 선언하고 생성해라.\n");

        String[] c={"java","c","c++"};

        System.out.println(c.length+"\n");

        System.out.println("4-4) 인덱스의 최대값이 9인 정수형 배열 d를 선언하고 생성해라.\n");

        int[] d=new int[9];

        System.out.println(d.length);

        System.out.println("7층 아파트 배열 문제//아파트 각 층에 있는인원수를 입력하고 총합을구하라");

        int[] apt=new int[7];
        int f=0;
        sum=0;

        for(f=0;f<apt.length;f++){
            System.out.println((f+1) + "층에 인원을 입력하시오");
            apt[f]=s.nextInt();
            sum+=apt[f];

            System.out.println("7층 아파트 전체 인원수 : "+sum);
        }


    }
}
