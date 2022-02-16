package q11297;
interface Printer {
	public void printMe();
}
class A {
	public static void main(String[] args) {
		class PrinterImpl implements Printer {
			public void printMe() {
				System.out.println("I am in printMe method of the local class PrinterImpl instance");
			}
		}
		Printer myPrinter1 = new PrinterImpl();
		Printer myPrinter2 = new Printer() {
			public void printMe() {
				System.out.println("I am in printMe method of the anonymous class");
			}
		};
		myPrinter1.printMe();
		myPrinter2.printMe();
	}
}
