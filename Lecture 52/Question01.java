package q11347;
public class RunnableDemo {
	public static void main(String[] args) throws InterruptedException {
		Counter c1 = new Counter("Ganga");
		Counter c2 = new Counter("Yamuna");
		Counter c3 = new Counter("Narmada");
		c1.run();
		Thread t1 = new Thread(c2);
		Thread t2 = new Thread(c3);
		t1.start();
		System.out.println("called t1.start()");
		t2.start();
		System.out.println("called t2.start()");
		t1.join();
		System.out.println("t1 has completed. t1.isAlive() = " + t1.isAlive());
		t2.join();
		System.out.println("t2 has completed. t2.isAlive() = " + t2.isAlive());
	}
}
class Counter implements Runnable {
	private String name;
	public Counter(String name) {
		this.name = name;
	}
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(name + " : " + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
