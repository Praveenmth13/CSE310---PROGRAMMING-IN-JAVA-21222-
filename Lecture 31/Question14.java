package q11204;
public class EndsWith{
	public static void main(String[] args){
		boolean ends = args[0].endsWith("bad");
		if(ends){
			System.out.println(ends);
		} else {
			System.out.println("false");
		}
	}
}
