package OOP;

import java.util.ArrayList;

public class Student {
	
	private String studentname;
	private String studentid;
	private String hobby;
	
	private Department department;
	
	private ArrayList<Courses> course;

	public Student(String studentname, String studentid, String hobby, Department department, ArrayList<Courses> course) 
	
	{
		super();
		this.studentname = studentname;
		this.studentid = studentid;
		this.hobby = hobby;
		this.department = department;
		this.course = course;
	}

	public Student()
	{
		
	}
	
	public String getStudentname() 
	{
		return studentname;
	}

	public void setStudentname(String studentname) 
	{
		this.studentname = studentname;
	}

	public String getStudentid()
	{
		return studentid;
	}

	public void setStudentid(String studentid)
	{
		this.studentid = studentid;
	}

	public String getHobby() 
	{
		return hobby;
	}

	public void setHobby(String hobby)
	{
		this.hobby = hobby;
	}

	public Department getDepartment() 
	{
		return department;
	}

	public void setDepartment(Department department) 
	{
		this.department = department;
	}

	public ArrayList<Courses> getCourse() 
	{
		return course;
	}

	public void setCourse(ArrayList<Courses> course) 
	{
		this.course = course;
	}

}
