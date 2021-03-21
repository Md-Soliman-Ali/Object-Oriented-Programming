package OOP;

import java.util.ArrayList;
import java.util.Iterator;

public class User {
	
	public static void main (String[]args)
	{
		Student student = new Student();
		Courses c1 = new Courses("Bangla", "101", 3.0);
		Courses c2 = new Courses("English", "102", 3.0);
		
		ArrayList<Courses> course = new ArrayList<Courses>();
		course.add(c1);
		course.add(c2);
		
		student.setCourse(course);
		
		Iterator iterator = course.iterator();
		
		while (iterator.hasNext())
		{
			Courses s1 = (Courses) iterator.next();
			System.out.println(s1.getCoursename()+" "+s1.getCoursecredit()+" "+s1.getCoursecode());
		}
	}

}
