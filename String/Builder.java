package String;
import java.util.*;

public class Builder {
    public static void main(String[] args) {
        

    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());
    str.append(" SAGAR");
    str.setCharAt(0, 'l');
    str.insert(2, 'S');
    System.out.println(str);
    str.deleteCharAt(6);
    str.reverse();
    str.delete(2, 03);

    System.out.println(str);
    }
}
