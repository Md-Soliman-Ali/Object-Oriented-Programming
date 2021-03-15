import java.util.Scanner;

public class Multiplication {

public static void main(String[] args) {
		
		System.out.print("Enter Multiplication Number : ");
		Scanner sc = new Scanner (System.in);
		int number = sc.nextInt();
		
		for(int i = 0; i <= 10; i ++)
		{
			System.out.println (+number + " * " + i + " = " + number*i);
			
		}
		
	}
}
