package q11286;
public class Area {
	public static void main(String args[]) {
		FindArea area = new FindArea();
		area.triangleArea(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		area.rectangleArea(Double.parseDouble(args[0]), Double.parseDouble(args[1]));
		area.squareArea(Double.parseDouble(args[0]));
		area.circleArea(Double.parseDouble(args[1]));
	}
}
// Write all the classes with definitions

abstract class calcArea {
	
	abstract void triangleArea(double b, double h);
	
	abstract void rectangleArea(double l, double b);
	
	abstract void squareArea(double s);
	
	abstract void circleArea(double r);
	
}

class FindArea extends calcArea {
	
	void triangleArea(double b, double h)
	
	{
		
		double area = (b*h)/2;
		
		System.out.println("Area of triangle : "+area);
		
	}
	
	void rectangleArea(double l, double b)
	
	{
		
		double area = l*b;
		
		System.out.println("Area of rectangle : "+area);
		
	}
	
	void squareArea(double s)
	
	{
		
		double area = s*s;
		
		System.out.println("Area of square : "+area);
		
	}
	
	void circleArea(double r)
	
	{
		
		double area = 3.14*r*r;
		
		System.out.println("Area of circle : "+area);
		
	}
	
}
