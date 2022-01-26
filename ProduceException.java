/*a) ClassNotFound Exception.*/

public class ProduceException {
    public static void main(String args[])
    {
        try {
 
            Class.forName("ClassNotFoundException");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

/*b) NoClassDefFound error*/

class NoClassDefFound {
 
    void listenMusic()
    {
 
        System.out.println("Some Song");
    }
}

class ProduceException{
 
    
    public static void main(String args[])
    {
        NoClassDefFound newobj = new NoClassDefFound();
        newobj.listenMusic();
    } 
    //successfully compiled and generated two classes ‘NoClassDefFound.class’ 
    //and ‘ProduceException.class.’.If remove NoClassDefFound.class file and 
    //run ProduceException.class , Occur Java runtime NoClassDefFoundError..
}