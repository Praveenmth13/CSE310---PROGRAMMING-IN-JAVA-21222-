package q24212;
public class Example{
		public static void main(String args[]){
			String inputString=args[0];
			String outputString = "";
			for (int i = 0; i < inputString.length(); i++) {
				char c = inputString.charAt(i);
				outputString += Character.isUpperCase(c) ? c + "" : "";
				}
				System.out.println("The result is: "+ outputString);
		}
}
