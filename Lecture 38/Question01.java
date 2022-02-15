package q11289;
public class NonStaticInitBlockDemo {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
	}
}
class A {
	private int value;
	//below is an example of non-static initialization block
	{
		value = 3;
		System.out.println("In non-static init block 1");
	}
	public A() {
		System.out.println("In constructor");
		System.out.println("value = " + value);
	}
	//below is an example of another non-static initialization block
	{
		System.out.println("In non-static init block 2");
	}
}
