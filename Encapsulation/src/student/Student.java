package student;


public class Student {

   private String name;
   private int age;
   
   public void setValue(String n, int a)
           
   {
       name=n;
       age=a;
   }
   
   public String gatename()
           
   {
       return name;
   }
   
   public int gateage()
           
           {
               return age;
           }
           
    }


class program
{
    public static void main (String args[])
    {
        Student s=new Student();
        s.setValue("xyz", 20);
        System.out.println ("name: "+s.gatename());
        System.out.println ("Age: "+s.gateage());
        
    }
}
