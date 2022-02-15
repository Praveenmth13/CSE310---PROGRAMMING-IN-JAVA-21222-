package q11212;
public class RemoveSuffix {
	public static void main(String[] args){
		String input = args[0];
		int size = input.length();
		if(input.substring(0,3).equals(input.substring(size-3,size))){
		System.out.println(input.substring(0,size-3));
	} else{
		System.out.println(input);
	}
}
}
