package q11284;
interface Car {
	public String getName();
	public int getMaxSpeed();
	
	
	public default void applyBreak(){
		System.out.println("Applying break on "+getMaxSpeed());
	}
	
	public static Car getFastestCar(Car car1,Car car2){
		if(car1.getMaxSpeed()>=car2.getMaxSpeed()){
			return car1;
		}
		return car2;
	}
}
class BMW implements Car {
	String name;
	int bmwspeed;
	BMW(String name,int bmwspeed){
		this.name=name;
		this.bmwspeed=bmwspeed;
	}
	
	public String getName(){
		return name;
	}
	public int getMaxSpeed(){
		return bmwspeed;
	}
	public void applyBreak(){
		System.out.println("Applying break on "+getName());
	}
}
class Audi implements Car {
	String name;
	int AudiSpeed;
	Audi(String name,int speed){
		this.name = name;
		AudiSpeed = speed;
	}
	public String getName(){
		return name;
	}
	public int getMaxSpeed(){
		return AudiSpeed;
	}
	public void applyBreak(){
		System.out.println("Applying break on "+getName());
	}
}
public class MainApp {
	public static void main(String args[]) {
		int s = Integer.parseInt(args[1]);
		int s2 = Integer.parseInt(args[3]);
		Car car1 = new BMW(args[0],s);
		Car car2 = new Audi(args[2],s2);
		System.out.println("Fastest car is : "+Car.getFastestCar(car1,car2).getName());
	}
}
