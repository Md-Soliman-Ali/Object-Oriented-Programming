package instudent;


public class Instudent {
       
        String name;
        int age;
        public void display()
                
        {
            System.out.println("Name:"+ name);
            System.out.println("Age:"+ age);
        }
}



class teacher extends Instudent
{
    String degree;
    
    public void show()
    {
       System.out.println("Degree:"+ degree); 
    }
    
    public static void main(String args[])
    {
        teacher T=new teacher();
        T.name="omar";
        T.age=30;
        T.degree="Bsc";
        T.display();
        T.show();
    }
    
}