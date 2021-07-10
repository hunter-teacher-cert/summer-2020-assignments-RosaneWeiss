import java.io.*;
import java.util.*;
import java.awt.*;

public class Driver{
    public static void main(String[] args) {
	Time t = new Time();
	Time t2 = new Time(11, 59, 59.9);
	
	t.setHour(10);
    System.out.println(t);
	t2.setHour(9);
    System.out.println(t2);
	boolean answer = t.equals(t2);
	System.out.println(answer);
	
	String s = t.toString();
	}
}
