import java.io.*;
import java.util.*;

public class GridImage {

  public static void main(String[] args) {

    int rows = 20;
    int cols = 20;

    int[][] grid = new int[rows][cols];
	//rowpop(d2, c, 10);
	rowPop(grid, 2, 10);
	print2d(grid);
	 System.out.println();
	 
	colPop(grid, 3, 12);
	print2d(grid);
	 System.out.println();
	 
	invert (grid);
    print2d(grid);
    System.out.println();
	
	diagonal(grid, 8, 3, 1, 111);
	print2d(grid);
	System.out.println();

  }

  public static void print2d(int[][] d2) {

    for (int r=0; r < d2.length; r++) {
      for (int c=0; c < d2[r].length; c++) {

        System.out.printf("%03d ", d2[r][c]);
      }//end c for

      System.out.println();
    }//end r for
  }//end print2d

 

  public static void rowPop(int[][] d2, int r, int value) {
		for (int c=0; c < d2[r].length; c++){
				d2[r][c] = value;
			}	//end for c
		
 }//end rowPop
 
 
 public static void colPop(int[][] d2, int c, int value) {
	 //populate the rows by gowing through the columns
			// loop on the rows
			for (int r=0; r < d2.length; r++){
				d2[r][c] = value;
				
			}	//end for c
		 
  }//end colPop 
 
  public static void invert(int[][] d2) {
	  for (int r=0; r < d2.length; r++){
			// loop on the columns
			for (int c=0; c < d2[r].length; c++){
				if (d2[r][c] ==0){
					d2[r][c] = 255;
				} else {
					d2[r][c] = 0;
				} //end if
			}	//end for c
			
		} // end for r
  }//end invert

  /*
    0: up + left
    1: up + right
    2: down + left
    3: down + right
   */
  public static void diagonal(int[][] d2, int r, int c, int direction, int value) {
	d2[r][c] = value;
	while ( r > 0 && c > 0  &&  r < d2.length && c < d2[r].length){
		if (direction ==0){
			r= r - 1;
			c = c - 1;
			d2[r][c] = value;
		} // end if
		if (direction ==1){
			r= r - 1;
			c = c + 1;
			d2[r][c] = value;
		} // end if
		if (direction ==2){
			r= r + 1;
			c = c - 1;
			d2[r][c] = value;
		} // end if
		if (direction ==3){
			r= r + 1;
			c = c + 1;
			d2[r][c] = value;
		} // end if
	} // end while
 }//end diagonal

}