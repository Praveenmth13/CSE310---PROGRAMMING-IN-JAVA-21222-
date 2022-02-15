Given :
public static void main(String[] args) {
	String str = "null";
	if (str == null) {
		System.out.println("null");
	} else (str.length() == 0) {
		System.out.println("zero");
	} else {
		System.out.println("some");
	}
}
null
zero
some
Compilation fails.  //ANSWER (C)
An exception is thrown at runtime.
