import java.io.*;
import java.util.*;

public class Convert {
    public static void main(String[] args){
       Scanner in = new Scanner(System.in);
		
		int celsius;
		double faren;
		System.out.print("Input the temperature in Celsius? ");
		celsius = in.nextInt();
		faren = (celsius *  9)/5  + 32;
		System.out.printf("%d celsius = %.2f farenheight\n",celsius, faren);
		
		
    }
}
