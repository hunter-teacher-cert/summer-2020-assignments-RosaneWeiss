public class SuperArray {
    private int[] data;
    private int numberElements;
	
	
	public SuperArray() {
		/* this will work if it is called with no arguments */
	this.data = new int [10];	
    this.numberElements = 0;
	}
	
	public SuperArray(int size) {
		/* this will work if it is called with no arguments */
	this.data = new int [size];	
    this.numberElements = 0;
	}
	
	public void add(int value) {
	/* it adds the value and passes back */
	if (this.numberElements < this.data.length)
		{
		this.data[numberElements] = value;
		this.numberElements = this.numberElements + 1;
		} else{
			grow();
			this.data[numberElements] = value;	
			this.numberElements = this.numberElements + 1;	
			} //end else
		// endif
	}
	
		public void add(int index,int value) {
	/* it adds the value on the specific index
		first check if array is full and grow it. 
		second push back all items from back till the desired index
		then it adds the value since you end up at the index wanted.*/
	if (this.numberElements >= this.data.length)
		{ /* array is all filled */
			grow();
		} // end if
		
		for (int c = this.numberElements; c > index; c--) 
		{ // moving to the back */
			data[c] = data[c - 1]; 
	    }
		// it is on the index wanted //
		this.data[index] = value;
		this.numberElements = this.numberElements + 1;	
			
	}
	
	public void remove(int index) {
	/* it removes the value on the specific index 
		pulls up all items from back till the desired index
		then it removes the last item*/
	
		for (int c = index ; c < (this.numberElements - 1); c++) 
		{ // moving to the back */
			data[c] = data[c + 1]; 
	    }
		// it is on the index wanted //
		data[this.numberElements - 1] = 0;
		this.numberElements = this.numberElements - 1;	
			
	}
	
	public int get(int index) {
	/*  return the value at location index from the array. 
		If index is past the last element, return -1. */
		// if (index > this.data.length)
		if (index > this.numberElements )
		{
			return -1;
		} else { 
		return 	this.data[index];
				} // endif
	}
	
	
	public boolean isEmpty() {
	/* return True if ther are no elemets in the internal array, false otherwise. */
	return this.numberElements == 0;
	//if (this.numberElements == 0)
	//	{
	//		return true;
	//	} else { 
	//		return 	false;
	//			} // endif
		
	}
	
	public String toString() {
	/*- build and return a String with all the elements of the array in a printable form */
		String stringdata = " ";
		
		for (int c = 0; c < numberElements; c++) {
			stringdata = stringdata + " " + this.data[c];
	    }
		return stringdata;
	}
	
	public void grow() {
	/* increase the capacity of your SuperArray:
	Make a new array with extra room.
	Copy the data from the original internal array over to the new one.
	Set the internal instance variable data to the new array. */
		int [] growArray = new int [this.data.length +1];
		
		for (int c = 0; c < this.data.length; c++) {
			growArray[c] = data[c]; 
	    }
		
		this.data = growArray;
	}
	 public static void main(String[] args) {
	/* create sa array */
	SuperArray sa = new SuperArray();
	
	boolean empty = sa.isEmpty();
	System.out.println(empty);
	 
	sa.add(5);
   sa.add(7);
   sa.add(0);
   sa.add(2);
   sa.add(3);
   sa.add(10);
   sa.add(2);
   //sa.add(8);
   sa.add(1);
   sa.add(9);
	//String s = sa.toString();
	// System.out.println(sa);
	 
	 //s = sa.toString();
	// System.out.println(sa); 
	//sa.add(29); 
	sa.add(5,30);
	sa.add(6,11);
	 System.out.println(sa); 
	 
	 sa.remove(6);
	 System.out.println(sa); 
	 
	
	}
}
