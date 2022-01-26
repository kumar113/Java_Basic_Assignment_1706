import java.util.Scanner ;

public class RemoveCharacter {
    public static void main(String[] args){
        int i,len;
        String filteredString = "";
        String unfilteredString = "";
        char whatToRemove;
        Scanner ic = new Scanner(System.in);
        try{
            System.out.println("Enter a String:");
            unfilteredString = ic.next();
            System.out.println("Enter a specified character which have to remove from given String:");
            whatToRemove = ic.next().charAt(0);
        }
        finally{
            ic.close();
        }
       
        //taking length of input String..
        len=unfilteredString.length();
        for(i=0;i<len;i++){
            if(unfilteredString.charAt(i)!=whatToRemove)
                filteredString+= unfilteredString.charAt(i);
        }
         // printing required string 
        System.out.println(filteredString);
    }
}
