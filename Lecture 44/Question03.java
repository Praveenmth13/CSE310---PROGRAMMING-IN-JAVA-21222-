package q11307;
public class StringBuilderDemo {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Ganga");
		sb.append("River");
		System.out.println("sb = " + sb);
		sb.append("Nile");
		System.out.println("sb = " + sb);
		sb.append("River").append("Thames");
		System.out.println("sb = " + sb);
		sb.delete(0, 5);
		System.out.println("sb = " + sb);
	}
}
