import java.util.Scanner;
// given Q queries , and check given number is present in array or not
// note value of all ement is less than 10 to the power 5
public class PresentQuery {
    static int[] makeFrequencyArray(int []arr){
        int[] freq=new int[10005];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int n=sc.nextInt();
        int[] arr=new int[n];

        
            System.out.println("Enter the elemnt of "+n+ " Size 5Array = ");
            for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the number of query = ");
        int q = sc.nextInt();

        int[] freq =makeFrequencyArray(arr);

        while(q>0){
            System.out.println("Enter number to be searched = ");
            int x=sc.nextInt();
            if(freq[x]>0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
            q--;
        }
        
        
    }
}
