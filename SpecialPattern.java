import java.util.*;

public class SpecialPattern{
    public static void main(String[] args){
    String str;
    Scanner ic = new Scanner(System.in);
    try{
        str = ic.next();
    }
    finally{
        ic.close();
    }
    
    boolean root = false;
    for(int i=0;i<str.length()-2;i++){
        if(str.charAt(i)=='p' && str.charAt(i+2) == 'p'){
            root = true;
            break;
           }  
    }
    if(root)
        System.out.println("True");
    else
        System.out.println("False");
    }
}