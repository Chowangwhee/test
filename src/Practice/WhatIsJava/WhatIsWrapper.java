package Practice.WhatIsJava;

import java.util.Random;

public class WhatIsWrapper {
    public static void main(String[] args) {

        //boxing 박싱
        Integer i=10;
        Character c='a';
        Boolean b=true;

        //unboxing 언박싱
        int i1=i.intValue();
        char c1=c.charValue();
        boolean b1=b.booleanValue();

        Integer i11=111;
        int i111=i11.intValue();

        //문자열을 기본타입으로 반환
        //문자열 123을 정수 123으로 언박싱
        int i2=Integer.parseInt("123");

        //문자열 true를 boolean true로 언박싱
        boolean b2=Boolean.parseBoolean("true");

        double d2=Double.parseDouble("3.14");
        //parse~~ 반환형이 기본자료형

        //~~Value ex)intValue
        //parse~~ ex)parseInt
        //valueOf

        int i3=Integer.valueOf(123);
        int i4=Integer.valueOf("10")+Integer.valueOf("20");
        //valueOf = 반환형이 객체
        System.out.println(i4);

        String s=Integer.toString(123);
        //정수형 객체 123을 문자열로 변환

        Integer i5=Integer.valueOf(10);
        int i6=i5;   //auto unboxing

        char c5=Character.valueOf('A');
        char c6=Character.valueOf('A'); //auto unboxing
        System.out.println(c5);
        System.out.println(c6);

        Integer i7=Integer.valueOf("40");
        //문자열 40을 정수형객체로 변환한 후 ->기본정수형타입으로 변경(auto unboxing)
        Integer i8=Integer.valueOf("40");

        Integer i9=Integer.valueOf(10);
        int i10=i9.intValue();

        //문자열을 기본데이터타입으로 변환
        int i12=Integer.parseInt("123");
        boolean b3=Boolean.parseBoolean("true");

        //기본타입을 문자열로 변환
        String s1=Integer.toString(123);
        String s2=Double.toString(3.14);
        String s3=Character.toString('a');

        //문자열 23을 정수로 변환
        System.out.println(Integer.parseInt("23"));

        //정수 23을 문자열로 변환
        System.out.println(Integer.toString(23));

        //23을 int에서 double로 변경
        Integer i13=Integer.valueOf(23);
        System.out.println(i13.doubleValue());

        Double d=Double.valueOf(3.14);
        System.out.println(d.toString());

        //false를 문자열 "false"로 변경
        boolean b4=(5>3);
        System.out.println(Boolean.toString(b4));
        //false 문자열을 기본자료형 boolean false로 변경
        System.out.println(Boolean.parseBoolean("false"));

        //boxing
        Integer a=39;
        Integer a2=Integer.valueOf(32);

        //unboxing
        int n=a2.intValue();
        int m=a;
        int n1=a2.intValue();


        String str="abc";
        //JVM 내부에서 지정 및 관리되고 있음
        String str2=new String("abcd");
        //힙 메모리에 생성

        String str3=new String("hi");
        String str4=str3.concat("hello");

        System.out.println(str3);
        System.out.println(str4);

        String a1 ="abc\t";
        String b5 = a1.trim();  //공백 제거
        System.out.println(b5);

        Random r=new Random();
        int n2= r.nextInt(100); //0~99
        System.out.println(n);

        int n3=(int)(Math.random()*100)+1;  //1~100

    }
}
