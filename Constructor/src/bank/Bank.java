package bank;

public class Bank {
        
    int amount=0;
    
    
    Bank(int n)
    {
     amount=n;
    }
    
    Bank(int n, int m)
    {
      
      amount=n+amount;
      amount=amount-m;
    }
    
    void displayinformation()
    {
     System.out.println ("amount: " +amount); 
    }
    
    public static void main(String[] args) {
        Bank Bank1=new Bank(100);
        Bank1.displayinformation();
        
        Bank Bank2=new Bank(150,100);
        Bank2.displayinformation();
        
      
    }
    
}
