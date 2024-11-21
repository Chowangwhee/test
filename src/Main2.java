import java.io.*;

public class Main2 {
    public static void main(String[] args) {

        //콘솔창에 문자를 입력해서 입력한 문자를 파일에 저장

        BufferedReader br=null; //입력하기 위한 문자형 입력 스트림
        PrintWriter pr=null;    //출력하기 위한 문자형 출력 스트림

        try{
            InputStreamReader in=new InputStreamReader(System.in);  //ctrl+d 문자열 입력 끝맺음 키
            br=new BufferedReader(in);
            //p.799
            //=BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            FileWriter fw = new FileWriter("d.txt");
            //d.txt
            pr=new PrintWriter(fw);

            String str=null;
            while ((str=br.readLine())!=null){
                pr.println(str);
            }
            br.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            pr.close();
        }
    }
}
