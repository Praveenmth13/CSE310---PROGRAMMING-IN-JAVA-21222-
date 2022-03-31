import java.util.*;
import java.lang.*;
import java.io.*;
interface Cube{
	int Compute(int x);
}
class UserdefinedFunctionalInterface {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number: ");
		int A = sc.nextInt();
		Cube C = (int X) -> X * X * X;
		System.out.println("Cube of value is " + C.Compute(A));
	}
}




// Type your code here as provided 
import java.util.*;
import java.lang.*;
import java.io.*;
class FunctionalInterface {
	public static void main(String args[]) {
		new Thread(new Runnable(){
			@Override
			public void run(){
				System.out.println("Creation of new thread");
			}
		}).start();
	}
}




//Type your code here as provided to be well versed 
//with the concept
import java.util.*;
import java.lang.*;
import java.io.*;
class FunctionalInterfaceWithLambda {
	public static void main(String args[]){
		new Thread(() -> {
			System.out.println("Creation of new thread");
		}).start();
	}
}



// Code here as given to be well versed with the functionality 
// of predicate interface
import java.util.*;
import java.util.function.Predicate;
class PredicateInterface{	
	public static void main(String args[]){
		List<String> Words = Arrays.asList("Ready","To","Visit","Coders","Den","CodeTantriks");		
		Predicate<String> P = (s)->s.startsWith("C");	
		for (String W:Words){
			if (P.test(W)){
			System.out.println(W);				
			}			
		}		
	}	
}




import java.util.*;
import java.lang.*;
import java.io.*;
interface FuncInterface {
	void AbstractFunction(int A);
	default void GeneralFunction() {
		System.out.println("Welcome");
	}
}
class LambdaExpression {
	public static void main(String args[]) {
		FuncInterface fobj = (int A) -> System.out.println(10 + A);
		fobj.AbstractFunction(15);
	}
}




// Implementation of basic lambda expressions to print all and  even elements in the array list
import java.util.ArrayList;
class LambdaExpression{
	public static void main(String args[]){
		// Creating an ArrayList with 100, 203, 300, & 405 as elements
		ArrayList<Integer> ArrList = new ArrayList<Integer>();
		ArrList.add(100);
		ArrList.add(203);
		ArrList.add(300);
		ArrList.add(405);
		// Display elements using lambda expression 
		ArrList.forEach(n -> System.out.println(n));
		// Lambda expression to print even elements
		System.out.println("All even elements displayed");
		ArrList.forEach(n -> { if (n%2 == 0) System.out.println(n); });
		
	}
}






// Complete below given code as per the problem statement
import java.util.ArrayList;
class LambdaExpression{
	public static void main(String args[]){
		ArrayList<Integer> ArrList = new ArrayList<Integer>();
		ArrList.add(120);
		ArrList.add(303);
		ArrList.add(308);
		ArrList.add(555);
		//Complete the code for displaying elements using lambda expression
		ArrList.forEach(n -> System.out.println(n));
		System.out.println("All odd elements displayed");
		  ArrList.forEach(n->{if (n%2 !=0) System.out.println(n);});
		
	}
}




