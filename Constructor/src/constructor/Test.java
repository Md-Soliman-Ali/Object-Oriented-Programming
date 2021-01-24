package constructor;

public class Test {
    
    public static void main (String[] args )
    {
      Teacher Teacher1 = new Teacher ("BABY", "FEMALE", 69225);
      Teacher1.displayInformation();
      
      Teacher Teacher2 = new Teacher();
      Teacher2.displayInformation();
    }
}
