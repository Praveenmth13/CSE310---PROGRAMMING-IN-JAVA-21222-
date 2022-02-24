package q11366;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		
		/*
			Below code adds two elements into the namesList
		*/
		namesList.add("John Napier");
		namesList.add("Isaac Newton");
		System.out.println(namesList);
		
		/*
			Below code adds "C V Ramana" to the namesList at index 1
		*/
		namesList.add(1, "C V Ramana");
		System.out.println(namesList);
		
		/*
			Insert a line of code below this comment
			which adds "Charles Babbage" to the namesList at index 1
			Hint: See how "C V Ramana" was added above
		*/
		namesList.add (1, "Charles Babbage");
		System.out.println(namesList);
		
		/*
			Insert a line of code below this comment
			which removes the element at index 0
			Hint : Use the remove(...) method
		*/
		namesList.remove (0);
		System.out.println(namesList);
		
		/*
			Insert a line of code below this comment
			which replaces the element at index 2 with "Bose"
			Hint : Use the set(...) method
		*/
		namesList.set (2, "Bose");
		System.out.println(namesList);
	}
}
