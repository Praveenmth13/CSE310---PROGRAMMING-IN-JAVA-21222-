package q11261;
public class InheritanceExample {
	public static void main(String[] args) {
		B b = new B();
		System.out.println("Invoking method getAValue() of class A on instance of class B : " + b.getAValue());
		System.out.println("Invoking method getBValue() on instance of b : " + b.getBValue());
	}
}
class A {
	public int aValue = 1;
	public int getAValue() {
		return aValue;
	}
}
class B extends A {
	public int bValue = 2;
	public int getBValue() {
		return bValue;
	}
}
