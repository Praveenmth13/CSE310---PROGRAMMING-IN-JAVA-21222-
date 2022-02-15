package q11179;
public class StringMethods {
	public static void main(String[] args) {
		String str = " Six seasons   ";
		System.out.println("length = " + str.length());
		System.out.println("length after trim = " + str.trim().length());
		System.out.println(str.replace(' ', '*'));
		System.out.println(str.trim().replace("Six", "Four"));
	}
}
