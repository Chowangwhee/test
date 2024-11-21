import java.io.*;

public class NewNewNew {
    public static void main(String[] args) throws IOException {
        //input.txt 에 있는 데이터를 읽어서 output.txt 에 저장

        try(
            BufferedReader br=new BufferedReader(new FileReader("input.txt"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("output.txt"));
        ){
            String str;

            while((str= br.readLine())!=null){
                bw.write(str);
                bw.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }


    }
}
