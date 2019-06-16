//Program Name:  Minutes.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/2/19
//Brief Description: A minutes-hours:minutes conversion program for time worked  
//Description of inputs: One integer input for number of minutes
//Description of outputs: Prompts for an input, Displays how many hours and minutes, goodbye message

import java.util.Scanner;

public class Minutes {
    public static void main(String[] args) {
        Scanner minScan = new Scanner(System.in);
        int minWorked, hrsWorked, changeWorked;

        try {
            System.out.println("Enter number of minutes worked: ");     // Prompts the user for number of minutes worked
            minWorked = minScan.nextInt();                              // Stores user input as an integer to be converted later
        } catch (java.util.InputMismatchException e) {                  // Catches if the user did not enter an integer for minutes worked and exits
            System.out.println("Please enter an integer number.");
            return;
        }

        hrsWorked = minWorked / 60;     // Finds hours worked with no remainder (HOURS:minutes)
        changeWorked = minWorked % 60;  // Finds the remainder                  (hours:MINUTES)
        System.out.println(minWorked + " becomes " + hrsWorked + " hour(s) and " + changeWorked + " minute(s.)\nGoodbye!");
    }
}

/* Sample output:
Enter number of minutes worked:
100
100 becomes 1 hour(s) and 40 minute(s.)
Goodbye!
*/