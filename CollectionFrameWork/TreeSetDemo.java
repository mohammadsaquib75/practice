package CollectionFrameWork;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        names.add("Saquib");
        names.add("Hatim");
        names.add("Talha");
        names.add("Sadique");
        names.add("Saquib");

        

        System.out.println(names);

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }

        System.out.println("Total name:- " + names.size());

        String first = names.first();
        String last = names.last();

        System.out.println("First Name:- " + first);
        System.out.println("Last Name:- " + last);

        // System.out.println(names.add(null));// it will give Null Pointer Execption


// EXAMPLE 2
        TreeSet t = new TreeSet();
        t.add("a");
        t.add("A");
        t.add("C");
        t.add("D");
        t.add("B");

        System.out.println(t);
    }

}
