package Practice;

public class StringExam {
    public static void main(String[] args) {
        String str="JAVA IS SO FUCKING HARD FOR ME";

        String str1=str.replace("FUCK","FXXK");

        String newStr=str1.concat("!!");

        String strIndex[]=newStr.split(" ");

        for(String newStrIndex :strIndex){
            System.out.println(newStrIndex);
        }
    }
}
