public class GrtrElem {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,8,9,23,45,67,5,7,32};
        int elem=10;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>elem){
                count++;
            }
        }
        System.out.println("total greate number = "+count);
    }
}
