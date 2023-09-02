import java.util.Arrays;

class Solution
{
    public static int firstElementKTime(int[] a, int n, int k) { 
        int count=0;
        int temp=0;
        Arrays.sort(a);
        int i=0;
        while(i<n){
            if(a[i]==a[i+1]){
                count++;
                temp = a[i];
            } 
            if(count==k){
                return temp;
            }
        }
        return -1;
    } 

    public static void main(String[] args) {
        int[] a={1,7,4,3,4,8,7};
        int n=7;
        int k=2;
        firstElementKTime(a, n, k);
        
    }
}