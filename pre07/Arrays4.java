import java.io.*;
import java.util.*;

public class Arrays4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		
	// exercise 4 - find index of max value of array	
	   int maxIndex = 0;
	   int i = 0;
	   
		int [] a;
		a = new int [5];
		a[0] = 10;
		a[1] = 40;
		a[2] = 20;
		a[3] = 35;
		a[4] = 25;
				
		maxIndex = indexOfMax(a,maxIndex); 
		System.out.println("Index of Max value = " + maxIndex);
	}

		//loop through the array to get the highest number and its index
	public static int indexOfMax(int[] a, int maxIndex){
	int count = 0;	
    for (int i = 0; i < a.length; i++) {
       
	   if (a[i] > count)	{
		   count = a[i];
			maxIndex = i;
			
        }
    }
	
    return maxIndex; 
	}
		 
 }

// yes, and I did	
