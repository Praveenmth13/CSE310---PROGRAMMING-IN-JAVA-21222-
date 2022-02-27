package q11287;

//Write the code

public class AbstractExample {
public static void main(String[] args) {
Shape s;
s = new Trapezoid();
s.numberofsides();
s = new Triangle();
s.numberofsides();
s = new Hexagon();
s.numberofsides();
}
}

abstract class Shape

{
	
abstract void numberofsides();
	
}

class Trapezoid extends Shape

{
	
void numberofsides()
	
{
		
System.out.println("Number of sides in a trapezoid are 4");
		
}
	
}

class Triangle extends Shape

{
	
void numberofsides()
	
{
		
System.out.println("Number of sides in a triangle are 3");
		
}
	
}

class Hexagon extends Shape

{
	
void numberofsides()
	
{
		
System.out.println("Number of sides in a hexagon are 6");
		
}
	
}
