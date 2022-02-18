package q11314;
import java.util.*;
public class CollectionsDemo {
	public static void main(String ... args) {
		List<Integer> integerList = Arrays.asList(3, 33, 333, 3333, 33333, 333333);
		System.out.println("integerList : " + integerList);
		Collections.shuffle(integerList, new Random(1));
		System.out.println("After shuffle integerList : " + integerList);
		Collections.sort(integerList);
		System.out.println("After sort integerList : " + integerList);
		Collections.fill(integerList, 7);
		System.out.println("After filling integerList with 7 : " + integerList);
	}
}
