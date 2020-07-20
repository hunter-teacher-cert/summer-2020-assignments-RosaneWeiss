import java.io.*;
import java.util.*;


public class DriverSearch {
    public static void main(String[] args) {
	BSTree t = new BSTree();
	
	//populate it
	t.seed();
	
	int value;
	//test for searching the root
	value = t.search(10);
	System.out.println(value);
	
	//test for searching for an element in the tree
    value = t.search(15);
	System.out.println(value);
	
	//test for searching for an element not in the tree
	try {
	value = t.search(17);
	System.out.println(value);
		} //end try
		catch(NullPointerException e) {
		System.out.println( "17 not in the tree");
		}// end catch
	
	}
}