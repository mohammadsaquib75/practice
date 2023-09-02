public class QuickSort {

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void sortQuick(int []a){
        int pivot = a.length-1;
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                if(a[i]<pivot){
                    swap(a, i, j);
                    i++;
                }else if(a[i]>pivot){
                    i++;
                }
            }
        }
    }



    public static void main(String[] args) {
        int []a={10,80,30,90,40};
        sortQuick(a);
        for(int i=0;i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
