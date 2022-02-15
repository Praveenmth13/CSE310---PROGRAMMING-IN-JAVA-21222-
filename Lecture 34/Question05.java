package q11269;
public class InheritanceExample {
	public static void main(String[] args) {
		A a1 = new A();
		System.out.println("a1.getAValue() : " + a1.getAValue());
		B b = new B();
		System.out.println("b.getBValue() : " + b.getBValue());
		System.out.println("b.getAValue() : " + b.getAValue());
		A a2 = b;
		System.out.println("a2.getAValue() : " + a2.getAValue());
	}
}
class A {
	public int aValue = 2;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 3;
	public int getBValue() {
		return bValue;
	}
	public int getAValue() {
		return 2 * aValue;
	}
}
