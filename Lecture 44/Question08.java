package q24212;
public class Example {
	public static void main(String[] Args){
		String s =  args[0];
		StringBuilder sb = new StringBuilder();
		for ( int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			if (Character.isUpperCase(c)){
				sb.append(c);
			}
		}
		system.out.println("The result is: " + sb.toString())
	}
} 
