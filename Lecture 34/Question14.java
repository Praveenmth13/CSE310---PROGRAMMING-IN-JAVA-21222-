package q11278;
public class GetClassExample {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		String text = "Ganga";
		System.out.println("a.getClass() : " + a.getClass());
		System.out.println("b.getClass() : " + b.getClass());
		System.out.println("text.getClass() : " + text.getClass());
	}
}
class A {
}
class B {
