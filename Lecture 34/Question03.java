package q11267;
public class Box{
	double width , height , depth;
	
	Box(){
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double L){
		width = L;
		height = L;
		depth = L;
	}
	
	Box(double w ,double h , double d){
		width = w;
		height = h;
		depth = d;
	}
	
	public double volume(){
		return width*height*depth;
	}
	
	public static void main(String...args){
		double a,b,c;
		if(args.length==0){
			Box obj = new Box();
			System.out.println("Volume of Box() is : "+obj.volume());
		}
		if(args.length==1){
			a = Double.parseDouble(args[0]);
			Box obj = new Box(a);
			System.out.println("Volume of Box("+a+") is : "+obj.volume());
		} 
		else if(args.length==3){
			
			a = Double.parseDouble(args[0]);
			b = Double.parseDouble(args[1]);
			c = Double.parseDouble(args[2]);
			Box obj = new Box(a,b,c);
			System.out.println("Volume of Box("+a+", "+b+", "+c+")"+" is : "+obj.volume());
		}
	}
}
