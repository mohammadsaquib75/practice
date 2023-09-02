package CollectionFrameWork;
import java.util.Enumeration;
import java.util.Vector;

public class EnumerationExample {
    public static void main(String[] args) {
    Vector<String> weekdays = new Vector<>();
    weekdays.add("Monday");
    weekdays.add("Tuesday");
    weekdays.add("Friday");

    Enumeration<String> enumeration = weekdays.elements();

    while(enumeration.hasMoreElements()){
        String day = enumeration.nextElement();
        System.out.println(day);
    }
    }

}
