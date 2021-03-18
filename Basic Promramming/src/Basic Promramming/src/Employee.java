class EmployeeInfo{
	
	int id;
	String name;
    
	void info (int a, String b)
	{
		id = a;
		name = b;
	}
	
	void display()
	{
		System.out.println(id + " " +name );
	}
}

public class Employee {

public static void main(String[] args) {
		
		EmployeeInfo employeeinfo = new EmployeeInfo();
				employeeinfo.info(28, "Arena");
		        employeeinfo.display();
	}

}
