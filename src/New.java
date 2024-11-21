import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class New {
    public static void main(String[] args) throws IOException {

        InputStreamReader rd=new InputStreamReader(System.in);
        //바이트 입력 스트림 -> 문자입력스트림(입력종료 ctrl+d)

        //while(true){
        //    int n=rd.read();
        //    if(n==-1){
        //        break;
        //    }
        //}

        FileWriter out=null;
        int r;

        try{
            out=new FileWriter("c.txt");
            while((r= rd.read())!=-1){
                out.write(r);   //키보드에 입력한 문자를 파일에 저장
            }
            rd.close();
            out.close();
        }catch (Exception e){}

    }
}