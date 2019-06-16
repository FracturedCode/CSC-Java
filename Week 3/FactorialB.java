//Program Name:  FactorialB.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/12/19
//Brief Description: Calculates a factorial of input between 1-10           
//Description of inputs:  one integer from 1-10 inclusive
//Description of outputs: Prompts for input, outputs the result of the factorial

import java.util.Scanner;

public class FactorialB {
    public static void main(String[] args) {
        int number = 0, factorial = 1;
        Scanner input = new Scanner(System.in);

        System.out.println("**********Factorial**********");
        while (true) {
            number = 0;
            factorial = 1;
            while (number<1 || number>10) {     // While loop to make sure only 1-10 is entered. It just asks for input again if it isn't in the range
                try {
                    System.out.print("Enter a value between 1-10 (0 to quit): ");   // Try catch in case a number is not entered
                    number = input.nextInt();
                } catch (Exception e) {
                    System.out.println("Enter a number between 1-10 (inclusive) (0 to quit)");
                   input.nextLine();    // nextLine so it doesn't try reading the bad input again
                }
                if (number==0) {
                    System.out.println("Goodbye");
                    return;
                }
            }

            for (int i = number; i>1; i--) {    // The factorial calculation
                factorial *= i;
            }
            System.out.println(number + "! is " + factorial + "\n");   // Outputting the calculation
        }
    }
}

/* Example output
**********Factorial**********
Enter a value between 1-10 (0 to quit): 22
Enter a value between 1-10 (0 to quit): 7
7! is 5040

Enter a value between 1-10 (0 to quit): 0
Goodbye
*/