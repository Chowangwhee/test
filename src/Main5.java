import java.io.*;

public class Main5 {
    public static void main(String[] args) throws IOException {

        DataOutputStream out=null;
        try {
            FileOutputStream fi = new FileOutputStream("h.txt");
            out = new DataOutputStream(fi);

            //기본자료형 값을 저장할 수 있다
            int a = 5;
            double b = 3.2;
            boolean c = true;

            out.writeInt(a);
            out.writeDouble(b);
            out.writeBoolean(c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        out.close();
    }
}
