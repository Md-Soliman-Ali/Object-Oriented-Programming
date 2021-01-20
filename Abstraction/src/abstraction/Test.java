package abstraction;


public class Test {
    
    public static void main(String[] args)
    {
      mobileuser mo;
      
      mo = new Rahim();
      mo.call();
      mo.sendMessage();
      
      mo = new karim();
      mo.sendMessage();
    }
}