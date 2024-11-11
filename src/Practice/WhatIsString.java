package Practice;

import java.util.StringTokenizer;

public class WhatIsString {
    public static void main(String[] args) {

        //String
        //값이 할당되면 변경할 경우 공간이 변하지 않는다
        //변경될 경우 새 공간을 참조
        //StringBuffer
        //값이 할당된 후 변경될 경우 할당된 공간이 변한다
        //문자수에 따라 버퍼 크기를 자동으로 조절할 수 있다
        //문자열이 길거나 문자열 작업이 많은 경우
        //동기화가 지원된다
        //StringBuilder
        //버퍼와 동일하지만 동기화가 지원되지 않는다는 특징이 있다

        StringBuffer sb=new StringBuffer("Java");

        sb.append("is very good");
        //맨 끝에 추가
        sb.insert(0,"A ");
        //0번째 문자열에 해당 문자 삽입
        sb.replace(2,6,"Html ");
        //2번째부터 6번째 문자열을 해당 문자로 대체
        System.out.println(sb);


        String str="id=123#name=gildong#addr=seoul";
        //#을 기준으로 문자열 나누기

        StringTokenizer s=new StringTokenizer(str,"#");
        int n=s.countTokens();
        System.out.println(n);

        while (s.hasMoreTokens()){
            String a=s.nextToken();
            System.out.println(a);

        }
    }
}
