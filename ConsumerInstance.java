//Instance Method Reference:
import java.util.function.BiFunction; 
import java.util.Scanner;
class AddandSub{
    public int add(int a, int b)
    {
        return a+b;
    }
    public int sub(int a, int b)
    {
        if(a>b)
        {
            return a-b;
        }
        else
        {
            return b-a;
        }
    }
}
    public class InstMeth{
        public static void main(String[] args)
        {
            BiFunction<Integer,Integer,Integer>addition=new AddandSub()::add;
            int a,b;
            Scanner ic=new Scanner(System.in);
            a=ic.nextInt();
            b=ic.nextInt();
            //result 1
            int x1=addition.apply(a,b);
            
            BiFunction<Integer,Integer,Integer>subt=new AddandSub()::sub;
            a=sc.nextInt();
            b=sc.nextInt();
            //result2 
            int x2=subt.apply(a,b);
            System.out.println("Sum: "+ x1 +" Difference: "+ x2);
        }
    }


//Consumer
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerInt{
    static void addList(List<Integer>list)
    {
        int res=list.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of List: "+res);
    }
    
    public static void main(String[] args)
    {
        List<Integer>list=new ArrayList<Integer>();
        list.add(20);
        list.add(23);
        list.add(8);
        list.add(13);
        Consumer<List<Integer>>consumer=ConsumerInt::addList;
        consumer.accept(list);
    }
}

//Function
import java.util.function.Function;
public class FuncInt{
    static String show(String msg){
        return "Hello" + msg;
    }
    
    public static void main(String[] args)
    {
        Function<String, String> fun=FuncInt::show;
        System.out.println(fun.apply(" User"));
    }
}

//Predicate
import java.util.function.Predicate;
public class PredicateInt{
    static Boolean checkValidity(int height)
    {
        if(height>140)
        return true;
        else
        return false;
    }
    public static void main(String[] args)
    {
        Predicate<Integer> pred =PredicateInt::checkValidity;
        boolean result=pred.test(153);
        System.out.println(result);
    }
}

//Supplier
import java.util.function.Supplier;
public class SupplierInt{
    public static void main(String[] args)
    {
        Supplier<Double> value=()->Math.random();
        System.out.println(value.get());
    }
}

//Default Method access for interface.

interface Inter{
    public static int val=130;
    public default void display()
    {
        System.out.println("This is the interface!!");
    }
}


public class InterDef implements Inter{
    public static void main(String[] args)
    {
        InterDef obj= new InterDef();
        System.out.println("Using Default Method:");
        obj.display();
    }
}

//Static Method access to interface
interface Inter{
    public static int val=100;
    public void demoMethod();
    public static void display()
    {
        System.out.println("Using the Static Method!!");
    }
}

public class InterStat{
    public void demoMethod()
    {
        System.out.println("Demo method");
    }
    public static void main(String[] args)
    {
        InterStat obj=new InterStat();
        obj.demoMethod();
        Inter.display();
    }
}

/*Overriding the default method:*/

interface Inter{
    public static int val=130;
    public default void display()
    {
        System.out.println("This is interface display!!");
    }
}

public class InterDef implements Inter{
    public void display()
    {
        System.out.println("Display has been overridden");
    }
    public static void main(String[] args)
    {
        InterDef obj=new InterDef();
        obj.display();
    }
}


//Default methods accessed using Multiple Inheritance
interface Race{
    String run();
    String speedUp();
    String slowDown();
    
}
interface Stance{
    default String onTheMarks()
    {
        return "Be on the Marks";
    }
    default String relax()
    {
        return "Be normal";
    }
}
public class Runner implements Race, Stance {
    private String running;
    
    public String run()
    {
        running=" The Runner is running";
        return running;
    }
    
    public String speedUp()
    {
        return "The runner is speeding up.";
    }
    
    public String slowDown()
    {
        return "The runner is slowing down.";
    }
    
    public String onTheMarks()
    {
        return "Get on the Marks";
    }
    public String relax()
    {
        return "You can relax now!!";
    }
    public static void main(String[] args)
    {
    Race race= new Runner();
    Stance pos= new Runner();
    System.out.println("From the stance class: "+ pos.onTheMarks());
    System.out.println("From the race class: "+ race.run());
    }
    
}


//b.
interface EmployeeData{
    public abstract Employee getEmpData(String Empname, int Empage, String EmpempCity);
}

class Employee{
    String empName;
    int empAge;
    String empCity;
    public Employee(String empName, int empAge, String empCity)
    {
        this.empName=empName;
        this.empAge=empAge;
        this.empCity=empCity;
    }
}

public class ConsumerInstance{
    public static void main(String[] args)
    {
        EmployeeData empData=Employee::new;
        Employee emp=empData.getEmpData("Aman",22,"Ghaziabad");
    }
}
