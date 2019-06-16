//Program Name:  Dice.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/4/19
//Brief Description: A dice rolling program
//This program simulates the rolling of two dice and calculates their sum          
//Description of inputs:  None
//Description of outputs: The value of the two dice, and their sum

import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        Random generator = new Random();                // The actual work happens in this block of code
        int dieOne = generator.nextInt(5) + 1;          // Dice one and two are "rolled" with the number generator
        int dieTwo = generator.nextInt(5) + 1;
        int diceSum = dieOne + dieTwo;                  // The sum is calculated

        System.out.println("******Simulating Rolling of Two Dice******");   // The results are displayed
        System.out.println("Face value of die 1: " + dieOne);
        System.out.println("Face value of die 2: " + dieTwo);
        System.out.println("The sum of the two face values is: " + diceSum);
        System.out.println("Goodbye");

    }
}
/* Sample Output
******Simulating Rolling of Two Dice******
Face value of die 1: 2
Face value of die 2: 4
The sum of the two face values is: 6
Goodbye
*/