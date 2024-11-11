package Practice.WhatIsJava;

import java.util.Vector;

public class WhatIsVector {
    public static void main(String[] args) {

        Vector<Integer> v=new Vector<>();
        v.add(4);
        v.add(4);
        v.add(10);
        v.add(0,20);    //index 0에 20 input

        System.out.println("벡터 개수"+v.size());
        System.out.println(v.get(0));

    }
}
