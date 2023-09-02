package String;

import java.util.Scanner;

public class EqualSubarray {
    
    static int FindArraySum(int[] arr){
        int totalSum=0;
        for(int i=0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;

    }

    static boolean equalSumPartitioned(int[] arr){
        int totalSum = FindArraySum(arr);
        int prefSum = 0;
        for(int i=0; i<arr.length; i++){
            prefSum += arr[i];
            int suffixSum = totalSum - prefSum;
            if(suffixSum == prefSum){
                return true;
            }
        }
        return false;
    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Size = ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " Element = ");
        for(int i=0; i<arr.length; i++){
        arr[i] = sc.nextInt();
        }

        System.out.println("Equal Partition Possible: " + equalSumPartitioned(arr));
    }
}
