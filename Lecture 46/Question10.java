package q11592;
import java.time.*;
import java.time.temporal.*;
public class LocalDateDemo {
	public static void main(String ... args) {
		LocalDate javaBirthday = LocalDate.of(1995, Month.MAY, 23);
		TemporalAdjuster adjuster = TemporalAdjusters.next(DayOfWeek.SUNDAY);
		LocalDate nextSunday = javaBirthday.with(adjuster);
		System.out.printf("Java's birthday was on %s, and the cake was cut on next Sunday : %s.%n", javaBirthday, nextSunday);
	}
}
