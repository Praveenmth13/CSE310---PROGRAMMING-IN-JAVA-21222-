package q11290;
public class StaticInitBlockDemo {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
	}
}
class A {
	//below is an example of static initialization block
	static {
		System.out.println("In static init block 1");
	}
	public A() {
		System.out.println("In constructor");
	}
	//below is an example of another static initialization block
	static {
		System.out.println("In static init block 2");
	}
}
