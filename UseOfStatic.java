
class Name {
    //print age using static variable:
    static int age = 22;

    //print lastname using static method:
    static String lastName(){
        return "boss";
    }

    //print firstname using static block:
    static {
         String firstname = "Alpha";
         System.out.println("Firstname is:" + firstname);
    }
}
public class UseOfStatic {
  public static void main(String[] args) {
      System.out.println("Lastname is :" + Name.lastName() + "\nage is :" + Name.age);
  }
}
