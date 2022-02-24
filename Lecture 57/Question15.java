package q24084;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this
		// add the given elemnet at index 2

		// print the list	
		// get the element at index 2
		// remove the element at index 2
		// print the list after removing the element
		for(int i =0;i<args.length; i++){
			namesList.add (args[i]);
		}
		namesList.add (2, "Green");
		System.out.println ("After adding the given element at index 2 the list becomes\n"+ namesList);
		System.out.println ("The element at index 2 is " + namesList.get (2));
		namesList.remove (2);
		System.out.println ("After removing the element at index 2 the list becomes\n" + namesList);
	}
}
