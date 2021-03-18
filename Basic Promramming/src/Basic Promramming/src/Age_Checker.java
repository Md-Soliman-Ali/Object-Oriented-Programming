import java.util.Scanner;

public class Age_Checker {

public static void main(String[] args) {
		
		System.out.print("Enter Your Age: ");
		Scanner sc = new Scanner (System.in);
		int age = sc.nextInt();
		
		if (age<60)
		{
			System.out.println("Your Input Age Is Less Then 60");
		}
		
		else
		{
			System.out.println("Your Input Age Is Gatter Then 60");
		}
	}
}
