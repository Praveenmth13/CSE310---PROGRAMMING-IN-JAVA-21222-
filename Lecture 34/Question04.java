package q11268;
public class OverloadArea {
	// Write the overload methods
	static float area(float a){
		return a*a;
	}
	static float area(float a,float b){
		return a*b;
	}
	public static void main (String[] args) {
		// Write the code
		Float f1 = Float.parseFloat(args[0]);
		Float f2 = Float.parseFloat(args[1]);
		System.out.println("Area of square for side in meters " + f1 + " : " +area(f1) ); // Fill in the missing code
		System.out.println("Area of rectangle for length and breadth in meters " + f1 + ", " + f2 + " : " +area(f1,f2) ); // Fill in the missing code
	}
}
