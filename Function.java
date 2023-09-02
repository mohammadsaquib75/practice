import java.util.Scanner;

public class Function {
    public static int addSum(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter a and b = ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int sum = addSum(a,b);
        System.out.println("Sum is = "+ sum);
    }
}
