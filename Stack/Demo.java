package Stack;

import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack s= new Stack();

        s.push(10);
        s.push(20);
        s.push(29);
        s.push(50);
        System.out.println(s);
        s.push(40);
        System.out.println(s);
    
        System.out.println(s.search(10));
        System.out.println(s.search(5));

    }
    
}
