import java.io.*;
import java.util.*;

public class ArrayExample {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		int n = 0;
	// exercise 1 - power the elements of an array	
	   	   int i = 0;
				System.out.print("Initial Powered to: ");
		n = in.nextInt();
		double [] a;
		a = new double [5];
		double[] b = new double[5];
		b = powArray((a),n); 
		System.out.println(java.util.Arrays.toString(b));
		;
		for (i = 0; i < 5; i++) {
		 System.out.println(b[i]);
		}
		in.close();
	}	
	public static double [] powArray(double[] a, int x){
		double[] b = new double[5];
		for (int i = 0; i < 5; i++) {
		b[i] = Math.pow((i + 1),x);
		}
		return b; 
    }
	
	
}
	
