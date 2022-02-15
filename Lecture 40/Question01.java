package q11294;
public class Namer {
	private String name;
	public Namer(String name) {
		this.name = name;
	}
	class Prefixer {
		private String prefix;
		private Prefixer(String prefix) {
			this.prefix = prefix;
		}
		public String getCompleteName() {
			return prefix + " " + name;
		}
	}
	public static void main(String[] args) {
		Namer namer = new Namer("Doodle");
		Namer.Prefixer prefixer = namer.new Prefixer("Mr.");
		System.out.println(prefixer.getCompleteName());
	}
}
