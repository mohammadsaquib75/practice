package SCALER;

import java.util.HashMap;

public class TwoSumArrayNdReturnIndices {
    public static void main(String[] args) {
        int[] arr = {1, 4, 9, 5, 3, 8 ,7,10};
        int target =15;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<i; j++){
        //         if(arr[i]+arr[j] == target){
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }
        int []ans = new int [2];
        HashMap<Integer,Integer> map = new HashMap<>(); 
        for(int i=0; i<arr.length; i++){
        int Sno = target - arr[i];
        if(map.containsKey(Sno)){
            ans[0] = map.get(Sno);
            ans[1] = i;
            break;
        }
        map.put(arr[i], i);
    }
    System.out.println(ans[0]+" "+ans[1]);
}
}
