package q11359;
public class AssertionDemo {
	public static void main(String[] args) {
		int x = getPositiveInt(7);
		int y = getPositiveInt(2);
		assert (x > 0);
		assert (y > 0);
		int total = x + y;
		System.out.println("total = " + total);
	}
	public static int getPositiveInt(int num) {
		return num - 3;
	}
}
