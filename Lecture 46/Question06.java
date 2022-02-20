package q11399;
import java.util.*;
import java.text.*;
public class SimpleDateFormatDemo {
	public static void main(String ... args) throws ParseException {
		String dateText = " ";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
		// parse the dateText here and print.
		Date Nashe = simpleDateFormat.parse("15-08-1947");
		System.out.println("parsedDate : "+ Nashe);
	}
}
