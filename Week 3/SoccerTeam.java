//Program Name:  DataValidationDemo.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/10/19
//Brief Description: This program calculates the number of soccer teams a youth
//league may create from the number of available players.           
//Description of inputs:  None
//Description of outputs: Displays a few sentences in the console window

import java.util.Scanner;

public class SoccerTeam {

		//Input validation is done with while loops.
		//Players per team : 9 - 15
		//Players available : >1	

    public static void main(String[] args)
     {
		      final int MIN_PLAYERS = 9;  // Minimum players per team
		      final int MAX_PLAYERS = 15; // Maximum players per team
		      int players;                // Number of available players
		      int teamSize;               // Number of players per team
		      int teams;                  // Number of teams
		      int leftOver;               // Number of leftover players
		      String input;               // To hold the user input


        Scanner scan = new Scanner(System.in);
		// Get the number of players per team
		System.out.println( "How many players do you wish per team?");
		System.out.print( "(Enter a value in the range 9 - 15): ");
		teamSize = scan.nextInt();

		while (teamSize<9 || teamSize>15) {
			System.out.println("Team size should be 9-15 players.");
			System.out.println( "How many players do you wish per team?");
			System.out.print( "(Enter a value in the range 9 - 15): ");
			teamSize = scan.nextInt();
		}
		
		
		// Get the number of players available
		System.out.print("How many players are available? ");
		players = scan.nextInt();
		
		while (players<=1) {
			System.out.println("Please enter a positive number more than 1.");
			// Get the number of players available
			System.out.print( "How many players are available? ");
			players = scan.nextInt();
		}

		// Calculate the number of teams.
		teams = players / teamSize;
		
		// Calculate the number of leftover players.
		leftOver = players % teamSize;
		
		// Display the results.
		System.out.println( "There will be "+ teams +  " teams with "+
		                   leftOver + " players left over.");
	}
			
}
/* Sample output
How many players do you wish per team?
(Enter a value in the range 9 - 15): 7
Team size should be 9-15 players.
How many players do you wish per team?
(Enter a value in the range 9 - 15): 8
Team size should be 9-15 players.
How many players do you wish per team?
(Enter a value in the range 9 - 15): 9
How many players are available? 0
Please enter a positive number more than 1.
How many players are available? 1
Please enter a positive number more than 1.
How many players are available? 2
There will be 0 teams with 2 players left over.
*/