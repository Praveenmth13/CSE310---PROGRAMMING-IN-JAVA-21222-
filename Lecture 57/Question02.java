package q11367;
import java.util.*;
public class ArrayListDemo {
	public static void main(String[] args) {
		/*
			In the below lines we are creating an empty ArrayList 
			called aList and printing its size and elements.
			Printing an ArrayList instance (aList) will print its elements in brackets.
			For example, when we print aList, we will notice [] (empty brackets), 
			as aList is empty.
		*/
		List aList = new ArrayList();
		System.out.println("aList.size() = " + aList.size());
		System.out.println("aList = " + aList);
		
		/*
			The below line of code adds a string element
			called "First Entry" to aList
		*/
		aList.add("First Entry");
		
		/*
			Insert a line of code below this comment
			to add a string element called "Second Entry" to aList
		*/
		aList.add("Second Entry");
		System.out.println("aList.size() = "+aList.size());
		System.out.println ("aList = " + aList);
		List bList = new ArrayList (aList);
		System.out.println ("bList.size() = " + bList.size ());
		System.out.println ("bList = " + bList);
		List cList = new ArrayList (20);
		System.out.println ("cList.size() = " + cList.size ());
		System.out.println ("cList = " + cList);
		
	}
}
