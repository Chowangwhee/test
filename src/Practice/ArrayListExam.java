package Practice;

import java.util.ArrayList;
import java.util.Iterator;

class Profile{
    String id;
    int age;

    Profile(String id,int age){
        this.id=id;
        this.age=age;
    }
}
public class ArrayListExam {
    public static void main(String[] args) {

        ArrayList<Profile> a = new ArrayList<>();

        a.add(new Profile("ID1", 21));
        a.add(new Profile("ID2", 25));
        a.add(new Profile("ID3", 32));

        for (int i = 0; i < a.size(); i++) {
            Profile p = a.get(i);
            System.out.println(p.id + " " + p.age);
        }


        ArrayList<Integer> list = new ArrayList<>();
        list.add(53);
        list.add(4);
        list.add(3);

        Iterator<Integer> it = list.iterator();   //list에 있는 값을 순차적으로 가져 옴
        while (it.hasNext()) {
            int n = it.next();
            System.out.println(n);
        }
    }
}
