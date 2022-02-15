package q11295;
public class A {
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
	public static void main(String[] args) {
		A.B b = new A().new B();
		A.C c = new A.C();
	}
}
