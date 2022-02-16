package q11298;
interface Printer {
	public void printMe();
}
class Prefixer {
	protected String prefix;
	public Prefixer(String prefix) {
		this.prefix = prefix;
	}
	public String getPrefixedName(String name) {
		return prefix + " " + name;
	}
}
class AnonymousExample {
	public static void main(String[] args) {
		Printer printer = new Printer() {
			public void printMe() {
				System.out.println("printMe is called!");
			}
		};
		Prefixer doublePrefixer = new Prefixer("Hello") {
			public String getPrefixedName(String name) {
				return prefix + " " + prefix + " " + name;
			}
		};
		printer.printMe();
		System.out.println(doublePrefixer.getPrefixedName("James"));
	}
}
