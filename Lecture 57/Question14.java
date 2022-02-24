package q24083;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		// Notice the use of generics. We will learn more about them later.
		// The type parameter <String> will ensure that your code cannot add any 
		// other object than those of type String
		List<String> namesList = new ArrayList<String>();
		// write your code below this
		for(int i =0;i<args.length;i++){
			namesList.add(args[i]);
		}
		
		Iterator itr = namesList.iterator();// Write your code here
		while (itr.hasNext()) {
			System.out.println(itr.next()); // print the list
		}
	}
}
