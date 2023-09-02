import java.util.Arrays;
import java.util.Scanner;

public class CountSPelem {
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

// find how many X element are repeated
    static int repeatElement(int []arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
// find the last occurence of element X in array and print that last index
    static int lastOccurence(int[] arr, int x){
        int LastIndext = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
                LastIndext = i;
            }
        }
        return LastIndext;
    }
// find how many elements are greater than X
    static int greaterElement(int[] arr, int x){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>x){
                count++;
            }
        }
        return count;
    }

// array is sorted or not
    static boolean sortedArray(int[] arr){
        boolean check=true;
        for(int i=1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                check =false;
                break;
            }
        }
        return check;
    }

// sort array and print 1st and last index in an array
    static int[] firstNlastIndex(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }
//sorting array
    static void sortArray(int[] arr){
        int temp;
        for(int i=0; i<arr.length-1; i++ ){
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(+arr[i]+" ");
        }
        
    }

// Add 2 element of array ans compare with X if they are equal the count them

        static int pairSum(int[] arr, int x){
            int count=0;
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i] + arr[j] == x){
                        count++;
                    }
                }
            }
            return count;
        }

// print first repeat element in an array if there is no repeated element then return -1

        static int firstRepeat(int[] arr){
            for(int i=0; i<arr.length-1; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]==arr[j]){
                        return arr[i];
                    }
                }
            }
            return -1;
        }
    public static void main(String[] args) {
        int n;
        //take input size of array
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array = ");
        n=sc.nextInt();
        int[] arr = new int[n];

        //take input array of element
        System.out.print("Enter "+n+ " element = ");
        for(int i=0; i<arr.length; i++){
        arr[i]=sc.nextInt();
        }

        System.out.println("Enter the X = ");
        int x=sc.nextInt();
        printArray(arr);

        // System.out.println("Elementh "+x+ " Repeat "+ repeatElement(arr, x)+" times");

        // System.out.println("last index is = "+ lastOccurence(arr, x));

        // System.out.println("Total Greater element of X is = "+greaterElement(arr, x));

        // System.out.println("Sorted Array is = "+sortedArray(arr));

        // int[] ans = firstNlastIndex(arr);
        // System.out.println("First Element is "+ans[0]+ " Last Element is = " +ans[1]);

        // System.out.println("The total pair of element equal to X is = " +pairSum(arr, x));

        System.out.println("First Repeated Element is = "+firstRepeat(arr));

        sortArray(arr);

    }
}

