package q11959;
import java.util.*;
public class ListDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		namesList.add("Mercury");
		namesList.add("Venus");
		namesList.add("Earth");
		namesList.add("Mars");
		System.out.println(namesList);
		
		// change the element at index 0 to Sun
		namesList.set(0, "Sun");
		
		// change the element at index 2 to Jupiter
		namesList.set(2,"Jupiter");
		
		System.out.println(namesList); 
		
	}
}








