import java.io.*;
import java.util.*;

public class Craps {
    public static void main(String[] args){
       
	   // craps game
	   Scanner in = new Scanner(System.in);
	   int rounds = 1;
		System.out.print("Input rounds :  ");
		rounds = in.nextInt();
		int point = 0;
		String winLose = "Lose";
		while (rounds > 0)
		{
		point = shoot(point);
		winLose = round(winLose,point);
		System.out.println(winLose);
		//while (rounds > 0)
		//{
			System.out.println("NEW ROUND");
			while(winLose == "Keep playing"){
				winLose = secondround(point,winLose) ; 
				System.out.println("You " + winLose);
			}
		
		rounds = rounds - 1;
		System.out.println(" ");
		}
		
	}
	public static String round(String winLose, int point) {
		//int point = 0;
		//point = shoot(point);
		//System.out.println("You rolled a " + point); 
		if (point == 2 || point == 3 || point ==12) {
			winLose = "LOSE";  
		} else if (point == 7 || point == 11) {
			winLose = "WIN";
		} else {
			winLose = "Keep playing";	
		}
		return winLose;
	 }
	// shoot dice, sum needs to be between 1-6
	public static int shoot(int point) {
       int roll1;
	   int roll2;
	   roll1 = (int) (Math.random() * 6) + 1;
	   roll2 = (int) (Math.random() * 6) + 1;
	    point = roll1 + roll2;
	   System.out.println("dice rolls: " + roll1 + " " + roll2 + ", total = " + point);
	   return point;
	   }
	   
	  public static String secondround(int point, String winLose) {
		int rolled = 0;
		int needed = point;
		//String winLose = "Kep playing";
		rolled = shoot(rolled);
		System.out.println("You need a " + needed);
		System.out.println("You rolled a " + rolled); 
		if (rolled == 7 ) {
			winLose = "LOSE";  
		//} else if (rolled == point) {
			} else if (rolled == needed) {
			winLose = "WIN";
		} 
		return winLose; 	
	}
	}
	  	
		
    
	
  