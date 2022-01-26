import java.util.Scanner;
class Employee{
    private int Empid;
    private String EmpName;
    private String Empdeg;
    Employee(int empid,String empname,String Empdeg)
    {
        this.Empid=empid;
        this.EmpName=empname;
        this.Empdeg=Empdeg;   
    }
    public String print()
    {
        return "Emp id : "+ Empid + " Emp Name: "+ EmpName + " Designation: " + Empdeg;
    }
}

public class MaintainList {
    public static void  main(String[] args)
    {
        int n,i,inc;
        n=Integer.parseInt(args[0]);
        i=Integer.parseInt(args[1]);
        inc=Integer.parseInt(args[2]);
        Employee emp[]=new Employee[n];
        int id;
        String nm;
        String deg;
        Scanner sc= new Scanner(System.in);
        for(int v=i;v<n;v+=inc)
        { 
             id=sc.nextInt();
             sc.nextLine();
             nm=sc.nextLine();
             deg=sc.nextLine();
            emp[i]= new Employee(id,nm,deg);
            System.out.println(emp[i].print());
        }
    }

}