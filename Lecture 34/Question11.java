package q11275;
public class PolymorphismExample2 {
	public static void main(String[] args) {
		A a = new A();
		A b = new B();
		C c = new C();
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());
	}
}
class A {
	public String getName() {
		return "A";
	}
}
class B extends A {
	public String getName() {
		return super.getName() + " " + "B";
	}
}
class C extends B {
	public String getName() {
		return super.getName() + " " + "C";
	}
}
