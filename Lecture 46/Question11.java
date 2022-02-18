package q11316;
import java.util.*;
public class RandomDemo {
	public static void main(String[] args) {
		Random rand = new Random(10);
		for (int i = 0; i < 5; i++) {
			System.out.println(rand.nextInt(100));
		}
	}
}
