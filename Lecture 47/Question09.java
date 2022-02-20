package q11324;
public class StackOverflowErrorDemo {
	public static void main(String ... args) {
		someMethod();
	}
	public static void someMethod() {
		try {
		someMethod();
		}catch(StackOverflowError ste) {
			System.out.println("Stack over flow occured");
		}
	}
}
