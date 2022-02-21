package q11358;
public class Student {
	private String id;
	private String name;
	public Student(String id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student[ id = " + id + ", name=" + name + " ]";
	}
	public static void main(String[] args) {
		Student st1 = new Student("1007", "Ganga");
		System.out.println("st1 : " + st1);
	}
}
