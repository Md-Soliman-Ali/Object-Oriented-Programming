class Calculation
{
	public int add (int a, int b)
	{
		return a+b;
	}
	
	public int add (int a, int b, int c)
	{
		return a+b+c;
	}
	
	public double add (double a, double b)
	{
		return a+b;
	}
}

public class Method_Overloading {
	
public static void main(String[] args) {
		
		Calculation calculator = new Calculation();
		
		System.out.println(calculator.add(5, 5));
		System.out.println(calculator.add(5, 5, 5));
		System.out.println(calculator.add(5.5, 5.5));
		
	}

}
