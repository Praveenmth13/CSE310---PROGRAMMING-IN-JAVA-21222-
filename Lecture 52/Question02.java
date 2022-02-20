Read the following code and select all the correct outputs:
public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("In run() method ");
		throw new RuntimeException("some problem");
	}

	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		System.out.println("End of main() method");
	}
}

=> ANSWER
D.) In run() method
    End of main() method
    java.lang.RuntimeException: some problem

F.) In run() method
    java.lang.RuntimeException: some problem
    End of main() method

G.) End of main() method
    In run() method
    java.lang.RuntimeException: some problem
