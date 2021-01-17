package inperson;


public class Inperson {
    
         String name;
         int age;
         int nid;
         
        public void display()
                
        {
            System.out.println("Name:"+ name);
            System.out.println("Age:"+ age);
            System.out.println("Nid:"+ nid);
        }
    }

   class teacher extends Inperson
{
     String university;
     String dept;
     int semester;
     
      public void show()
    {
       System.out.println("Degree:"+ university); 
       System.out.println("Dept:"+ dept); 
       System.out.println("semester:"+ semester); 
    }
    
    public static void main(String args[])
    {
        teacher T=new teacher();
        T.name="omar";
        T.age=30;
        T.nid=1011447;
        T.university="DIU";
        T.dept="cse";
        T.semester=4;
        T.display();
        T.show();
    }
    
}




