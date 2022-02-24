package q11364;
import java.util.*;
public class ForEachDemo {
	public static void main(String[] args) {
		List namesList = new ArrayList();
		for (String name : args) {
			namesList.add(name);
		}
		
		/*
			Write a for-each loop below this comment
			which iterates over the namesList and 
			prints each element on a seperate line using println(...)
		*/
		
		for(Object x : namesList)
		System.out.println(x);
		
	}
}
