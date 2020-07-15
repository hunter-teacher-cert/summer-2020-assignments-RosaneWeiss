import java.io.*;
import java.util.*;

class Driver{
    public static void main(String[] args) {
	MyStack s = new MyStack();
	
	//s.push("A");
	//s.push("B");
	//s.push("C");
	

	//String x = s.pop();
	//System.out.println(x);
	//x = s.pop();
	//System.out.println(x);
	//x = s.pop();
	//System.out.println(x);
	
	s.push("R");
	s.push("A");
	s.push("C");
	s.push("C");
	s.push("A");
	s.push("R");
	String r = s.reverse();
	System.out.println(isPalindrome(s));
	
    }
	public String reverse() {
	/*- build and return a String with all the elements of the array in a printable form */ 
		String stringdata = " ";
		String x;
		while (s.isEmpty == false) {
			x = s.pop();
			stringdata = stringdata + " " + x;
	    }
		return stringdata;
	}
		
		
	public static boolean isPalindrome(String s) {
		if (s.toString == s.reverse) {
			return false;
		} else {
			return false;
		} // enfif
	}
}