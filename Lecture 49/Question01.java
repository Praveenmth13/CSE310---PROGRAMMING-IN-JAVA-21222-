package q11333;
public class ThrowAndThrowsExample {
	public static void main(String[] args) {
		Student st1 = null;
		Student st2 = null;
		try {
			st1 = new Student("Ganga", 25);
			System.out.println("Successfully created st1.");
			System.out.println("st1 : " + st1);
		} catch (InvalidAgeException e) {
			System.out.println("Could not create st1. Error message is : " + e.getMessage());
		}
		try {
			st2 = new Student("Yamuna", 1003);
			System.out.println("Successfully created st2.");
			System.out.println("st2 : " + st2);
		} catch (InvalidAgeException e) {
			System.out.println("Could not create st2. Error message is : " + e.getMessage());
		}
	}
}
class Student {
	private String name;
	private int age;
	public Student(String name, int age) throws InvalidAgeException {
		this.name = name;
		setAge(age);
	}
	public void setAge(int age) throws InvalidAgeException {
		if (age < 0 || age > 999) {
			throw new InvalidAgeException("Invalid age : " + age + ". Valid range for age is between 0 and 999.");
		}
		this.age = age;
	}
	public String toString() {
		return "name = " + name + ", age = " + age;
	}
}
class InvalidAgeException extends Exception {
	public InvalidAgeException(String errorMessage) {
		super(errorMessage);
	}
}
