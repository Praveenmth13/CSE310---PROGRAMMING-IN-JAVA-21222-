package q11273;
class Animal {
	public Animal() {
		System.out.println("Animal is created");
		
	}
	void eat() {
		System.out.println("Eating something");
		
	}  
}  
class Dog extends Animal { 
	public Dog() {
		System.out.println("Dog is created");
		
		
	}
	void eat() {
		System.out.println("Eating bread");
		
	}
	void bark() {
		System.out.println("Barking");
		
	}  
	void work() {  
		super.eat();
		eat();
		bark();
		
	}  
}  
public class ExampleOnSuper { 
	public static void main(String args[]) {
		Dog d = new Dog();  
		d.work();  
	}
}
