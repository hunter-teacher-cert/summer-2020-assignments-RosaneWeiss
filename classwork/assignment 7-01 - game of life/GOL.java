import java.io.*;
import java.util.*;
/*
  2D array 
  set up 
  change values in it
  a way of applying the GOL rules 
 */



public class GOL{
	public static void main(String[] args) {
		char[][] board;
		
		board = createNewBoard(25,25);
		
		setCell(board, 2, 3, 'X');
		setCell(board, 2, 4, 'X');
		setCell(board, 2, 5, 'X');
		setCell(board, 3, 3, 'X');
		setCell(board, 3, 4, 'X');
		setCell(board, 3, 5, 'X');
		setCell(board, 4, 3, 'X');
		setCell(board, 4, 4, 'X');
		setCell(board, 4, 5, 'X');
		printBoard(board);
		
		// loop through to find neighboors
		int r=0;
		int c=0;
		
		board = generateNextBoard(board);
		printBoard(board);
    }
	
    /*
      create a new 2D array, fill it with ' ' 
      representing that the entire board is empty.
     */
    public static char[][] createNewBoard(int rows, int cols){
	char[][] board = new char[rows][cols];
	for (int r = 0; r < rows; r++) {
	    for (int c = 0; c < cols; c++) {
		board[r][c] = ' ';
	    }
	}
	return board;
    }

    
    public static void printBoard(char[][] board){
	for (int r = 0; r < board.length; r++) {
	    for (int c = 0; c < board[r].length; c++) {
		System.out.printf("%c",board[r][c]);
	    }
	    System.out.println();
	}
	System.out.println("\n\n------------------\n\n");
    }

    /*
      set the cell (r,c) to value
    */
    public static void setCell(char[][] board, int r, int c, char val){
	if (r>=0 && r<board.length && c>=0 && c<board[r].length){
	    board[r][c] = val;
	}
    }

/*   real deal */
    			
	
    public static char[][] generateNextBoard(char[][] board){
		
    /*  scan the board to generate a NEW board with the
      next generation
    */
	char newBoard[][] = new char[25][25];
	for ( int r =0; r < 25; r++) {
			for ( int c = 0; c < 25; c++) {
				char nextCell = getNextGenCell(board,r,c);
				newBoard[r][c] = nextCell; 
			} // end for c
	} // end for r
	
	return newBoard;
    }
   
    
    /*
      given a board and a cell, determine, based on the rules for 
      Conway's GOL if the cell is alive ('X') or dead (' ') in the 
      next generation.
      
     */
    public static char getNextGenCell(char[][] board,int r, int c){
	// calculate the number of living neighbors around board[r][c]
		int totNeighboor=0;
						
				totNeighboor= countNeighbours(board,r,c); 
				  
				
	// determine if board[r][c] is living or dead
	//    if living and 2 3 neighbors then remain alive
	//    if dead and 3 neighbors then become alive	
				
				if (totNeighboor == 3) {
					return 'X';
				} else {
					
					if (totNeighboor == 2 && board[r][c] == 'X') {
						return 'X';
					} else {
						return ' ';
					}
				}// end if
	
			
    }
    
    public static int countNeighbours(char[][] board, int r, int c){
		
		 /* 
       Count and return the number of living neigbords around board[r][c]
       approach 1 - lots of if statements
       approach 2 - you can loop over the grid from board[r-1][c-1]
                    to board[r+1][c+1]		 */
					
		int count=0;
		  			
		if (r > 0 && r < 9 && c > 0 && c < 9) {
			
			for (int i = r  - 1; i <= r  + 1; i++) {
				for ( int j = c - 1; j <= c + 1; j++) {
					
					if (board[i][j] == 'X'){
					count = count + 1;
				} //end if
			}//end c for
		}//end r for
		} // endif
		if (board[r][c] == 'X'){
		count = count - 1; /* take itself out ? */
		}
		
	return count;
    }
   
}