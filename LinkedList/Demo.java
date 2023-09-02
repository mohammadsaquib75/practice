import java.util.*;
public class Demo {
    public static void main(String [] args){
    LinkedList l = new LinkedList();
    l.add("Sagar");
    l.add(30);
    l.add("Sagar");
    l.add("education");
    l.add(null);

    System.out.println(l);

    l.remove("education");

    System.out.println(l);

    l.add(0, "Mohammad");

    System.out.println(l);

    l.add(1, "Saquib");

    System.out.println(l);

    l.remove("Sagar");
    System.out.println(l);

    l.addFirst("WXYZ");
    System.out.println(l);
    
    l.removeLast();
    System.out.println(l);

    }
}
