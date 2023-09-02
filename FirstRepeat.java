public class FirstRepeat{
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,3,4};
        // int Rpt = Integer.MIN_VALUE;
        for(int i=0; i<a.length-1; i++){
            for(int j=i+1; j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.println(a[i]);
                }
                }
            }
            System.out.println(-1);
        }
    }