package CollectionFrameWork;

import java.util.HashSet;

import java.util.*;

public class HashSetExamole2 {

    public static void main(String[] args) {

        HashSet<String> book = new HashSet<>();

        book.add("Java");
        book.add("C++");
        book.add("Python");
        book.add("HTML");
        System.out.println(book);

        boolean containsJava = book.contains("Java"); /// check list have this book or not
        System.out.println("Contains java "+containsJava);

        System.out.println("Book in the set ");

        Iterator<String> iterator = book.iterator();

        while(iterator.hasNext()){
            String kitab = iterator.next();
            System.out.println(kitab);
        }

        book.clear();

        System.out.println("After clear book size is = "+book.size());



    }

}
