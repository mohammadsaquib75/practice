package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class RevArrList {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(3);
        l.add(5);
        l.add(7);
        l.add(9);
        System.out.println("original array = "+l);
        // int i=0;
        // int j=l.size()-1;
        // while(i<j){

        //     Integer temp = Integer.valueOf(l.get(i));
        //     l.set(i,l.get(j));
        //     l.set(j, temp);
        //     i++;
        //     j--;
        // }
        Collections.reverse(l);
                // Collections.swap(l, left, right);
        System.out.println("Reverse Array is = "+l);
    }
}
