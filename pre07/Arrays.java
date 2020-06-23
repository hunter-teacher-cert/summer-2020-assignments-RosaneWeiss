import java.io.*;
import java.util.*;

public class Arrays {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		
	// exercise 1 - power the elements of an array	
	   int n = 0;
	   int i = 0;
		//powarray(a[],b[]);
		//System.out.print("Initial Powered to: " + n);	
		double [] a;
		a = new double [5];
		System.out.println(a.length);
		double[] b = new double[a.length];
		while (i < a.length) {
		//System.out.println(a[i] + "       " + b[i]);
		 r = (powArray(a),(b));
		 //r = System.out.println(powArray(a),(b));
		i++;
		}
	}	
	public static double powArray(double[] a, double[] b){
		
	
		for (int i = 0; i < a.length; i++) {
		b[i] = a[i]*a[i];
		}
		return b; 
    }
}
	
