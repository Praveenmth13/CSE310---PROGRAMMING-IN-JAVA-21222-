package q11313;
import java.util.*;
public class ArraysDemo {
	public static void main(String ... args) {
		List<Integer> integerList = Arrays.asList(3, 33, 333, 3333);
		System.out.println("integerList : " + integerList);
		Integer[] integerArr = {382, 34, 4, 223, 331};
		System.out.println("Original integerArr : " + Arrays.asList(integerArr));
		Arrays.sort(integerArr);
		System.out.println("After sorting integerArr : " + Arrays.asList(integerArr));
		Integer[] integerArr2 = {4, 34, 223, 331, 382};
		System.out.println("Arrays.equals(integerArr, integerArr2) : " + Arrays.equals(integerArr, integerArr2));
		Integer[] integerArr3 = new Integer[10];
		Arrays.fill(integerArr3, 7);
		System.out.println("After filling integerArr3 with 7 : " + Arrays.asList(integerArr3));
	}
}
