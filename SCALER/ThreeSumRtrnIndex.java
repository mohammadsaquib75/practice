package SCALER;

import java.util.Arrays;

public class ThreeSumRtrnIndex {
    public static void main(String[] args) {
        int []a = {7, -6, 3, 8, -1, 8, -11};
        int target = 0;
        int n = a.length;

        Arrays.sort(a);
        for(int i=0; i<n; i++){
            if(i==0 || (a[i] != a[i-1])){
                int j=i+1, k=n-1;
                int newTarget = target -a[i];
                while(j<k){
                    if(a[j]+a[k]== newTarget){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        //ignoring duplictaes
                        while(j<k && a[j] == a[j+1]) j++;
                        while(j<k && a[k] == a[k-1]) k--;
                        j++;
                        k--;
                    }else if(a[j]+a[k]<newTarget){
                        j++;
                    }else{
                        j--;
                    }
                }
            }
        }
    }
}
