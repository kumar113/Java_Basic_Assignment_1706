import java.util.Scanner;
public class ReverseString {
    public String toReverseString(String str){
        int len,i;
        len=str.length();
        String reversed_String = "";
        for(i=len-1;i>=0;i--){
            reversed_String += str.charAt(i); 
        }
        return reversed_String;
    }
     public static void main(String[] args){
        String str;
        
        Scanner ic = new Scanner(System.in);
        try{
            System.out.println("Enter String:");
            str = ic.nextLine();
        }
        finally{
            ic.close();
        }
        
        ReverseString r_str = new ReverseString();
        System.out.println(r_str.toReverseString(str));
     }
}
