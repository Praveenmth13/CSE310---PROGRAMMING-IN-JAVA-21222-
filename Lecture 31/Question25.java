package q11215;
public class JavaStringBufferDelete{
	public static void main(String[] args){
		StringBuffer buf = new StringBuffer("Hello India");
		System.out.println(buf.delete(0,6)+"\n");
		buf = new StringBuffer("Hello Java");
		System.out.println(buf.delete(0,1));
	}
}
