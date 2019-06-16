//Program Name:  exam.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/2/19
//Brief Description: Averages 3 exam scores
//Asks for 3 integers (exam scores) and displays the average score    
//Description of inputs:  3 integers inputted one at a time
//Description of outputs: Outputs prompts to enter test scores and the average test score

import java.util.stream.IntStream;
import java.util.Scanner;

public class exam {
    public static void main(String[] args) {
        // Asks for three example exam scores and calculates the average.
        Scanner scoreScan = new Scanner(System.in);     // Input to be used for 3 exam scores
        int[] examScores = {0, 0, 0};                   // For storing the 3 exam scores

        for (int i = 0; i < 3; i++) {                   // This for loop Asks for the three test scores and catches a common error
            System.out.println("Enter test " + (i+1) + " score:");  // Prompts for one of the test scores in order
            try {
                examScores[i] = scoreScan.nextInt();                // Stores the test score
            } catch (java.util.InputMismatchException e) {          // This exception handles the common mistake of not entering the correct data type for this application (an integer)
                System.out.println("Please enter an integer");
                return;
            } catch (Exception e) {
                System.out.println("Unexpected error:" + e);
                return;
            }
        }

        double averageScore = (double)IntStream.of(examScores).sum() / 3.0;           // Finds the average score (sum of exam scores divided by 3)
        System.out.println("The average of the 3 scores is: " + averageScore);
    }
}

/* Sample output
Enter test 1 score:
88
Enter test 2 score:
89
Enter test 3 score:
90
The average of the 3 scores is: 89.0
*/