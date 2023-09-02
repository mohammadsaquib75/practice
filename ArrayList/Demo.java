package ArrayList;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add("A");
        l.add("B");
        l.add("A");
        l.add(null);
        l.add(2, "M");
        System.out.println(l);
        l.remove(2);
        System.out.println(l);
        int size=l.size();
        System.out.println(size);
        int element = (int) l.get(1);
        System.out.println(element);
        boolean isEmpty= l.isEmpty();
        System.out.println(isEmpty);
        boolean isPresent =l.contains(10);
        System.out.println(isPresent);
        // Integer[] array = l.toArray(new Integer[0]);
        l.clear();
        System.out.println(l);

    }
}