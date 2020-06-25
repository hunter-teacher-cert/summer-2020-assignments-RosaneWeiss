import java.io.*;
import java.util.*;

public class Craps {
    public static void main(String[] args){
       
	   // craps game
	   //Scanner in = new Scanner(System.in);
		int point = 0;
		String winLose = "Lose";
		winLose = round(winLose);
		System.out.println(winLose);
		while(winLose == "Keep playing"){
			winLose = secondround(point,winLose) ; 
			System.out.println("You " + winLose);
    }
	}
	public static String round(String winLose) {
		int point = 0;
		point = shoot(point);
		//System.out.println("You rolled a " + point); 
		if (point == 2 || point == 3 || point ==12) {
			winLose = "Loose";  
		} else if (point == 7 || point == 11) {
			winLose = "Win";
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
		//String winLose = "Kep playing";
		rolled = shoot(rolled);
		//System.out.println("You rolled a " + rolled); 
		if (rolled == 7 ) {
			winLose = "Loose";  
		} else if (rolled == point) {
			winLose = "Win";
		} 
		return winLose; 	
	}
	}
	  	
		
    
	
  