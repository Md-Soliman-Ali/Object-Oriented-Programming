package bank;

public class Bank {

    
   public String name;
   
   {
       System.out.println("Account Name: Md.Soliman Ali");
   }
    
   private int account;
   private int password;
   
    public void setValue(int a, int p)
           
   {
       account=a;
       password=p;
   }
    
   public int gateaccount()
           
           {
               return account;
           }
   
    public int gatepassword()
           
           {
               return password;
           }
   
}


class program
{
    public static void main (String args[])
    {
        Bank s=new Bank();
        s.setValue(100100257, 69225);
        System.out.println ("Account Number: "+s.gateaccount());
        System.out.println ("Password: "+s.gatepassword());
        
    }
}

