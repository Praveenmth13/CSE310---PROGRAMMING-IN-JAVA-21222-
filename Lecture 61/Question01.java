package q11388;
import java.util.*;
public class GenericListDemo {
	public static void main(String[] args) {
		List<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(new Integer(72));
		numbersList.add(78);
		numbersList.add(81);
		int total = 0;
		for (int number : numbersList) {
			total = total + number;
		}
		System.out.println("total = " + total);
	}
}
