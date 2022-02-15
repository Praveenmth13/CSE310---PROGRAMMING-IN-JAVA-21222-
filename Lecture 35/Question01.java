package q11279;
public class ToStringExample {
	public static void main(String[] args) {
		A a = new A(4);
		System.out.println("a.toString() : " + a.toString());
		System.out.println("a : " + a);
	}
}
class A {
	private int value;
	public A(int value) {
		this.value = value;
	}
	public String toString() {
		return "The value is : " + value;
	}
}
