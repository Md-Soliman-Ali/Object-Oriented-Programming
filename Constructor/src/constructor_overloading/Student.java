package constructor_overloading;

public class Student {
               
	        String name,gender;
	        int phone;
	        
	        Student()
	        {
	        	System.out.println("");
	        }
	        
	        Student(String n, String g)
	        {
	        	name = n;
	        	gender = g ;
	        	
	        }
	        
	        Student(String n, String g, int p)
	        {
	        	name = n ;
	        	gender = g ;
	        	phone = p ;
	        }
	        
	        void displayInformation ()
	        {
	        	System.out.println("name : " +name);
	        	System.out.println("gender : " +gender);
	        	System.out.println("phone : " +phone);
	        	
	        }
	        
	        public static void main (String[] args)
	        {
	        	Student Student1 = new Student ();
	        	Student1.displayInformation();
	        	Student Student2 = new Student ("omar","male");
	        	Student2.displayInformation();
	        	Student Student3 = new Student ("omar", "male" ,69225);
	        	Student3.displayInformation();
	        	
	        }
}