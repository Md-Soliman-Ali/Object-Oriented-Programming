class Animal
{
	public void sound()
	{
		System.out.println("Animal Is Making A Sound");
	}
}

class Cat extends Animal
{
	public void sound()
	{
		System.out.println("Meaw");
	}
}

public class Method_Overriding {
	
public static void main(String[] args) {
		
		Cat cat = new Cat();
		cat.sound();
		
		//100% Runtime Polymorphism
		
		Animal animal = new Cat();
		animal.sound();
		
		//Down Casting
		
		Cat c = (Cat) animal;
		cat.sound();
		
	}

}
