package OOP;

public class Courses {
	
	private String coursename;
	private String coursecode;
	private double coursecredit;
	
	public Courses(String coursename, String coursecode, double coursecredit) 
	{
		super();
		this.coursename = coursename;
		this.coursecode = coursecode;
		this.coursecredit = coursecredit;
	}

	public String getCoursename() 
	{
		return coursename;
	}

	public void setCoursename(String coursename) 
	{
		this.coursename = coursename;
	}

	public String getCoursecode() 
	{
		return coursecode;
	}

	public void setCoursecode(String coursecode) 
	{
		this.coursecode = coursecode;
	}

	public double getCoursecredit() 
	{
		return coursecredit;
	}

	public void setCoursecredit(double coursecredit) 
	{
		this.coursecredit = coursecredit;
	}

}
