package question_solve;

public class customer {
 
    private String customerID;
    private String password;
    
       public String getcustomerID() {
           return customerID;
       }
       
       public void setcustomerID(String customerID)
       {
           this.customerID = customerID;
       }
       
       public String getpassword()
       {
           return password;
       }
       
       public void setpassword(String password)
       {
           this.password = password;
       }
       
       public void displaycustomer(){
           System.out.println("Customer Details: ");
            System.out.println("Customer ID: " +getcustomerID());
             System.out.println("Password: " +getpassword());
              System.out.println(" \n\n");
           
       }
}

