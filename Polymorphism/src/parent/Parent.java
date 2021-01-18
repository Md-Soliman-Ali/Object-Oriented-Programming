package parent;


public class Parent {

   public void display()
   {
       System.out.println("This is parent class");
   }
}
   class child extends Parent {
       
       public void display()
       {
           System.out.println("This is Child class");
       }    
   
   
    public static void main(String[] args) {
      
        Parent p=new Parent();
        p.display();
        child c=new child();
        c.display();
        
        
    }
    
}
