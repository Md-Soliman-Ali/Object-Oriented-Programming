import java.util.Scanner;

public class Calculator {

public static void main (String [] args)
	
	{
		System.out.println("Enter First Value: ");
		Scanner sc1 = new Scanner (System.in);
		float number1 = sc1.nextFloat();
		
		System.out.println("Enter Second Value: ");
		Scanner sc2 = new Scanner (System.in);
		float number2 = sc2.nextFloat();
		
		float add,sub,mul,div;
		
		add = number1+number2;
		System.out.println("Addition : "+add);
		
		sub = number1-number2;
		System.out.println("Subtraction : "+sub);
		
		mul = number1*number2;
		System.out.println("Multiplication : "+mul);
		
		div = number1/number2;
		System.out.println("Division : "+div);
		
	}
}
