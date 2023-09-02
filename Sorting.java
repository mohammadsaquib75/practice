public class Sorting {
    public static void main(String[] args) {
        int[] arr={4,1,5,3,9,6,7};
        int n=arr.length;
//selection sort
        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=i+1; j<arr.length; j++){
        //         if(arr[j]<arr[i]){
        //             int temp=arr[i];
        //             arr[i]=arr[j];
        //             arr[j]=temp; 
        //         }
        //     }
        // }

    //Bubble sort
    
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
