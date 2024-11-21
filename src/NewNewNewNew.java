import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class Rec{
    int a,b;
    Rec(int a,int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println(a+" "+b);
    }
}

public class NewNewNewNew {
    public static void main(String[] args) throws IOException {

        ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("obj.dat"));

        Recr r=new Recr(4,5);
        os.writeObject(new Recr(4,6));
        os.writeObject(new Recr(6,7));
        os.writeObject(new String("aa"));

        os.close();

    }
}
