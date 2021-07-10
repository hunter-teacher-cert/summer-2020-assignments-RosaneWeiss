import java.io.*;
import java.util.*;

public class Methods {
    public static void main(String[] args){
       
	   // exercise 2: get values to check if it is divisible.
	   Scanner in = new Scanner(System.in);
		
		int n;
		System.out.print("Input numerator :  ");
		n = in.nextInt();
		
		int m;
		System.out.print("Input denominator :  ");
		m = in.nextInt();
		
		boolean divis = isDivisible(n,m);
		//System.out.println(divis);
		
		if (isDivisible(n,m)) {	
			System.out.printf(n + " is divisible by " + m);
		} else {	
		System.out.printf(n + " is not divisible by " + m);
		}
		System.out.println(" ");

		// exercise 3: Can I make a triangle?
	   
		int sideA,sideB,sideC;
		System.out.print("Input lenght of FIRST side :  ");
		sideA = in.nextInt();
		System.out.print("Input lenght of SECOND side :  ");
		sideB = in.nextInt();
		System.out.print("Input lenght of THIRD side :  ");
		sideC = in.nextInt();
		
		if (isTriangle(sideA, sideB, sideC)) {	
			System.out.printf("You can make a trinagle");
		} else {	
		System.out.printf("You cannot make a triangle");
		}
    }
	// is n divisible by m?
	public static boolean isDivisible(int n,int m) {
       if (m == 0) {
	   return false;}
	   
	   if (n % m == 0){
			return true;
		} else {
			return false;
		}
		
		
    }
	
	// Can you make a triangle?
	public static boolean isTriangle(int sideA,int sideB, int sideC) {
       if (sideA + sideB > sideC && 
			sideA + sideC > sideB &&
			sideB + sideC > sideA){
			return true;
		} else {
			return false;
		}
		
		
    }
} 