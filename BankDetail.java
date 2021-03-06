  
class Bank
{
    String location;
    float rateofreturn;
    Bank(String location,float rateofreturn)
    {
        this.location = location;
        this.rateofreturn=rateofreturn;
    }
    public void getDetails()
    {
        System.out.println("\nBank Location: "+ location +"\nROI: "+rateofreturn);
    }
}

class SBI extends Bank
{
    String branchId;
    public SBI(String city, float ror, String branchId)
    {
        super(city, ror);
        this.branchId = branchId;
        
        
    }
    
    public void getDetails()
    {
        super.getDetails();
        System.out.println("Branch Id: "+ branchId);
    }
}
class BOI extends Bank
{
    String branchId;
    public BOI(String city,float ror,String branchId)
    {
        super(city, ror);
        this.branchId=branchId;
    }
    
    public void getDetails()
    {
        super.getDetails();
        System.out.println("BranchId: "+ branchId);
    }
}


class ICICI extends Bank
{
    String branchId;
    public ICICI(String city, float ror, String branchId)
    {
        super(city, ror);
        this.branchId=branchId;
    }
    
    public void getDetails()
    {
        super.getDetails();
        System.out.println("BranchId: "+ branchId);
    }
}

public class BankDetail {
    public static void main(String[] args)
{
    Bank bank =new Bank("Shamli",1.5f);
    SBI sbi= new SBI("Meerut",1.3f,"sbiN22");
    BOI boi= new BOI("Greater Noida",1.4f,"boiN22");
    ICICI icici=new ICICI("Delhi",1.0f,"iciciN21");
    
    bank.getDetails();
    sbi.getDetails();
    boi.getDetails();
    icici.getDetails();
}
}

