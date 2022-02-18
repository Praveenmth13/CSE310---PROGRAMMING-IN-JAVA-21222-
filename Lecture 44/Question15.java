package q24215;
public class StringbufferExample {
	public static void main (String args[]) {
		// create instance of StringBuffer
		// find the initial capacity
		//find the capactiy after passing a parameter args[0] using command line argument
		// find the capatity by intializing capatity to 50
		
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity is: " +sb.capacity());
		
		sb = new StringBuffer(args[0]);
		System.out.println("Capacity after passing parameter is: " + sb.capacity());
		
		sb = new StringBuffer(50);
		System.out.println("Creating a StringBuffer object with the given capacity: " + sb.capacity());
	}
}
