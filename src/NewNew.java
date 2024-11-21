import java.io.*;

class Stu implements Serializable {
    private String name;
    private String id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class NewNew {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        ObjectOutputStream out=null;
//
//        try{
//            out = new ObjectOutputStream(new FileOutputStream("dob.dat"));
//
//            Stu s=new Stu();
//            s.setName("길동");
//            s.setId("123");
//            s.setAge(33);
//
//            //필드 3개를 직렬화    -p.811
//            out.writeObject(s);
//
//        }catch (Exception e){
//            throw new RuntimeException(e);
//        }
//        out.close();

        FileInputStream fis=new FileInputStream("dob.dat");
        ObjectInputStream ois=new ObjectInputStream(fis);

        Stu s=(Stu)ois.readObject();

        System.out.println(s.getName());
        System.out.println(s.getId());
        System.out.println(s.getAge());
        ois.close();

    }
}
