package CollectionFrameWork;

import java.util.*;

public class HAshSetExample {
    public static void main(String[] args) {

        HashSet h = new HashSet<>();

        h.add("A");
        h.add("B");
        h.add("C");
        h.add("null");
        h.add(10);

        System.out.println(h);
        System.out.println(h.add("A"));


    }
}