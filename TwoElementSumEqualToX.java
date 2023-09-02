public class TwoElementSumEqualToX {
    public static void main(String[] args) {
        int[] arr={1,4,5,6,3};
        int x = 10;
        int count = 0;

        for(int i=0; i<arr.length-2; i++){
            for(int j=i+1; j<arr.length-1; j++){
                for(int k=i+j+1; k<arr.length; k++){
                if(arr[i]+arr[j]+arr[k]==x){
                    count++;
                }
            }
        }
    }
        System.out.println("The number of count = "+count);
    }
    
}

// trplet sum equal to x