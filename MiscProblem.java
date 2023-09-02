import javax.management.Query;

public class MiscProblem {

    static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

// swap the number
    static void swapNum(int a, int b){
        System.out.println(("Befor swap a is = "+a+ " and b is = "+b));
        int temp = a;
        a=b;
        b=temp;
        System.out.println("after swap a is = "+a+ " after swap b is = "+b);
    }



// swap 2 integer using sum and difference methods
    static void SwapSmNdif(int a, int b){
        System.out.println(("Befor swap a is = "+a+ " and b is = "+b));
        a=a+b; //let a=5 b=3
        b=a-b;
        a=a-b;
        System.out.println("after swap a is = "+a+ " after swap b is = "+b);

    }

// Swap array methode

static void SwapArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    // reverse an array

    static int[]  reverseArray(int[] arr){
        int n=arr.length;
        int[] ans = new int[n];
        // int k=0;
        // for(int i=n-1; i>=0; i--){
        //         ans[k++]=arr[i];
        //     }

        int i=n-1, j=0;
        while(i>=0){
            ans[j++]=arr[i--];
        }
        return ans;
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
//Array Rotation k times rotate one by one
    static int[] Rotate(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        int j=0;
        int[] ans=new int[n];
        for(int i=n-k; i<n; i++){
            ans[j++]=arr[i];
        }
        for(int i=0; i<n-k; i++){
            ans[j++]=arr[i];
        }
        return ans;

    }
//Revere array
    static void reverse(int[] arr, int i, int j){
        while(i<j){
            SwapArray(arr, i, j);
            i++;
            j--;
        }
    }

//Rotate array without create new aarray 

    static void RotateInPlace(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }
// query 5 and check all are in array or not ? if yes then print yes if nit print no

    static void FindQuery(int[] arr, int query){
            for(int i=0; i<=query; i++){
                System.out.println("Enter the query first "+i);
            int[] frequency=new int[100005];
            for(int j=0; j<arr.length; i++){
                if(query==arr[j]){
                    frequency[arr[i]]++;
                    query++;
                    System.out.println(+query+ "yes");
                }else{
                    System.out.println(+query+" no");
                }
            }
        }
    }
    private static void frequency(int i) {
    }

    public static void main(String[] args) {
        int a=9;
        int b=91;
        int k=103;

        int[]arr= {1,3,4,5,6,8};
        // int[] ans=reverseArray(arr);
        // printArr(ans);

        // swapNum(a, b);

        // SwapSmNdif(a, b);

        // reverseArr(arr);
        printArr(arr);

        // int[] ans=Rotate(arr, k);
        // System.out.println("Array after rotation = ");
        // printArr(ans);
        // System.out.println("Rotatate in place = ");
        // RotateInPlace(arr, k);
        // printArr(arr);
        int query=5;
        FindQuery(arr, query);
        
    }
}
