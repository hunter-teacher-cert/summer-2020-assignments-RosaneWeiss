import java.io.*;
import java.util.*;

public class Arrays5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
		
	// exercise 5 - find all prime numbers	
	    
	   int i = 0;
	   int x = 0;
	   String status = "prime";
	   	
		System.out.print("up to:  ");
		int number = in.nextInt();
		String [] primes;
		primes = new String [number + 1];
		// 0 and 1 are not primes
			for ( x = 2; x < number + 1 ; x++)
		{
				primes[x] = (sieve(x, status));
		System.out.println(x + " is " + primes[x]);
		}
		
	}

		//loop through the array to get the highest number and its index
	public static String sieve(int number, String status)	{
		// check numbers = value of cell = index + 2 (1 is not prime)
		
		status = "prime";
		
		for (int i = 0; i < number - 2 ; i++) 
		{
						
			// is divisible by any other number
       	   if ( number % (i + 2) == 0 )
		   {
			status = "not prime";
			i = number;
			return status;
		
			} 
		//System.out.println( "2 " + number + " " + (i+2) + " " + status);
		}
		return status;
	}
}


	
