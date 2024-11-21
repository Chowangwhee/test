package Practice.Stream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedWriter2 {
    public static void main(String[] args) throws FileNotFoundException {

        BufferedReader in = new BufferedReader(new FileReader("fw.txt"));
        String str;

        while (true){
            try{
                str=in.readLine();
                if(str==null){
                    break;
                }
                System.out.println(str);
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
