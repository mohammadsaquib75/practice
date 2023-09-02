package Stack;

import java.util.Deque;
import java.util.LinkedList;

public class StackMethod {
    public static void main(String[] args) {
        Deque<Integer> stack = new LinkedList<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println("stack = " +stack);

        int poppedElement = stack.pop();
        System.out.println("Popped Element " + poppedElement);

        System.out.println("After pop =  "+stack);

        System.out.println("Stack Size = "+ stack.size());

        stack.push(40);
        stack.push(50);
        System.out.println("updated stack = "+stack);
        System.out.println("search "+stack);

        System.out.println("Is stack empty = "+stack.isEmpty());

        System.out.println(stack);

    }
}
