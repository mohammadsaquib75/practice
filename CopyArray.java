import java.util.Arrays;
import java.util.Scanner;

public class CopyArray {
    static void printArray(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        } 
        System.out.println();
    }

    // static void changeArray(int[] arr){
    //     for(int i=0; i<arr.length; i++){
    //         arr[0]=0;
    //         arr[1]=0;
    //         System.out.print(arr[i]+ " " );
    //     }
    //     // System.out.println();

    // }
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter the size of Array = ");
    int n=sc.nextInt();
    int [] arr = new int[n];

    System.out.print("Enter " +n+ " Elements = " );
    for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
    }
    System.out.println("Original Array");
    printArray(arr);

    // int[] arr2 = arr.clone(); //method 1
        int[] arr2 = Arrays.copyOf(arr, arr.length);
    System.out.println("Copied array");
    printArray(arr2);
    

    arr2[0]=0;
    arr2[1]=1;

    System.out.println("after change arr2 original array is ");
    printArray(arr);

    System.out.println("after change arr2 is ");
    printArray(arr2);
    
   }
}
