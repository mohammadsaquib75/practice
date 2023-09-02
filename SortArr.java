import java.util.Arrays;

public class SortArr {
    public static void main(String[] args) {
        int[] arr = { 2, 1, 3, 9, 12, 5, 45,0 };

        // int[] sortArr = new int[arr.length];
        int ans=0;

        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1; j<arr.length; j++){
                if(arr[j]<arr[i]){
                    ans=arr[i];    
                    arr[i]=arr[j];
                    arr[j]=ans;
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            
        }
        
    }
    
}
