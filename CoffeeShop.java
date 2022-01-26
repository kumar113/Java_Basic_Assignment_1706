import java.util.Scanner;
import java.lang.Math;
class Customer{
int amount;  
public void balance(int cash)
{
 System.out.println("Available Cash is: "+ cash);
 amount=cash;
}
Cashier place=new Cashier();
public void placeOrder()
{
    
    Barista barista = new Barista();
    if(amount > place.min)
    {
        System.out.println("Yes, Place The Order Please!!");
        place.getOrder(amount,"Barista");
        new java.util.Timer().schedule( 
        new java.util.TimerTask() {
            @Override
            public void run() {
                
                barista.confirm();
                System.exit(0);
            }
        }, 
        4000 
);
        
        
    }
    else
    {
        System.out.println("No, Please Add Some More Cash!!");
    }
}

}

class Cashier{
    int min=70;
    Barista barista= new Barista();
    public int getOrder(int rupi,String ordstr)
    {
        System.out.println("Order For "+ ordstr +" Is Placed!! Please Wait Sometime Until Order Get Ready");
        barista.orderQueue(1);
        System.out.println("Your Token Number Is:" +  barista.getId());
        return barista.getId(); 
    }
}
class Barista
{
   public void orderQueue(int amount )
    {
        if(amount ==1)
        {
            System.out.println("Order For Barista Is Being Prepared!!");
            amount =0;
        }
    }
    public int getId()
    {
        int min=1;
        int max=10;
        int range=max-min+1;

    //for generation of randomly generated token 
        int random = (int)(Math.random() * range) + min;
        return random;
    }
    public void confirm()
    {
    System.out.println("Hurrree ! Order Is Ready!!");
    }
}

public class CoffeeShop{
public static void main(String[] args)
{   int rupee;
    Customer cus= new Customer();
    Scanner ic = new Scanner(System.in);
    System.out.println("Enter cash!");
    try{
        rupee=ic.nextInt();
    }
    finally{
        ic.close();
    }
    
    cus.balance(rupee);
    cus.placeOrder();
}
}