import java.io.*;
import java.util.*;
import java.awt.*;


public class Time{

    // your time class code goes in here
	/* this is private so it cannot be changed out of this class */
	private int hour;
    private int minute;
    private double second;

	public Time() {
		/* this will work if it is called with no arguments */
    this.hour = 0;
    this.minute = 0;
    this.second = 0.0;
	}

public Time(int hour, int minute, double second) {
	/* this will work if it is called with 3 numerical arguments */
    this.hour = hour;
    this.minute = minute;
    this.second = second;
	}	
	
	public int getHour() {
	/* it retrieves the hour and passes back */
    return this.hour;
}

public int getMinute() {
	/* it retrieves the minutes and passes back */
    return this.minute;
}

public double getSecond() {
	/* it retrieves the seconds and passes back */
    return this.second;
}
public void setHour(int hour) {
	/* it changes the hour to and passes back */
    this.hour = hour;
}

public void setMinute(int minute) {
	/* it changes the hour  */
    this.minute = minute;
}

public void setSecond(double second) {
	/* it changes the hour */
    this.second = second;
}
public static void printTime(Time t) {
    System.out.print(t.hour);
    System.out.print(":");
    System.out.println(t.minute);
    System.out.print(":");
    System.out.println(t.second);
}
/*public static void printTime(Time t) {
	//same as above, more sphisticated//
   System.out.printf("%02d:%02d:%04.1f\n", t.hour, t.minute, t.second);
*/
public String toString() {
    return String.format("%02d:%02d:%04.1f\n",
        this.hour, this.minute, this.second);
}
public boolean equals(Time that) {
    return this.hour == that.hour
        && this.minute == that.minute
        && this.second == that.second;
}
}

