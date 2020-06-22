import java.io.*;
import java.util.*;

public class Loops {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		
	   // exercise 3: power
		int i, x, n, finalNumber;
		
		System.out.print("Input base :  ");
		x = in.nextInt();
		finalNumber = 1;
		System.out.print("Input exponent :  ");
		n = in.nextInt();
		
		 i = 1;
		 while (i <= n) {
				finalNumber = finalNumber * x;
				i = i + 1;
		 }
		System.out.print(x + " to the power of " + n + " = ");	
		System.out.println(finalNumber);
		
	// exercise 4: factorial
				
		System.out.print("Input factorial of :  ");
		x = in.nextInt();
		finalNumber = 1;
		System.out.print(x + "! : ");
				
		 while (x > 1) {
				finalNumber = finalNumber * x;
				x = x - 1;
		 }
			
		System.out.println(finalNumber);	
		
    
	// exercise 5 - Euler series
		
		finalNumber= myexp(x,n);
		System.out.print("Euler Series :  ");	
		System.out.println(finalNumber);
	}
		
 public static int myexp(int x, int n){
     int i = 1;
	 int numerator = 1;
	 int denominator = 1;
	 
		 while (i <= n) {
				numerator = numerator * x;
				i = i + 1;
		 }
		while (x > 1) {
				denominator = denominator * x;
				x = x - 1;
		 }
	return (numerator / denominator);		 
    }
 }
	
