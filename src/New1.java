import java.io.*;

class Recr implements Serializable {
    int a,b;
    Recr(int a, int b){
        this.a=a;
        this.b=b;
    }
    void show(){
        System.out.println(a+" "+b);
    }
}
public class New1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("obj.dat"));
        Recr r1=(Recr)in.readObject();
        Recr r2=(Recr)in.readObject();
        String r3=(String)in.readObject();

        r1.show();
        r2.show();
        System.out.println(r3);


//        //직렬화
//        ObjectOutputStream os=null;
//        os=new ObjectOutputStream(new FileOutputStream("obj.dat"));
//
//        Recr r=new Recr(4,5);
//        os.writeObject(new Recr(4,6));
//        os.writeObject(new Recr(6,7));
//        os.writeObject(new String("aa"));
//
//
//       os.close();

    }
}
