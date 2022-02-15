package q11266;
public class Addition {
	static void add(int x,int y){
		System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
	}
	static void add(int x,float y){
		System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
	}
	static void add(float x,float y){
		System.out.println("Sum of "+x+" and "+y+" : "+(x+y));
	}
	static void add(float x,double y, double z){
		System.out.println("Sum of "+x+", "+y+" and "+z+" : "+(x+y+z));
	}
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		Float c = Float.parseFloat(args[2]);
		Float d = Float.parseFloat(args[3]);
		double e = Double.parseDouble(args[4]);
		double f = Double.parseDouble(args[5]);
		add(a,b);
		add(c,d);
		add(b,d);
		add(c,e,f);
	}
}
