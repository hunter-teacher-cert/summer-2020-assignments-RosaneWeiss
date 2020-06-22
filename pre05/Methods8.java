import java.io.*;
import java.util.*;

public class Methods8 {
    public static void main(String[] args){
       
	   // exercise 8: Ackermann Function
	   Scanner in = new Scanner(System.in);
		
		int n,m,finalNumber;
		
		System.out.print("Input first nmber :  ");
		n = in.nextInt();
		System.out.print("Input second nmber :  ");
		m = in.nextInt();
		
		finalNumber= ack(m,n);
			
		System.out.println(finalNumber);
		
    }
	
	
 public static int ack(int m, int n){
    if (m == 0){
      return (n + 1);
    }

    else if (m > 0 && n == 0){
      return ack(m - 1, 1);
    }

    else{
      return ack(m - 1, ack(m, n - 1));
    }
 }
}