package q11186;
public class StringFormatting {
	public static void main(String[] args) {
		int iVar = 2435;
		
		System.out.printf("%6d%n", iVar);
		System.out.printf("%06d%n", iVar);
		System.out.printf("%+06d%n", iVar);
		System.out.printf("%+,06d%n", iVar);
		System.out.printf("%-,6d%n", iVar);
	}
}
