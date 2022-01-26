import java.util.Scanner;
public class CheckDigit {
    public static void main(String args[]) {
        int digitarr[]=new int[9];
        int i,Sum=0,n;
        Scanner ic = new Scanner(System.in);
        System.out.println("Enter a nine digit integer:");
        for(i=0;i<9;i++)
        {
            digitarr[i]=ic.nextInt();
            Sum+=digitarr[i];
        }
        for(i=0;i<9;i++)
        {
             digitarr[digitarr[i] %9]= digitarr[digitarr[i] % 9]+9;
        }
        int checkdigit=0;
        for (i = 0; i <9; i++) 
        {
          if (digitarr[i] >= 9*2)
              checkdigit=i;
        }
        n=(Sum-checkdigit)%10;
        if(checkdigit==n)
            System.out.println("Okay");
        else
            System.out.println("Not Okay");
      }
}
