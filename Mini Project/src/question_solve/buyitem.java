package question_solve;
import java.util.*;
public class buyitem extends item {
    private String buyDate;
    private int quantity;
    
    public void buy(ArrayList <item> i){
        System.out.println("Buying Details: ");
        System.out.println("Buy Date: " +this.buyDate);
        System.out.println("Quantity: " +this.quantity);
        
        for (item I:i){
           System.out.println("Buying Item: " +I.getitemID());
           System.out.println("Buying Price: " +I.getprice()+ "Taka");
            System.out.println("\n");
        }
    }
    
    public static void main (String[]args)
    {
        customer c = new customer();
        c.setcustomerID("OMAR");
        c.setpassword("RAMO");
        c.displaycustomer();
        
        item i1 = new item ();
        i1.setitemID("Books");
        i1.setprice(1000);
        
         item i2 = new item ();
        i2.setitemID("Pen");
        i2.setprice(100);
        
         item i3 = new item ();
        i3.setitemID("Fruits");
        i3.setprice(500);
        
        ArrayList <item> i = new ArrayList<item>();
        i.add(i1);
        i.add(i2);
        i.add(i3);
        
        buyitem b = new buyitem();
        b.buyDate = "05-11-2019";
        b.quantity = 3;
        b.buy(i);
    }
}

