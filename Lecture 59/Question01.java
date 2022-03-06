package q11378;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set namesSet = new HashSet();
		namesSet.add("Tokyo");
		namesSet.add("Athens");
		namesSet.add("New York");
		System.out.println(namesSet);
		namesSet.add("Tokyo");
		System.out.println(namesSet);
		System.out.println("Above result shows how Set does not include the duplicate Tokyo");
		boolean removeStatus = namesSet.remove("Delhi");
		System.out.println("Delhi removeStatus : " + removeStatus);
		boolean containsFlag = namesSet.contains("Athens");
		System.out.println("Athens containsFlag : " + containsFlag);
	}
}




package q11379;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		Set aSet = new HashSet();
		System.out.println("aSet.size() = " + aSet.size());
		System.out.println("aSet = " + aSet);
		aSet.add("Cuprum");
		aSet.add("Aurum");
		aSet.add("Argentum");
		System.out.println("aSet.size() = " + aSet.size());
		System.out.println("aSet = " + aSet);
		Set bSet = new HashSet(aSet);
		System.out.println("bSet.size() = " + bSet.size());
		System.out.println("bSet = " + bSet);
		Set cSet = new HashSet(20);
		System.out.println("cSet.size() = " + cSet.size());
		System.out.println("cSet = " + cSet);
	}
}




package q11380;
import java.util.*;
public class HashSetMethodsDemo {
	public static void main(String[] args) {
		Set aSet = new HashSet(args.length);
		for (String argument : args) {
			aSet.add(argument);
		}
		System.out.println("aSet = " + aSet);
		System.out.println("aSet.size() = " + aSet.size());
		boolean removedFlag = aSet.remove("Larry Page");
		System.out.println("Larry Page removedFlag = " + removedFlag);
		System.out.println("aSet = " + aSet);
		aSet.add("Steve Jobs");
		System.out.println("aSet = " + aSet);
		aSet.add("Bill Gates");
		System.out.println("aSet = " + aSet);
	}
}




package q11381;
import java.util.*;
public class HashSetIterationDemo {
	public static void main(String[] args) {
		Set namesSet = new HashSet();
		for (String argument : args) {
			if (Character.isUpperCase(argument.charAt(0))) {
				namesSet.add(argument);
			}
		}
		for (Object name : namesSet) {
			System.out.println(name);
		}
	}
}




package q11382;
import java.util.*;
public class TreeSetDemo {
	public static void main(String[] args) {
		Set namesSet = new TreeSet();
		namesSet.add("Ravi");
		namesSet.add("Soma");
		namesSet.add("Budha");
		namesSet.add("Budha");
		System.out.println("namesSet = " + namesSet);
		namesSet.add("Budha");
		namesSet.add("Mangal");
		System.out.println("namesSet = " + namesSet);
		namesSet.remove("Ravi");
		System.out.println("namesSet = " + namesSet);
	}
}




package q11383;
import java.util.*;
public class LinkedHashSetDemo {
	public static void main(String[] args) {
		Set namesSet = new LinkedHashSet();
		namesSet.add("Samos");
		namesSet.add("Hyderabad");
		namesSet.add("Dallas");
		namesSet.add("Dallas");
		System.out.println("namesSet = " + namesSet);
		namesSet.add("Dallas");
		namesSet.add("Bangalore");
		System.out.println("namesSet = " + namesSet);
		namesSet.add("Athens");
		System.out.println("namesSet = " + namesSet);
	}
}




package q11975;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();


		// Write your code here
		namesSet.add("Ganga");
		
		namesSet.add("Krishna");
		
		namesSet.add("Godavari");
		
		namesSet.add("Yamuna");
		
		namesSet.add("Krishna");
		
		

		System.out.println(namesSet);
		namesSet.add("Krishna");
		
		
		// Write your code here
		
		// add Krishna again here and observe the output
		
		
		System.out.println(namesSet);
		System.out.println("Above result shows how Set does not include the duplicate elements");
	}
}




package q11976;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();

		// write  your code here
		namesSet.add("Ganga");
		
		namesSet.add("Krishna");
		
		namesSet.add("Godavari");
		
		namesSet.add("Yamuna");
		
		
		
		
		
		System.out.println(namesSet);
		
		// write your code here
		System.out.println(namesSet.contains("Godavari"));
		System.out.println(namesSet.contains("Sindhu"));
	}
}




import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();


		// write your code here
		namesSet.add("Five");
		
		namesSet.add("One");
		
		namesSet.add("Four");
		
		namesSet.add("Two");
		
		namesSet.add("Three");
			
		System.out.println(namesSet);

		// write your code here
		namesSet.remove("Two");
		namesSet.remove("Three");

		System.out.println(namesSet);
	}
}




import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();

		// add days of week to the set using the method add
		namesSet.add("Monday");

		namesSet.add("Thursday");

		namesSet.add("Friday");

		namesSet.add("Sunday");

		namesSet.add("Wednesday");

		namesSet.add("Tuesday");

		namesSet.add("Saturday");

		System.out.println(namesSet);
		System.out.println("Size of the set is " + namesSet.size());// print the size of the set
		
		// clear all elements in the set
		namesSet.clear();
		
		System.out.println("The set after removing all the elements " + namesSet);
		System.out.println("Size of the set after removing the elements is " + namesSet.size());
	}
}




package q24095;
import java.util.*;
public class SetDemo {
	public static void main(String[] args) {
		Set<String> namesSet = new HashSet <String> ();
// write your code here

// iterate over the set using iterator and print the output
for(int i=0;i<args.length;i++) namesSet.add(args[i]);

Iterator<String> iterate = namesSet.iterator();



while(iterate.hasNext()) {
	
	System.out.println(iterate.next());
	
}


		
	}
}


					// ---> E N D <--- //

