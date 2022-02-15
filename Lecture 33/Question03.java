package q11262;
public class InheritanceExample {
	public static void main(String[] args) {
		A a = new B();
		System.out.println("a.getAValue() : " + a.getAValue());
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
