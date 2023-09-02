package String;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {

// Using String Builder check palindrome
        String str = "aaba";
        // StringBuilder sbr = new StringBuilder(str);
        // sbr.reverse();
        // String s=sbr +"";
        // if(str.equals(s)){
        //     System.out.println("its palindromic String ");
        // }else{
        //     System.out.println("its not palindrome ");
        // }



// palindrom string 

    int i=0;
    int j=str.length()-1;
    boolean check=true;
    while(i<j){
        if(str.charAt(i) != str.charAt(j)){
            check=false;
            break;
        }
        i++;
        j--;
    }
    if(check==true) System.out.println("palindrome ");
    else{
        System.out.println("not palindrome");
    }
        
    }
    
}
