package q11356;
import java.io.*;
public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student st1 = new Student("CT1007", "Ganga", 25, 71, "Hard-Working");
		Student st2 = new Student("CT1008", "Yamuna", 26, 51, "Absent-Minded");
		String outputFileName = "ObjectStreamsDemo.txt";
		Student restoredSt1 = null;
		Student restoredSt2 = null;
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(outputFileName));
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(outputFileName))) {
			System.out.println("Before serialization st1 : " + st1);
			System.out.println("Before serialization st2 : " + st2);
			oos.writeObject(st1);
			oos.writeObject(st2);
			restoredSt1 = (Student) ois.readObject();
			restoredSt2 = (Student) ois.readObject();
		}
		System.out.println("After deserialization st1 : " + restoredSt1);
		System.out.println("After deserialization st2 : " + restoredSt2);
	}
}
class Student implements Serializable {
	private String id;
	private String name;
	private int age;
	private transient int seatingPosition;
	private transient String comments;
	public Student(String id, String name, int age, int seatingPosition, String comments) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.seatingPosition = seatingPosition;
		this.comments = comments;
	}
	public String toString() {
		return "Student[ id=" + id + ", name=" + name + ", age=" + age + ", seatingPosition=" + seatingPosition + ", comments=" + comments + " ]";
	}
}
