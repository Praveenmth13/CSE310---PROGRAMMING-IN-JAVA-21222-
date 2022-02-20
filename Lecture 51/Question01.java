package q11343;
import java.util.*;
public class SimpleThreadDemo3 {
	public static void main(String[] args) throws InterruptedException {
		List<String> entriesList = Collections.synchronizedList(new ArrayList<String>());
		Counter c1 = new Counter("Ganga", entriesList);
		Counter c2 = new Counter("Yamuna", entriesList);
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		t1.start();
		t2.start();
		System.out.println("started t1 and t2 threads");
		t1.join();
		System.out.println("t1 has completed. t1.isAlive() = " + t1.isAlive());
		t2.join();
		System.out.println("t2 has completed. t2.isAlive() = " + t2.isAlive());
		System.out.println("At the end entriesList = " + entriesList);
	}
}
class Counter implements Runnable {
	private String name;
	private List<String> entriesList;
	public Counter(String name, List<String> entriesList) {
		this.name = name;
		this.entriesList = entriesList;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			entriesList.add(name + " : " + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
