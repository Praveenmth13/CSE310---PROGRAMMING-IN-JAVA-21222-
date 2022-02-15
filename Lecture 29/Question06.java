package q11176;
public class SubString {
	public static void main(String[] args) {
		String str = "An offer that you cannot refuse";
		System.out.println(str.substring(9));
		System.out.println(str.substring(3, 8));
		System.out.println(str.substring(str.indexOf("you")));
		System.out.println(str.substring(str.indexOf("that"), str.indexOf("refuse")));
	}
}
