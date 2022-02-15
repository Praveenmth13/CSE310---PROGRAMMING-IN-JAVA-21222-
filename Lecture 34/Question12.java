package q11276;
public class PolymorphismExample2 {
	public static void main(String[] args) {
		Object a = new A();
		Object b = new B();
		Object c = new C();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.toString());
	}
}
class A {
	public String toString() {
		return "A";
	}
}
class B extends A {
	public String toString() {
		return super.toString() + " " + "B";
	}
}
class C extends B {
	public String toString() {
		return super.toString() + " " + "C";
	}
}
