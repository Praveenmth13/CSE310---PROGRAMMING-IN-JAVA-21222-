package q11369;
import java.util.*;
public class ArrayListMethodsDemo {
	public static void main(String[] args) {
		List aList = new ArrayList(args.length);
		for (String argument : args) {
			aList.add(argument);
		}
		System.out.println("aList = " + aList);
		System.out.println("aList.size() = " + aList.size());
		Object removedElement = aList.remove(3);
		System.out.println("removedElement = " + removedElement);
		System.out.println("aList = " + aList);
		Object replacedElement = aList.set(0, "Steve Jobs");
		System.out.println("aList = " + aList);
		aList.add(0, "Bill Gates");
		System.out.println("aList = " + aList);
	}
}
