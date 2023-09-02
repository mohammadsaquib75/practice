package TwoDArray;

import java.util.Scanner;

public class MultiDimensionalArray {
    
    static void printArray(int [][] arr){
        for(int i=0; i<arr.length; i++){ // row
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Rows = ");
        int r= sc.nextInt();
        System.out.println("Enter the number of column = ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];
        System.out.println("Enter " +r*c+ " Elements = ");

        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j]=sc.nextInt();
            }
        }

        printArray(arr);
    }
}
