class Magic_Static{
	
	int id;
	String name;
	static String company = "IT";
    
	Magic_Static (int a, String b)
	{
		id = a;
		name = b;
	}
	
	static void change()
	{
		company = "Security";
	}
	
	void display()
	{
		System.out.println(id + " " +name + " " +company );
	}
}

public class Magic_Of_Static {

public static void main(String[] args) {
		
		Magic_Static.change();
		
		Magic_Static magic = new Magic_Static(28, "Arena");
		magic.display();

		Magic_Static magic2 = new Magic_Static(29, "Web");
		magic2.display();	
	}
}
