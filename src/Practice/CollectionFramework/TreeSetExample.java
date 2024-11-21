package Practice.CollectionFramework;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(30);
        treeSet.add(100);
        treeSet.add(50);

        System.out.println(treeSet.first());

        System.out.println(treeSet.last());

        System.out.println(treeSet.lower(80));

        System.out.println(treeSet.higher(80));

    }
}
