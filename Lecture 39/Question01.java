package q11291;
public class StaticFieldDemo {
	public static void main(String[] args) {
		A.aStaticField = 5;
		A a1 = new A(3);
		A a2 = new A(4);
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
		System.out.println("A.aStaticField = " + A.aStaticField);
	}
}
class A {
	public static int aStaticField;
	private int instanceField;
	public A(int instanceField) {
		this.instanceField = instanceField;
	}
	public String toString() {
		return "A [instanceField = " + instanceField + ", aStaticField = " + aStaticField + "]";
	}
}
