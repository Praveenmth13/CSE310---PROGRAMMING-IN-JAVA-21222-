package q11214;
public class CountChars{
	public static void main(String[] args){
		String input = args[0];
		int count = 0;
		for(int i = 0; i<input.length(); i++){
			if(input.charAt(i) == 'o'){
				count++;
			}
		}
		System.out.println(count);
	}
}
