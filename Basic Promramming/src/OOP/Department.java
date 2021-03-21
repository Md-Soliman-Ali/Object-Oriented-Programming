package OOP;

public class Department {
	
	private String departmentname;
	private String departmentbuilding;
	
	public Department(String departmentname, String departmentbuilding) 
	{
		super();
		this.departmentname = departmentname;
		this.departmentbuilding = departmentbuilding;
	}

	public String getDepartmentname() 
	{
		return departmentname;
	}

	public void setDepartmentname(String departmentname) 
	{
		this.departmentname = departmentname;
	}

	public String getDepartmentbuilding() 
	{
		return departmentbuilding;
	}

	public void setDepartmentbuilding(String departmentbuilding) 
	{
		this.departmentbuilding = departmentbuilding;
	}

}
