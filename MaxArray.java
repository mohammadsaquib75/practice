import java.util.Arrays;

public class MaxArray {
    public static void main(String[] args) {
    int[] arr= {-1,-2,-1,-3,0,0,0};
    // Arrays.sort(arr);
    // int n=arr.length;
    // int secondMax =arr[n-4];
    int max= Integer.MIN_VALUE;
    int secondMax = Integer.MIN_VALUE;

    for(int i=0; i<arr.length; i++){
        if(arr[i]>max){
            secondMax=max;
            max=arr[i];
        }else if(arr[i]>secondMax && arr[i]!=max){
            secondMax=arr[i];
        }
    }
    System.out.println("Max element of an Array = "+secondMax);
    
    

    }
}
