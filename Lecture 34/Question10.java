package q11274;
class SuperClass {
	int value1, value2;
	// Write the code
	SuperClass(int v1,int v2){
		value1=v1;
		value2=v2;
	}
	public void show(){
		System.out.println("This is super class show() method");
		System.out.println("value1 = "+value1);
	}
}

class SubClass extends SuperClass {
	int value3, value4;
	// Write the code
	SubClass(int v1,int v2,int v3,int v4){
		super(v1,v2);
		
		value3 = v3;
		value4 = v4;
	}
	public void show(){
		
		System.out.println("This is sub class show() method");
		super.show();
		System.out.println("value2 from super class = "+value2);
		System.out.println("value3 = "+value3);
		System.out.println("value4 = "+value4);
	}
}

public class AccessUsingSuper {
	public static void main(String[] args) {
		SubClass obj = new SubClass(Integer.parseInt(args[0]), Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		obj.show();
	}
}
