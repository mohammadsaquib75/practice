import java.util.Scanner;

public class binarySearch {

//     public static int BinarySearch(int[] input, int elem){
//         int start=0;
//         int end = input.length-1;
//         while(start<=end){
//         int mid = (start + end)/2;
//         if(elem==input[mid]){
//             return mid;
//         }
//         else if(elem>input[mid] ){
//             start=mid+1;
//         }
//         else{
//             end=mid-1;
//         }
//     }
//     return -1;
// }
// public static void main(String[] args) {
//     int [] input={2,5,11,45,65,78,89,101,209};
//     int index= BinarySearch(input, 89);
//     System.out.println(index);
//     }
    


    static int binarySrch(int[] arr, int x){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            int mid = (start+end)/2;
            if(x==arr[mid]){
                return mid;
            }

            if(x>arr[mid]){
                start=mid+1;
            }else{
                end = end -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.print("enter the size of an Array = ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int []arr = new int[n];

        System.out.print("Enter "+n+ " element = ");
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Element X = ");
        int x=sc.nextInt();

        System.out.println(+x+" is at index "+binarySrch(arr, x));
    }
}