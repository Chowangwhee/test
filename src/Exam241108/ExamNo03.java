package Exam241108;

public class ExamNo03 {
    public static void main(String[] args) {

        //4. 실수 9.5를 객체화(박싱) 시켜라.

        Double d1=Double.parseDouble("9.5");

        //4.1) 객체화 시킨 9.5를 문자열로 변경해라.

        String s1=Double.toString(d1);

        //4.2) 문자열로 변경한 9.5를 기본형값으로 언박싱해라.

        Double d11=Double.parseDouble(s1);

        System.out.println(d1);
        System.out.println(s1);
        System.out.println(d11);
    }
}
