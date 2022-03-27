package q11322;
public class TryCatchDemo {
	public static void main(String[] args) {
		System.out.println("Before sleep...");
		try{
		Thread.sleep(2000);
		}
		catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("After sleep...");
	}
}
