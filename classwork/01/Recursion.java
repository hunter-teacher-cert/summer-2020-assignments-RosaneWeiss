import java.io.*;
import java.util.*;

public class Recursion {

 public static void main(String[] args) {
	 // Scanner in = new Scanner(System.in);
  System.out.println("Good News Everyone!");
  //int n=1;
  int n=3;
  int finalNumber = 1;
  System.out.println("Input factorial of :  " + n);
		//n = in.nextInt();
		
		System.out.println(n + "! : ");
		n = factorial(n);
  System.out.printf("n! = %d\n", n );
  
  System.out.println("Fibonacci of :  ");
		//n = in.nextInt();
		n = fib(n);
  System.out.printf("fib(n) = %d\n", n );
  
 }

 public static int factorial(int n) {
	 
      if (n == 0) {
			return 1;
	  } else {
			return n*factorial(n- 1);
	  }	
	   
 }
 public static int fib(int n) {
      if (n < 2) {
			return 1;
	  } else {
			return fib(n- 1)+fib(n - 2);
	  }			
	  
	  
 }

		
}		