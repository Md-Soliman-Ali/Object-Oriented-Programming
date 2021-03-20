package Inheritance;

public class Dog extends cat {
	
	public void bark()
	{
		System.out.println("Barking");
	}

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.eat();
	}

}
