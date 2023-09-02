class A{    

public static void main(String[] args) {

    //print not repeated element in an array
    // int[] arr = {1,2,3,3,2,2,3,3,2,1,5,11,12,6,7,7,6,5,9,8,8,10,10};
    // int[] notRepeat = new int[arr.length];
    // int unique=0;
    // for(int i=0; i<arr.length; i++){
    //     int count=0;
    //     for(int j=0; j<arr.length; j++){
    //         if(arr[i]==arr[j]){
    //             count++;
    //         }
    //     }
    //     if(count==1){
    //         notRepeat[unique]=arr[i];
    //         unique++;
    //         }
    //     }
    //     if(unique==0){
    //         System.out.println("There is not any Unique element");
    //     }else{
    //         for(int i=0; i<unique; i++){
    //         System.out.print(+notRepeat[i]+" ");
    //         }
    //     }
    // }

    int[] arr= {1,2,3,4,3,2,1};
    for(int i=0; i<arr.length-1; i++){
        for(int j=i+1; j<arr.length; j++){
            if(arr[i]==arr[j]){
                arr[i]=-1;
                arr[j]=-1;
            }
        }
    }
        int ans=-1;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>0)
            ans=arr[i];
        }
        System.out.println(ans);
    }
    
}
