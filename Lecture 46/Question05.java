package q11398;
import java.util.*;
import java.text.*;
public class DateFormatInJapan {
	public static String getJapaneseShortDate(Date date) {
		Format f=new SimpleDateFormat("yyyy/MM/dd");
		String ans=f.format(date);
		return ans;
		
	}
}
