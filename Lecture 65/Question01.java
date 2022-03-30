import java.util.*;
import java.lang.*;
import java.io.*;
interface Cube {
    int Compute(int X);

}
class UserdefinedFunctionalInterface {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int A = sc.nextInt();
        Cube C = (int X) -> X * X * X;
        System.out.println("Cube of value is " + C.Compute(A));
    }
}




import java.util.*;
import java.lang.*;
import java.io.*;
class FunctionalInterface {
    public static void main(String args[]) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Creation of new thread");
            }
        }).start();
    }
}




import java.util.*;
import java.lang.*;
import java.io.*;
class FunctionalInterfaceWithLambda {
    public static void main(String args[]) {
        new Thread(() -> {
            System.out.println("Creation of new thread");
        }).start();
    }
}
