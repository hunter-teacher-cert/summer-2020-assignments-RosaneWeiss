import java.io.*;
import java.util.*;

public class Time {
    public static void main(String[] args){
       
		
		int hours = 20;
		int minutes = 05;
		int seconds = 20;
		double totSecDay = 24 * 60 * 60;	
		double totSec = (hours * 60 * 60) + (minutes * 60) + seconds;
		double percent;
		System.out.println("Hello world!");
				
		System.out.println("There are " + totSecDay +  " from midnight");
		System.out.println("Time is : ");
		System.out.println(hours + " : " + minutes + " : " + seconds);
		System.out.println("There has been " + totSec +  "  seconds today");
		percent = (totSec / totSecDay) * 100;
		System.out.println("This is " + percent  +  " % of the day");
		System.out.println("There is still " + (totSecDay - totSec)  +  " seconds till midnight");
		
		int hoursNow = 21;
		int minutesNow = 15;
		int secondsNow = 27;
		double totSecNow = (hoursNow * 60 * 60) + (minutesNow * 60) + secondsNow;
		double elapsed = totSecNow - totSec;
	
		System.out.println("Time  now is : ");
		System.out.println(hoursNow + " : " + minutesNow + " : " + secondsNow);
		System.out.println("There has been " + elapsed +  "  seconds elapsed");
    }
}
