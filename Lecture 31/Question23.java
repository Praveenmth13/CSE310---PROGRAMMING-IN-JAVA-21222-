package q11213;
public class RemovePrefix {
	public static void main(String[] args){
		StringBuffer a = new StringBuffer(args[0]);
		
		if((a.charAt(0) == 'x') == true && (a.charAt(1) == 'y') == true){
			System.out.println(a);
			
		}else if(a.charAt(0) != 'y' && a.charAt(1) != 'y' && a.charAt(0) != 'x' && a.charAt(1) != 'x'){
			System.out.println(a.delete(0,2));
			
		}else if((a.charAt(0) == 'y') == true && (a.charAt(1) == 'x') == true){
			System.out.println(a);
			
		}else if((a.charAt(0) == 'y') == true && a.charAt(1) != 'x'){
			System.out.println(a.delete(1,2));
			
		}else if((a.charAt(0) == 'x') == true && a.charAt(1) != 'y'){
			System.out.println(a.delete(1,2));
			
		}else if(a.charAt(0) != 'y' && a.charAt(0) != 'y'){
			System.out.println(a.delete(0,1));
			
		}else if(a.charAt(1) != 'y' && a.charAt(1) !='x') {
			System.out.println(a.delete(1,2));
		}
		
	}
}
