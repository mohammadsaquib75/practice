package String;

import java.util.Scanner;

public class Factorial {

    public static int factorial(int n){
        // Base case: factorial of 0 and 1 is 1
        if(n==0 || n==1){
        return 1;
    }else{
        //Recursive case: factorial of n is n multiplied by factorial of n-1
        return n*factorial(n-1);
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n = ");
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println("Factorial of " + n+ " is: "+ result);
    }
    
}
