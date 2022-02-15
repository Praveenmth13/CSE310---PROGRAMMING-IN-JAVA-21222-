package q11264;
public class MultilevelInheritanceDemo {
	int id;
	float javaMarks;
	float cMarks;
	float cppMarks;
	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		float jM = Float.parseFloat(args[2]);
		float cM = Float.parseFloat(args[3]);
		float cppM = Float.parseFloat(args[4]);
		Result obj = new Result();
		obj.setData(id,args[1]);
		obj.setMarks(jM,cM,cppM);
		obj.displayData();
		obj.displayMarks();
		obj.compute();
		obj.showResult();
	}
}
class Student {
	int id;
	String name;
	public void setData(int id,String name){
		this.id=id;
		this.name = name;
	}
	public void displayData(){
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
	}
}

class Marks extends Student{
	
	float javaMarks;
	float cMarks;
	float cppMarks;
	
	public void setMarks(float javaMarks,float cMarks , float cppMarks){
		
		this.javaMarks = javaMarks;
		this.cMarks = cMarks;
		this.cppMarks = cppMarks;
	}
	public void displayMarks(){
		
		System.out.println("Java marks : "+javaMarks);
		System.out.println("C marks : "+cMarks);
		System.out.println("Cpp marks : "+cppMarks);
	}
}

class Result extends Marks{
	float total,avg;
	public void compute(){
		total = javaMarks + cMarks + cppMarks;
		avg = total/3;
	}
	public void showResult(){
		System.out.println("Total : "+total);
		System.out.println("Avg : "+avg);
	}
}
