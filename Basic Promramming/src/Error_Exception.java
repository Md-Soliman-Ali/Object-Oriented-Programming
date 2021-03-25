
public class Error_Exception {
	
	int a = 70;
	int b = 0 ;
	int result;
	
	int div()
	{
		result = a/b;
		return result;
	}
	

	int add()
	{
		result = a+b;
		return result;
	}

	public static void main(String[] args) {
		
		Error_Exception test = new Error_Exception();
		
		try 
		{
			System.out.println(test.div());
		}
		
		catch(Exception e)
		{
			System.out.println("Error Code");
		}
		
		System.out.println(test.add());
		
	}

}
