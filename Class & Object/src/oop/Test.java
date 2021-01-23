package oop;


public class Test {
    public static void main (String[] args)
    {
        Teacher Teacher1=new Teacher();
        Teacher1.name = "OMAR";
        Teacher1.gender= "Male";
        Teacher1.phone= 69225;
        
        System.out.println("Name: " +Teacher1.name);
        System.out.println("Gender: " +Teacher1.gender);
        System.out.println("Phone: " +Teacher1.phone);
        
        
        Teacher Teacher2=new Teacher();
        Teacher2.name = "ALI";
        Teacher2.gender= "Male";
        Teacher2.phone= 52269;
        
        System.out.println("Name: " +Teacher2.name);
        System.out.println("Gender: " +Teacher2.gender);
        System.out.println("Phone: " +Teacher2.phone);
        
    }
    
}

