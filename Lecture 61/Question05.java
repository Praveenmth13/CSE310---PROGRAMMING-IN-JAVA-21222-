package q11392;
import java.util.*;
public class SimpleMapDemo {
	public static void main(String[] args) {
		Map<String, String> countryCodesMap = new HashMap<String, String>();
		countryCodesMap.put("IN", "India");
		countryCodesMap.put("CA", "Canada");
		countryCodesMap.put("AG", "Argentina");
		countryCodesMap.put("BR", "Brazil");
		Set<String> codesSet = countryCodesMap.keySet();
		for (String code : codesSet) {
			String countryName = countryCodesMap.get(code);
			System.out.println(code + " is the code for : " + countryName);
		}
	}
}
