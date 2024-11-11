package ThisIsJava;

public class P140ExamNo2 {
    public static void main(String[] args) {

        System.out.println("아래 switch 문을 Expression(표현식)으로 변경해서 밑에 작성해 보세요.\n");

        //String grade="B";

        //int score1=0;
        //switch(grade){
        //    case "A":
        //        score1=100;
        //        break;
        //    case "B":
        //        int result=100-20;
        //        score1=result;
        //        break;
        //    default:
        //        score1=60;
        //}

        String grade="B";

        int score1=0;
        switch(grade){
            case "A":
                score1=100;
                break;
            case "B":
                int result=100-20;
                score1=result;
                break;
            default:
                score1=60;
        }
        System.out.printf("귀하의 점수는 %d 이며 등급은 %s 입니다.",score1,grade);
    }
}
