import java.io.*;
import java.util.*;

public class Boogle
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



  //assumes input ArrayList is sorted in ascending order
  public static int binSearch( ArrayList al, int target )
  {
    
    //return binSearchIter( al, target, 0, al.size());
	return binSearchIter( al, target, 0, al.size()-1 );
    //return binSearchRec( al, target, 0, al.size()-1 );
  }//end binSearch()

  //return index of target, or -1 if not found
  
  
  public static int binSearchIter( ArrayList al, int target, int lo, int hi )
  {
	    
	 int index = (lo + hi)/2; 
	  	  
	  while (lo<=hi){
		 index = (lo + hi)/2;
	  if ((int)al.get(index) == target) {
		  // lucky me!
		  return index;
	  }
	   
	   if ((int)al.get(index) < target) { 
	   // adjust the lower limit to search the top half
		lo = index + 1;
	  } 
		 if ((int)al.get(index) >target) { 
	   // adjust the higher limit to search the bottom half
		hi = index - 1;
	  }
	  } // end while
	  	  
	   return -1;
	  } // end  - string not found 
	  
    // <INSERT YOUR MACHINERY HERE>...
		 //placeholder to get past compiler
  //}//end binSearch()



  //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList retArr = new ArrayList();

    for(int i=0; i<numItems; i++) {
      
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
     
      retArr.add( (int)retArr.get(i-1)
                  + lo + (int)(hi * Math.random()) ); // ["left neighbour",hi)
    }

    return retArr;
  }//end prestoSortedArrayListo()


  public static void main( String[] args )
  {
    

	//the Rosane-Pat-Sangmin special :
    System.out.println("\n"+"pal99"+":");
    ArrayList pal99 = new ArrayList();
    //explicitly fill arraylist with intent to search for
    // present and nonpresent values...
    pal99.add(20);
    pal99.add(21);
    pal99.add(27);
    pal99.add(200);
    pal99.add(400);
    pal99.add(10000000);
    System.out.println(pal99);
    //search for target in  bottom half the list
    System.out.println(linSearch(pal99,27)); // 2
    System.out.println(binSearch(pal99,27)); // 2
	
	//search for target in  top half the list
    System.out.println(linSearch(pal99,400)); // 2
    System.out.println(binSearch(pal99,400)); // 2
	
    //search for target not in the list
    System.out.println(linSearch(pal99,3)); // -1
    System.out.println(binSearch(pal99,3)); // -1
    

  }//end main

}//end class