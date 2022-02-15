package q24200;
public class Test {
	public static void main(String args[]) {
		
		Languages a = Languages.valueOf("JAVA");
		
		Languages b = Languages.valueOf("PYTHON");
		
		Languages c= Languages.valueOf("C");
		
		Languages d = Languages.valueOf("CPP");
		
		Languages eee = Languages.valueOf("DBMS");
		System.out.println(a);
		
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
		
		System.out.println(eee);
	
		
		// print the instances of all enumeration constants in enum class Languages
		
	}
}
enum Languages {
	JAVA,
	PYTHON,
	C,
	CPP,
	DBMS
}
