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




