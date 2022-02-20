package q11345;
public class WaitNotifyDemo {
	public static void main(String[] args) throws InterruptedException {
		Object sharedLock = new Object();
		Waiter waiter = new Waiter(sharedLock);
		Notifier notifier = new Notifier(sharedLock);
		Thread t1 = new Thread(waiter);
		Thread t2 = new Thread(notifier);
		t1.start();
		t2.start();
		t2.join();
		t1.join();
	}
}
class Waiter implements Runnable {
	private Object sharedLock;
	public Waiter(Object sharedLock) {
		this.sharedLock = sharedLock;
	}
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Waiter : " + i);
			if (i == 5) {
				System.out.println("Waiter will wait now until notified by Notifier");
				synchronized (sharedLock) {
					try {
						sharedLock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("Waiter has come out of wait.");
			}
		}
	}
}
class Notifier implements Runnable {
	private Object sharedLock;
	public Notifier(Object sharedLock) {
		this.sharedLock = sharedLock;
	}
	public void run() {
		System.out.println("Notifier is busy taking a nap to 7 secs.");
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Hurray! Notifier is awake and is about to call notify().");
		synchronized (sharedLock) {
			sharedLock.notify();
		}
	}
}
