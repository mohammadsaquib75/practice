import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the number = ");
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print(j);
                System.out.print(" ");
                j=j+1;
            }
            i=i+1;
            System.out.println();
        }
    }
}
