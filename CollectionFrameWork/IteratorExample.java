package CollectionFrameWork;
import java.util.ArrayList;
import java.util.List;

import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("PineApple");

        Iterator<String> iterator = fruits.iterator();
        while(iterator.hasNext()){
            String fruit = iterator.next();
            System.out.println(fruit);
        }

    }
    
}
