//Program Name:  RockPaperScissors.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/8/19
//Brief Description: A rock paper scissors game played against the computer          
//Description of inputs:  One, choice of rock, paper or scissors 
//Description of outputs: Announces the game, prompts for input, repeats input, displays computer's choice
//and displays game outcome

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class RockPaperScissors {
    public static void main(String[] args) {
        String userChoice, computerChoice;
        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("******Rock, paper, scissors******");    // Menu and prompt for input
        System.out.println("Enter one of the following: ");
        System.out.println(" -- Rock\n -- Paper\n -- Scissors");

        userChoice = new Scanner(System.in).nextLine();             // Takes input, formats and validates
        userChoice = userChoice.toLowerCase();                      // Ends program if the input is invalid
        if (!Arrays.stream(choices).anyMatch(userChoice::equals)) {
            System.out.println("Invalid input");
            return;
        }
        computerChoice = choices[new Random().nextInt(3)];          // Computer picks
        System.out.println("You picked " + userChoice);             // Choices are echoed back
        System.out.println("Computer picked " + computerChoice);

        System.out.print("Winner: ");                               // This block of code determines the winner
        if (userChoice.equals(computerChoice)) {                    // First the tie
            System.out.println("Tie");
        } else if (computerChoice.equals("rock")) {                 // Then the other options with nested if-else statements
            if (userChoice.equals("paper")) {
                System.out.println("You");
            } else {
                System.out.println("Computer");
            }
        } else if (computerChoice.equals("paper")) {
            if (userChoice.equals("scissors")) {
                System.out.println("You");
            } else {
                System.out.println("Computer");
            }
        } else if (computerChoice.equals("scissors")) {
            if (userChoice.equals("rock")) {
                System.out.println("You");
            } else {
                System.out.println("Computer");
            }
        } else {
            System.out.println("Error");
        }
    }
}

/* Sample output 1
******Rock, paper, scissors******
Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
SCISSORS
You picked scissors
Computer picked paper
Winner: You
*/
/* Sample output 2
******Rock, paper, scissors******
Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
paper
You picked paper
Computer picked scissors
Winner: Computer
*/
/* Sample output 3
******Rock, paper, scissors******
Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
scIssors
You picked scissors
Computer picked scissors
Winner: Tie
*/
/* Sample output 4
******Rock, paper, scissors******
Enter one of the following:
 -- Rock
 -- Paper
 -- Scissors
pap
Invalid input
*/