import java.io.*;
import java.util.*;

public class SortMerge {
	
 //return ArrayList of random ints on range [lo,lo+hi)
  public static ArrayList<Integer> prestoArrayListo(int numItems, int lo, int hi)
  {
    ArrayList<Integer> retArr = new ArrayList<Integer>();

    for(int i=0; i<numItems; i++) {
      retArr.add( lo + (int)(hi * Math.random()) ); // [lo,lo+hi)
    }
    return retArr;
  }//end prestoArrayListo()
  
public static ArrayList<Integer> slice(ArrayList<Integer> al, int lo, int hi) 
{

    ArrayList<Integer> merged = new ArrayList<Integer>();
	/* start with lo and split arrays till have 1 element arrays, 
	from hi to low */
    for (; lo < hi; lo++) {
      merged.add( al.get(lo) ); 
    } //copy
    return merged;
  } //slice
  
  
   public static ArrayList<Integer> merge(ArrayList<Integer> left,ArrayList<Integer> right)
   {
     //index for left and right arrays 
      int l=0,r = 0;
	 ArrayList<Integer> merged = new ArrayList<Integer>();	 
      while( l< left.size() && r < right.size()){
		   // left and right arrays are not pass the linits
         
          if(left.get(l) < right.get(r)){
			   //left number is lower
              merged.add(left.get(l));
			  l++;
          }
          else{
			  //right number is lower
			  merged.add(right.get(r));
			  r++;
              
          } //endif
      } // endwhile 
	  //check for leftovers on left side
	  
      while(l < left.size()){
           merged.add(left.get(l));
			l++; 
      } // 
	  //check for leftovers on right side
      while(r < right.size()){
           merged.add(right.get(r));
			 r++;
      } // end while
	  return merged;
	}	//merge
 
 public static ArrayList<Integer> mergeSort( ArrayList<Integer> full){
    
	  if ( full.size() <= 1 ) {
		   //base case
      return full;
	  } // end if
	  
      //get midpoint
    int mid = full.size()/ 2;
	ArrayList<Integer> left = slice(full, 0, mid);
    ArrayList<Integer> right = slice(full, mid, full.size());
               
      // Recursively calling the function to divide the subarrays further
     // mergeSort(left,mid);
     // mergeSort(right,full.size()- mid);
    // Calling the merge method on each subdivision
       
   // System.out.printf("\tbot: %s\n", left);
   // System.out.printf("\ttop: %s\n", right);

    return merge(mergeSort(left), mergeSort(right));

  }//mergeSort


  public static void main( String[] args )
  {
   
    ArrayList<Integer> test = prestoArrayListo(16, 0, 100);
    System.out.printf("test: %s\n", test);
    ArrayList<Integer> sorted = mergeSort(test);
    System.out.printf("sorted: %s\n", sorted);


  }//end main

}//end class