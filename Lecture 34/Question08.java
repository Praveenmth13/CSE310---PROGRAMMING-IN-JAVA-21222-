package q11272;
class SuperClass {
	int num;
	public SuperClass(int value) {
		num = value;
	}
	public void printHello() {
		System.out.println("Hello from SuperClass");
	}
}
class SubClass extends SuperClass {
	int num;
	public SubClass(int value) {
		super(value);
		num = value + 5;
		System.out.println("SuperClass number = " + super.num);
		System.out.println("SubClass number = " + num);
	}
	public void printHello() {
		super.printHello();
		System.out.println("Hello from SubClass");
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		SubClass obj = new SubClass(10);
		obj.printHello();
	}
}
