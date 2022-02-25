package q11370;
public class HashCodeDemo {
	public static void main(String[] args) {
		String text1 = "Ganga";
		System.out.println("text1 = " + text1 + " text1.hashCode() = " + text1.hashCode());
		String text2 = "GangaRiver";
		System.out.println("text2 = " + text2 + " text2.hashCode() = " + text2.hashCode());
		String text3 = text2.substring(0, 5);
		System.out.println("text3 = " + text3 + " text3.hashCode() = " + text3.hashCode());
	}
}



package q11371;
import java.util.*;
public class MapDemo {
	public static void main(String[] args) {
		Map countryCodesMap = new HashMap();
		countryCodesMap.put("IN", "India");
		
		/*Follow given instructions
		
		  see how key and values is added to the map similarly add the following data
		  
		  put key US and value as United States of America
		  
		  put key UK and value as United Kingdom
		  
		
		*/
		countryCodesMap.put ("US" , "United States of America");
		countryCodesMap.put ("UK" , "United Kingdom");
		
		System.out.println("Map entries : " + countryCodesMap);
		countryCodesMap.put("IN", "Bharat");
		System.out.println("Map entries : " + countryCodesMap);
		
		System.out.println("Value for UK is : " + countryCodesMap.get("UK"));//Fill the missing code here get the value for key UK
		
		System.out.println("Removing entry for US : " + countryCodesMap.remove("US")); //Fill the missing code remove the key US
		System.out.println("Map entries : " + countryCodesMap);
	}
}




package q11372;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
		Map aMap = new HashMap();
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		aMap.put("1", "First Entry");
		aMap.put("2", "Second Entry");
		aMap.put("3", "Third Entry");
		aMap.put("4", "Fourth Entry");
		System.out.println("aMap.size() = " + aMap.size());
		System.out.println("aMap = " + aMap);
		Map bMap = new HashMap(aMap);
		System.out.println("bMap.size() = " + bMap.size());
		System.out.println("bMap = " + bMap);
		Map cMap = new HashMap(20);
		System.out.println("cMap.size() = " + cMap.size());
		System.out.println("cMap = " + cMap);
	}
}




package q11373;
import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map namesMap = new HashMap();
		for (String argument : args) {
			String shortName = argument.substring(0, 3);
			namesMap.put(shortName, argument);
		}
		Set shortNamesSet = namesMap.keySet();
		for (Object key : shortNamesSet) {
			Object value = namesMap.get(key);
			System.out.println(key + " : " + value);
		}
	}
}




package q11374;
import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map namesMap = new HashMap();
		for (String argument : args) {
			String shortName = argument.substring(0, 3);
			namesMap.put(shortName, argument);
		}
		Set entrySet = namesMap.entrySet();
		for (Object entryObject : entrySet) {
			Map.Entry entry = (Map.Entry)entryObject;
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}
}




package q11375;
import java.util.*;
public class HashMapMethodsDemo {
	public static void main(String[] args) {
		Map namesMap = new HashMap();
		namesMap.put("Sam", "Samos");
		/*
		Observe how key, value is added to map
		
		Similarly add the following (key, value) pairs to the map
		
		put (Hyd,Hyderabad )
		
		put (Dal, Dallas)
		
		put(Ban, Bangalore)
		
		*/
		namesMap.put ("Hyd", "Hyderabad");
		namesMap.put ("Dal", "Dallas");
		namesMap.put ("Ban", "Bangalore");
		
		System.out.println("namesMap = " + namesMap);
		System.out.println("value mapped to Dal is : " + namesMap.get("Dal"));//get the value mapped to Dal
		namesMap.put("Dal", "Dalton");
		System.out.println("namesMap = " + namesMap);
		System.out.println("new value mapped to Dal is : " + namesMap.get("Dal"));
		System.out.println("namesMap.size() = " + namesMap.size());
	}
}




package q11376;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		Map namesMap = new TreeMap();
		namesMap.put("Sam", "Samos");
		namesMap.put("Hyd", "Hyderabad");
		namesMap.put("Dal", "Dallas");
		System.out.println("namesMap = " + namesMap);
		namesMap.put("Ban", "Bangalore");
		System.out.println("namesMap = " + namesMap);
		namesMap.put("Ath", "Athens");
		System.out.println("namesMap = " + namesMap);
	}
}




package q11377;
import java.util.*;
public class LinkedHashMapDemo {
	public static void main(String[] args) {
		Map namesMap = new LinkedHashMap();
		namesMap.put("Sam", "Samos");
		/*
		Add the following key value pair to the map
		
		add (Hyd, Hyderabad)
		
		add (Dal, Dallas)
				*/
		namesMap.put ("Hyd" , "Hyderabad");
		namesMap.put ("Dal" , "Dallas");
		System.out.println("namesMap = " + namesMap);
		
		//Now add (Ban, Bangalore)
		namesMap.put ("Ban" , "Bangalore");
		//Print the data in namesMap
		System.out.println ("namesMap = " +namesMap);
		//add (Ath, Athens)
		namesMap.put ("Ath" , "Athens");
		System.out.println("namesMap = " + namesMap);
	}
}




package q11963;
import java.util.*;
public class HashMapMethodsDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap <String, String>();

		// add given (key, values) to Map
		namesMap.put ("Jan", "January");
		namesMap.put ("Feb", "February");
		namesMap.put ("Mar", "March");
		namesMap.put ("Apr", "April");


		System.out.println("namesMap = " + namesMap);
		
		// change the value February to Fabulous
		namesMap.put ("Feb", "Fabulous");
		// observe the change in the output the value for the particular key is updated.
		
		System.out.println("namesMap = " + namesMap);
	}
}





package q11968;
import java.util.*;
public class HashMapMethodsDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap<String, String>();
		namesMap.put("Sun", "Sunday");
		namesMap.put("Mon", "Monday");
		namesMap.put("Tue", "Tuesday");
		namesMap.put("Thu", "Thursday");
		System.out.println("namesMap = " + namesMap);

		// write your code here

		System.out.println("value mapped to Tue is : " + namesMap.get("Tue"));
		
	}
}




import java.util.*;
public class HashMapIterationDemo {
	public static void main(String[] args) {
		Map <String, String> namesMap = new HashMap <String, String>();
		Set shortNamesSet = namesMap.keySet();
		for(int i = 0; i<args.length; i++) {
			// iterate over all the input argumetnts and add the (key,value) to the Map
			// write your code here
			String key = args[i].substring (0,2);
			String value = args[i];
			namesMap.put (key , value);
			
		}


		Set < String > keys = namesMap.keySet();
		for (Object key : shortNamesSet) {

			// get all the values and print the result
			System.out.println(key + " : " + namesMap.get (key));
		}
	}
}




