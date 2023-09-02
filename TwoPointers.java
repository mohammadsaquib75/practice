import java.util.Arrays;
import java.util.Scanner;

import javafx.print.PrintColor;


public class TwoPointers {

    static void PrinaArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void Swap(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    // Swap array methode

    static void SwapArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    //Reverse Array without creating new Array
    static void reverseArr(int[] arr){
        int i=0, j=arr.length-1;
        while(i<j){
            SwapArray(arr, i, j);
            i++;
            j--;
        }
    }


//01010101 sort the element

    static void SortZerosAndOnes(int[] arr){
        int zeros=0;
        //count nmber of zeros
        for(int i=0; i<arr.length; i++){
            if(arr[i]==0){
                zeros++;
            }
        }

        //0 to zeros-1:0, Zeros to n-1 : 1

        for(int i=0; i<arr.length; i++){
            if(i<zeros){
                arr[i]=0;
            }
            else{
                arr[i] =1;
            }
        }
    }
//short an array consisting onlys 0s and 1s

    static void ZeroAnOnes(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]==1 && arr[j]==0 ){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[i]==0){
                i++;
            }
            if(arr[j]==1){
                j--;
            }
            
        }
    }

// even can be be in starting array and odd will be end

    static void EevnOddArrange(int []arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<j){
            if(arr[i]%2 == 1 && arr[j]%2 == 0 ){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
                
            }

            if(arr[i]%2==0){
                i++;
            }

            if(arr[j]%2 == 1){
                j--;
            }
        }  
    }

// Given an Array of non decreasing order sqaure them and print them in non decreasing orderr

    static void ArraySqaure(int[] arr){
        int i=0;
        while(i<arr.length){
            arr[i]=arr[i]*arr[i];
            i++;
        }
    }

// Sort Array sqaures in ascending order

    static int[] sortSqaure(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        int[] ans=new int[n];
        int k=0;
        while(left<=right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++]=arr[left] * arr[left];
                left++;
            }else{
                ans[k++]=arr[right]*arr[right];
                right--;
            }
        }

        return ans;
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter Array Size = ");
        int n=sc.nextInt();
        int[]arr=new int[n];

        System.out.print("Enter "+ n+ " Elements = ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }

            System.out.println("print ORignal array  = ");
            PrinaArray(arr);

            // SortZerosAndOnes(arr);
            // System.out.println("after sort ");
            // PrinaArray(arr);

            // ZeroAnOnes(arr);
            // System.out.println("After sort = ");
            // PrinaArray(arr);

            // EevnOddArrange(arr);
            // System.out.print("After sort = ");
            // PrinaArray(arr);

            // ArraySqaure(arr);
            // System.out.println("After Sqaure = ");
            // PrinaArray(arr);

            System.out.println("Print original Array = ");
            PrinaArray(arr);            

            int[] ans=sortSqaure(arr);
            System.out.println("after squaring = ");
            reverseArr(ans);
            PrinaArray(ans);
            
        }
    }
