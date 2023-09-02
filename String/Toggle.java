package String;
import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder str=new StringBuilder(sc.nextLine());


        for(int i=0; i<str.length(); i++){
            boolean capital=true; //true->  Capital
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(ch==' ') continue;
            if(asci>=97) capital=false; //small letter
            if(capital==true){
                asci+=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }else{
                asci -=32;
                char dh=(char)asci;
                str.setCharAt(i, dh);
            }
    }
    System.out.println(str);
    }
}
