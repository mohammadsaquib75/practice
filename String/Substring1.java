package String;

public class Substring1 {
    public static void main(String[] args) {
        String str ="WORLD";
        // System.out.println(str.substring(1, 5));
        // System.out.println(str.substring(0));
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<str.length()+1; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        
        }
    }
}
