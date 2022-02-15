package q11277;
public class RuntimePolymorphismDemo {
	public static void main(String[] args) {
		Animal ref1 = new Animal();
		Animal ref2 = new Dog();
		Animal ref3 = new Cow();
		Animal ref4 = new Snake();
		ref1.WhoAmI();
		ref2.WhoAmI();
		ref3.WhoAmI();
		ref4.WhoAmI();
	}
}

// Write all the classes with methods
class Animal{
	public void WhoAmI(){
		System.out.println("I am a generic animal");
	}
}
class Dog extends Animal{
	public void WhoAmI(){
		System.out.println("I am a dog");
	}
}
class Cow extends Animal{
	public void WhoAmI(){
		System.out.println("I am a cow");
	}
}
class Snake extends Animal{
	public void WhoAmI(){
		System.out.println("I am a snake");
	}
	
}
