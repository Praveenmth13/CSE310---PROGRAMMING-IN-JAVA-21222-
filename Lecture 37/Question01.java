package q11285;
public class AbstractDemo {
	public static void main(String[] args) {
		Greeting english = new EnglishGreeting();
		Greeting spanish = new SpanishGreeting();
		System.out.println(english.getStandardMessage("Winston"));
		System.out.println(english.getCustomMessage("Winston"));
		System.out.println(spanish.getStandardMessage("Martin"));
		System.out.println(spanish.getCustomMessage("Martin"));
	}
}
interface Greeting {
	public String getStandardMessage(String name);
	public String getCustomMessage(String name);
}
abstract class AbstractGreeting implements Greeting {
	public String getStandardMessage(String name) {
		return "Hi " + name;
	}
	public abstract String getCustomMessage(String name);
}
class EnglishGreeting extends AbstractGreeting {
	public String getCustomMessage(String name) {
		return "Hello " + name;
	}
}
class SpanishGreeting extends AbstractGreeting {
	public String getCustomMessage(String name) {
		return "Holla " + name;
	}
}
