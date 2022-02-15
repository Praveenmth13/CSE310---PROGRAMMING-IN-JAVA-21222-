package q11293;
public class StaticClassDemo {
	public static void main(String[] args) {
		StaticClassDemo.A a1 = new StaticClassDemo.A(3);
		A a2 = new A(4);
		System.out.println("a1 = " + a1);
		System.out.println("a2 = " + a2);
	}
	static class A {
		private int value;
		public A(int value) {
			this.value = value;
		}
		public String toString() {
			return "A [value = " + value + "]";
		}
	}
}
