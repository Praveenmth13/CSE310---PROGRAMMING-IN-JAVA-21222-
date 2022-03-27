package q11349;
public class ThreadDemo {
	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new Printer("Good morning", 1, 2));
		Thread t2 = new Thread(new Printer("Hello", 1, 2));
		Thread t3 = new Thread(new Printer("Welcome", 3, 1));
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("All the three threads t1, t2 and t3 have completed execution.");
	}
}
class Printer implements Runnable {
	private String message;
	private int delay,count;
	public Printer(String message,int delay,int count) {
		this.message = message;
		this.delay=delay;
		this.count=count;
	}
	public void run() {
		//	long value =delay*1000;
		for (int i = 0; i < count; i++) {
			//	Thread.sleep(value);
			
			System.out.println(message);
		}
	}
}
