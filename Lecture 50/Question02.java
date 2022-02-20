package q11341;
public class SleepDemo {
	public static void main(String[] args) {
		try {
			System.out.println("About to take a short nap. Start counting from 1 to 2.");
			Thread.sleep(1000);
			System.out.println("Fresh after 2 seconds of good sleep!");
			Thread.sleep(1000);
			System.out.println("Very fresh after sleeping for 2 more seconds!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
