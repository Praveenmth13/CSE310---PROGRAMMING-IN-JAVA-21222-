package q11203;
public class MiddleTwoChars{
		public static void main(String[] args){
			String result = args[0].substring(args[0].length()/2-1,args[0].length()/2+1);
			System.out.println(result);
		}
	}
