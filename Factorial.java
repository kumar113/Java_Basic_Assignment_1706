import java.util.Scanner;
public class Factorial {
    public long firstFactorial(long num){
        if(num == 0)
        return 1;
        else
        return num * firstFactorial(num-1);
    }

    public static void main(String[] args){
        int number;
        Scanner ic = new Scanner(System.in);
        try{
            System.out.println("Enter number for factorial:");
            number = ic.nextInt();
        }
        finally{
            ic.close();
        }
        
        Factorial fact = new Factorial();
        System.out.println(fact.firstFactorial(number));
    }
}
