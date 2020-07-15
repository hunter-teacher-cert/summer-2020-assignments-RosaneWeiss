import java.io.*;
import java.util.*;

public class Boogle_skel
{

  //return index of first occurence of target, or -1 if not found
  public static int linSearch( ArrayList al, int target )
  {
    for( int pos=0; pos<al.size(); pos++) {
      if (al.get(pos).equals(target))
        return pos;
    }
    return -1;
  }//end linSearch()







  //return index of target, or -1 if not found
  public static int binSearch( ArrayList al, int target )
  {
    // <INSERT YOUR MACHINERY HERE>...
    return -1; //placeholder to get past compiler
  }//end binSearch()



  // subgoal: recognize target found (and take what action?)
  // subgoal: recognize search space exhausted (and take what action?)
  // subgoal: recognize target in lower portion of range (and do what?)
  // subgoal: recognize target in upper portion of range (and do what?)

  //nota bene: A helper method could be very useful.
  // Q: Why?
  // Q: What would the parameters be for such a method?



  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()


  //return ArrayList of random ints, sorted in ascending order
  public static ArrayList prestoSortedArrayListo(int numItems,
                                                 int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    //if requested, return empty ArrayList
    if ( numItems<1 )
      return retArr;

    //populate index 0
    retArr.add( (int)(lo * Math.random()) );

    //populate rest of indices, each one greater than last
    for(int i=1; i<numItems; i++) {
      //System.out.println(i);  //diagnostic under-the-hood view
      //retArr.add( Math.random() ); // [0,1)
      //retArr.add( (int)Math.random() ); // 0
      //retArr.add( (int)(hi * Math.random()) ); // [0,hi)
      //retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
      //System.out.println(retArr.get(i-1));
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    }

    return retArr;
  }//end prestoSortedArrayListo()

  //##################################################
  //##################################################

    // find and return the index of the smallest value in the
    // ArrayList al from index lo to index hi inclusive 
    public static int findSmallest(ArrayList<Integer> al, int lo, int hi){
	// assume the first item is the smallest - call it our smallest so far
	
	if (lo<0 || lo>hi || hi>=al.size()){
		return -1;
		} // endif
	int smallest = (int)al.get(lo);
	int small_index = lo;
	
	for(int i = lo + 1;i<=hi; i++) {
		int temp = (int)al.get(i);
		if(temp<smallest) {
			smallest = temp;
			small_index = i;
		} // end if
	} // end for
	
	return small_index;
    }

 public static ArrayList SortList(ArrayList<Integer> al){
	// temp variable is to swap, initialize index to 0
	
	// increase the "non swapped" index by 1???(lo = i), ( hi = lenght -1)
	 
	int swap = 0;
	// Do this until "not swapped" index = lenght of array - 2
		for ( int i = 0; i <=al.size() - 2; i++) {
		// find the smallest value, 
			int smallIndex = findSmallest(al,i,al.size()- 1);
		//swap value of the result of the call  with the lowest "non swapped" index(i)
		//first get the value for the smalles index via ArrayList methods (save A)
			swap = (int)al.get(smallIndex);
		//second set the value for the smalles index to the value of the first non-swapped element via ArrayList methods( B into A) 
			al.set(smallIndex,al.get(i));
		//third set the value for the non-swapped element via ArrayList methods( saved A into B) 	
			al.set(i,swap);
			// this will increase the "non swapped" index by 1?until lenght -1)
	} // endfor
	return al;
 }
  

  public static void main( String[] args )
  {
              
      int smallIndex;
      System.out.println("Testing findSmallest");
      ArrayList<Integer>  slist = prestoArrayListo(20,0,200);
     // smallIndex = findSmallest(slist,0,slist.size()- 1);
     // System.out.println(slist);
	  
	  slist = SortList(slist);
	  System.out.println(slist);
      ///System.out.printf("Smallest is at slist[%d] and is %d\n",smallIndex,slist.get(smallIndex));
      
     
}//end main

}//end class