package q11384;
import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[] args) {
		ArrayDeque arrayDeque = new ArrayDeque();
		//below code uses it as a queue
		arrayDeque.offer("Ganga");
		arrayDeque.offer("Yamuna");
		arrayDeque.offer("Narmada");
		System.out.println("after all offers calls : " + arrayDeque);
		System.out.println("poll returns : " + arrayDeque.poll());
		System.out.println("after calling poll : " + arrayDeque);
		//below code uses it as a stack
		arrayDeque.push("Krishna");
		arrayDeque.push("Godavari");
		System.out.println("after all push calls : " + arrayDeque);
		System.out.println("pop returns : " + arrayDeque.pop());
		System.out.println("after calling pop : " + arrayDeque);
		//below code uses it as a double ended queue
		arrayDeque.offerFirst("Indus");
		arrayDeque.offerLast("Ravi");
		System.out.println("arrayDeque after offerFirst and offerLast calls : " + arrayDeque);
	}
}




package q11385;
import java.util.*;
public class HashtableDemo {
	public static void main(String[] args) {
		Map aMap = new Hashtable();
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		aMap.put("1", "First Entry");
		aMap.put("2", "Second Entry");
		aMap.put("3", "Third Entry");
		aMap.put("4", "Fourth Entry");
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		Map bMap = new Hashtable(aMap);
		System.out.println("bMap.size() = " + bMap.size());
		System.out.println("bMap = " + bMap);
		Map cMap = new Hashtable(20);
		System.out.println("cMap.size() = " + cMap.size());
		System.out.println("cMap = " + cMap);
	}
}




package q11386;
import java.util.*;
public class PropertiesDemo {
	public static void main(String[] args) {
		Properties props = new Properties();
		props.setProperty("OS_NAME", "Linux");
		props.setProperty("RAM", "2 GB");
		props.setProperty("HDD", "1 TB");
		props.setProperty("Monitor", "22 Inch");
		Set propertyNamesSet = props.stringPropertyNames();
		for (Object key : propertyNamesSet) {
			String propertyName = (String)key;
			Object propertyValue = props.getProperty(propertyName);
			System.out.println(propertyName + " : " + propertyValue);
		}
	}
}




Given :
public class Test{
	public static void main(String[] args) {
		String myProp = /* insert code here */
		System.out.println(myProp);
	}
}
and the command line:
java -Dprop.custom=gobstopper Test
Which two code snippets when placed at String myProp = /* insert code here */, will produce the output gobstopper? (Choose two.)
System.load("prop.custom");
System.getenv("prop.custom");
System.property("prop.custom");
System.getProperty("prop.custom");
System.getProperties().getProperty("prop.custom");
// ----> ANSWER <---- //
D.) System.getProperty("prop.custom");
E.) System.getProperties().getProperty("prop.custom");




         //   ----> E N D <----- //
