package Inheritance;

public class Animal {
	
	Animal()
	{
		System.out.println("Animal Has Been Created ..!");
	}
	public void eat()
	{
		System.out.println("Eating !");
	}
	
	public void sleep()
	{
		System.out.println("Sleeping !");
	}

}

class cat extends Animal
{
	public void meaw()
	{
		System.out.println("Meaw !");
	}
}
