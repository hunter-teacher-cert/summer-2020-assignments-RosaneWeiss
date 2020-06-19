import java.io.*;
import java.util.*;

public class Date {
    public static void main(String[] args){
       
		String day = "Friday";
		String monthWord = "June";
		int date = 19;
		int month = 6;
		int year = 2020;
		
		System.out.println("Hello world!");
				
		System.out.println("Today's date is : ");
		System.out.println("American format : ");
		System.out.println(day + ", " + monthWord + " " + date + ", " + year);
		System.out.println("European format : ");
		System.out.print(day + " " + date + " " + month + " " + year);
		
    }
}
