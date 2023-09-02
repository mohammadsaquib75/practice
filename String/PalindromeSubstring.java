package String;

public class PalindromeSubstring {

    static boolean Palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
            return true;
    }
    public static void main(String[] args) {
        String str="abcba";
        int count=0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+i; j<=str.length(); j++){
                if(Palindrome(str.substring(i, j))==true){
                    System.out.print(str.substring(i, j)+ " ");
                    count++;
                }
            }
        }
        System.out.println("The number of palindromic string is = "+count);

    }
}
