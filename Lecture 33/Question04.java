package q11263;

public class SingleInheritanceDemo {
	int id;
	float javaMarks;
	float cMarks;
	float cppMarks;
	public static void main(String[] args){
		int id = Integer.parseInt(args[0]);
		float jM = Float.parseFloat(args[1]);
		float cM = Float.parseFloat(args[2]);
		float cppM = Float.parseFloat(args[3]);
		Result obj = new Result();
		obj.setMarks(id,jM,cM,cppM);
		obj.displayMarks();
		obj.compute();
		obj.showResult();
	}
}

class Marks{
	int id;
	float javaMarks;
	float cMarks;
	float cppMarks;
	
	public void setMarks(int id,float javaMarks,float cMarks , float cppMarks){
		this.id = id;
		this.javaMarks = javaMarks;
		this.cMarks = cMarks;
		this.cppMarks = cppMarks;
	}
	public void displayMarks(){
		System.out.println("Id : "+id);
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
