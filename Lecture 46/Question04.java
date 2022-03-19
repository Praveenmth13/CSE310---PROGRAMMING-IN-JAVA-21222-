package q11397;
import java.util.*;
public class DateExample {
public static void main(String ... args) throws InterruptedException {
System.out.println("Sleeping for 1 second...");
Date timeAsDate = new Date();
long oldTimeInMillis = timeAsDate.getTime();
Thread.sleep(1000);
long newCurrentTimeInMillis = System.currentTimeMillis();
if (newCurrentTimeInMillis - oldTimeInMillis >= 1000) {
System.out.println("This thread resumed after 1 or more seconds");
}
}
}
