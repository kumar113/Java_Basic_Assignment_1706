class ExceptionForAtm extends Exception{
    public ExceptionForAtm(String message)
    {
        super(message);
    }
}
public class CustomException {
    static void toValidate(int person) throws ExceptionForAtm{
        if(person > 1)
        {
            throw new ExceptionForAtm("Person is not allowed for Entry at This Time!!");
        }
        else
        {
            System.out.println("Welcome!!");
        }
    }
    public static void main(String[] args)
    {
        try
        {
            toValidate(3);
        }
        
        catch(ExceptionForAtm e)
        {
            System.out.println("Caught the exception");
            System.out.println("Exception occured "+ e);
        }
        
    }
}
