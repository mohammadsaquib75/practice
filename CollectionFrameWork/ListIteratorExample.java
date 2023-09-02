package CollectionFrameWork;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.*;
public class ListIteratorExample {
    public static void main(String[] args) {
        
        LinkedList l = new LinkedList();

        l.add("Irfan");
        l.add("Nasir");
        l.add("Ehsan");
        l.add("Irsad");

        System.out.println(l);

        ListIterator ltr = l.listIterator();

        while(ltr.hasNext()){
            String s = (String)ltr.next();

            if(s.equals("Nasir")){
                ltr.remove();
            }
            else if(s.equals("Ehsan")){
                ltr.set("Talha");
            }else if(s.equals("irsad")){
                ltr.add("Hatim");
            }

        }

        System.out.println(l);
    }
}
