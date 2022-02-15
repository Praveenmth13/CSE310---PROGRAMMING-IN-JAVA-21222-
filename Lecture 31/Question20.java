package q11210;
public class AppendChars {
	public static void main(String[] args){
		String input = args[0];
		if(input.length() < 10){
			for(int i = input.length();i<10;i++){
				input += "*";
			}
			System.out.println(input);
		}
		else{
			System.out.println(input);
		}
	}
}
