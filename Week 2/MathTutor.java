//Program Name:  MathTutor.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/7/19
//Brief Description: A math problem generator
//This program lets the user select three basic operations to practice.
//It generates one example problem using that operation. User enters their answer to see if correct           
//Description of inputs:  At first prompt -, +, or * to indicate operation. The second input is the answer to the problem
//Description of outputs: Prompts for operation. Then the math problem. Finally says if answer is correct

import java.util.Random;
import java.util.Scanner;

public class MathTutor {
    public static void main(String[] args) {
        String operation;
        int topNum, bottomNum, answer;
        Scanner sc = new Scanner(System.in);
        Random gen = new Random();

        System.out.println("\t   Math Tutor");              // Menu screen
        System.out.println("\t----------------");
        System.out.println("Enter + for Addition problem.");
        System.out.println("Enter - for Addition problem.");
        System.out.println("Enter * for Addition problem.");

        operation = sc.nextLine();          // Get user input for operation to practice

        switch(operation) {                 // Gatekeeps the users input
            case "+":
            case "-":
            case "*":
                break;
            default:
                System.out.println("Illegal operator!");
                return;
        }

        topNum = gen.nextInt(16) + 15;      // Generates problem
        bottomNum = gen.nextInt(31) + 40;
        System.out.println("Here is your problem\n");
        System.out.println("\t " + topNum);
        System.out.println("\t" + operation + bottomNum);
        System.out.println("\t ---");
        System.out.print("\t ");
        answer = sc.nextInt();              // Takes answer

        if( (operation.equals("+") && topNum+bottomNum==answer) || (operation.equals("-") && topNum-bottomNum==answer) || (operation.equals("*") && topNum*bottomNum==answer)) {
            // Prints correct if the answer is correct
            System.out.println("Correct");
        } else if (topNum+bottomNum==answer || topNum-bottomNum==answer || topNum*bottomNum==answer) {
            // Prints if the user possibly did not do the operation they selected, then the correct answer
            System.out.print("Incorrect. You probably used the wrong operation\nThe correct answer was: ");
            switch (operation) {
                case "+":
                    System.out.println(topNum+bottomNum);
                    break;
                case "-":
                    System.out.println(topNum-bottomNum);
                    break;
                case "*":
                    System.out.println(topNum*bottomNum);
                    break;
                default:
                    break;
            }
        } else {
            // Prints if the user got incorrect, then the correct answer
            System.out.print("Incorrect. The correct answer was: ");
            switch (operation) {
                case "+":
                    System.out.println(topNum+bottomNum);
                    break;
                case "-":
                    System.out.println(topNum-bottomNum);
                    break;
                case "*":
                    System.out.println(topNum*bottomNum);
                    break;
                default:
                    break;
            }
        }

    }
}

/* Sample output 1
           Math Tutor
        ----------------
Enter + for Addition problem.
Enter - for Addition problem.
Enter * for Addition problem.
+
Here is your problem

         24
        +67
         ---
         91
Correct
*/
/* Sample output 2
           Math Tutor
        ----------------
Enter + for Addition problem.
Enter - for Addition problem.
Enter * for Addition problem.
*
Here is your problem

         25
        *58
         ---
         1
Incorrect. The correct answer was: 1450
*/
/* Sample output 3
           Math Tutor
        ----------------
Enter + for Addition problem.
Enter - for Addition problem.
Enter * for Addition problem.
*
Here is your problem

         23
        *46
         ---
         69
Incorrect. You probably used the wrong operation
The correct answer was: 1058
*/