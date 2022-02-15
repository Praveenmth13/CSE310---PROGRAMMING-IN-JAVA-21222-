package q11171;
public class StringMethods {
	public static void main(String[] args) {
		String str = "special char &";
		System.out.println(str.indexOf("char"));
		System.out.println(str.indexOf(' '));
		System.out.println(str.lastIndexOf(' '));
		System.out.println(str.lastIndexOf("a", 8));
		System.out.println(str.indexOf("sp", 4));
	}
}
