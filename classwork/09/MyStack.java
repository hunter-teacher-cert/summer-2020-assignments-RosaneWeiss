import java.io.*;
import java.util.*;

 
 public class MyStack{
      // add your internal data structure here
	private String[] data;
    private int numberElements;

      public MyStack(){
          // add constructor code
		this.data = new String [3];	
		this.numberElements = 0;
      }

      public void push(String value){
          // add code to push data on to the stack
		
		String [] growArray = new String [this.data.length +1];
		if (this.numberElements == this.data.length) { 
			for (int c = 0; c < this.data.length; c++) {
				growArray[c] = data[c]; 
			} // end for
			this.data = growArray;
		}  	// end if
			
		this.data[numberElements] = value; 
		this.numberElements = this.numberElements + 1;	
			
	} // end push
      

     public String pop(){
          // add code to remove and return the
          // item on the top of the stack
		String lastInData = this.data[this.numberElements - 1];
		data[this.numberElements - 1] = "  ";
		this.numberElements = this.numberElements - 1;	
		return 	lastInData;
      }

       public String top(){
          // add code to return but not remove the
          // item on the top of the stack
		  return this.data[this.numberElements - 1];
      }

 
	public boolean isEmpty(){
          // return true if the stack has no data, false otherwise
		return this.numberElements == 0;
	 }

      public int size(){
          // add code to return the number of items currently on the stack
		return numberElements;
	  }
	
	
	  public String toString() {
	/*- build and return a String with all the elements of the array in a printable form */
		String stringdata = " ";
		
		for (int c = 0; c < numberElements; c++) {
			stringdata = stringdata + " " + this.data[c];
	    }
		return stringdata;
	}
	/* public String reverse() {
	- build and return a String with all the elements of the array in a printable form  
		String stringdata = " ";
				for (int c = numberElements - 1; c >= 0; c--) {
			stringdata = stringdata + " " + this.data[c];
	    }
		return stringdata;*/
	}
	
		
	
	  
   /*  public static void main(String[] args) {
	create sa array 
	MyStack sa = new MyStack();	
	boolean empty = sa.isEmpty();
	String retrieved = "none";
	
	System.out.println(empty);
	 
	sa.push("First");
	sa.push("Second");
	sa.push("Third");
	sa.push("Fourth");
	sa.push("Fifth");
	
	String s = sa.toString();
	System.out.println(s);
	empty = sa.isEmpty();
	System.out.println(empty);
	
	retrieved = sa.pop();
	System.out.println("pop " + retrieved);
	s = sa.toString();
	System.out.println(s);
	 
	retrieved = sa.top();
	System.out.println("top " + retrieved);
	s = sa.toString();
	System.out.println(s);
	
	sa.push("Sixth");
	System.out.println("pushed ");
	s = sa.toString();
	System.out.println(s);
		}*/
  