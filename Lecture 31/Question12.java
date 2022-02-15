package q11202;
public class ReverseString{
	public static void main(String[] args){
		for(int i =0; i < args[0].length(); i++){
			System.out.print(args[0].charAt(args[0].length()-1-i));
		}
		System.out.println("\n");
	}
}
