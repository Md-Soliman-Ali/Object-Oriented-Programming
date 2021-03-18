class studentinfo{
	
	int id;
	String phone;
	String name;
    
	studentinfo(int a, String b)
	{
		id = a;
		name = b;
	}
	
	studentinfo(int a, String b, String c)
	{
		id = a;
		phone = b;
		name = c;
	}
	
	void display()
	{
		System.out.println(id + " " +phone + " " +name );
	}
}

public class Constructor {

public static void main(String[] args) {
		
		studentinfo info = new studentinfo(28, "Arena");
		info.display();
		
		studentinfo info2 = new studentinfo(28, "+8801706994692" , "Arena");
		info2.display();
	}

}
