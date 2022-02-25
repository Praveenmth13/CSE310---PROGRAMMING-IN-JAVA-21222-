package q11370;
public class HashCodeDemo {
	public static void main(String[] args) {
		String text1 = "Ganga";
		System.out.println("text1 = " + text1 + " text1.hashCode() = " + text1.hashCode());
		String text2 = "GangaRiver";
		System.out.println("text2 = " + text2 + " text2.hashCode() = " + text2.hashCode());
		String text3 = text2.substring(0, 5);
		System.out.println("text3 = " + text3 + " text3.hashCode() = " + text3.hashCode());
	}
}
