package q11296;
public class A {
	private int value = 7;
	class B {
		private B() {
			System.out.println("In inner class B's constructor");
		}
	}
	static class C {
		private C() {
			System.out.println("In static nested class C's constructor");
		}
	}
	public void someMethodInClassA() {
		class D {
			private D() {
				System.out.println("In local class D's constructor");
				System.out.println("value = " + value);
			}
		}
		D d = new D();
	}
	public static void main(String[] args) {
		A a = new A();
		A.B b = new A().new B();
		A.C c = new A.C();
		a.someMethodInClassA();
	}
}
