package q24199;
public class Test {
	public static void main(String args[]) {
		
		// Iterate over the elements in enum and print them
		for(Languages v:Languages.values()) System.out.println(v);
	}
}
enum Languages {
	JAVA,
	PYTHON,
	C,
	CPP,
	DBMS
}
