import java.io.*;
import java.util.*;

public class Gridz {
    public static void main(String[] args){
	//int[row][column]
	int [][]arr = new int[10][5];

	System.out.println(arr);
	popArray(arr);
	printArray(arr);
	System.out.printf("sum of row2 %d\new", rowSum(arr,2));
} //end main

public static int rowSum(int[][] a, int r){
		// find the sum of a specific row
		int sum = 0;
		for (int c=0; c < a[r].length; c++){
			 //sum = sum + a[r][c];
			 sum += a[r][c];
			
			}	//end for c
			return sum;
			
	} // end rowsum

	public static void popArray(int[][] a){
		// loop on the rows
		int value =  0;
		for (int r=0; r < a.length; r++){
			// loop on the columns
			for (int c=0; c < a[r].length; c++){
				a[r][c] = value;
				value++;
			}	//end for c
			
		} // end for r
		
	} // rnd printArray
	
	public static void printArray(int[][] a){
		// loop on the rows
		
		for (int r=0; r < a.length; r++){
			// loop on the columns
			for (int c=0; c < a[r].length; c++){
				System.out.printf("%02d", a[r][c] );
				
			}	//end for c
			System.out.println();
		} // end for r
		System.out.println();
	} // rnd printArray
	
} //end class
//a.length = # of rows
//a[r].length = # of columns in row a[r]