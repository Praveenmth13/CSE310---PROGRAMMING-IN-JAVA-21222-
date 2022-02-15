package q11283;
public class InterfaceDemo {
	public static void main(String[] args) {
		Greeting g1 = new A();
		Greeting g2 = new B();
		System.out.println(g1.getGreetings("Thor"));
		System.out.println(g2.getGreetings("Thor"));
	}
}
interface Greeting {
	String getGreetings(String name);
}
class A implements Greeting {
	public String getGreetings(String name) {
		return "Hi " + name;
	}
}
class B implements Greeting {
	public String getGreetings(String name) {
		return "Hola " + name;
	}
}
