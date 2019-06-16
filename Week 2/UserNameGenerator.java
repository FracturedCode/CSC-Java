//Program Name:  UserNameGenerator.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/6/19
//Brief Description: Generates a basic username by having the user enter their full name
// The username consists of first letter of first name + first five letters of last name + one random 2 digit number    
//Description of inputs:  Two inputs: First name and last name
//Description of outputs: Prompts for first and last name and displays the generated username

import java.util.Scanner;
import java.util.Random;

public class UserNameGenerator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);     // Basic input stream for first and last name
        String firstName, lastName, genUserName;
        int generatedNum;                           // The number that will be part of the username
        // Not sure if the directions were specifying 99 inclusive or exclusive so I assumed inclusive
        
        System.out.println("********Username Generator********");   // Prompts for necessary information
        System.out.print("Enter your first name: ");
        firstName = input.next();
        System.out.print("Enter your last name: ");
        lastName = input.next();

        generatedNum = new Random().nextInt(90) + 10;               // Generates the random 2 digit number
        try {
            genUserName = firstName.charAt(0) + lastName.substring(0, 5) + generatedNum;    // Creates the generated username
        } catch (java.lang.StringIndexOutOfBoundsException e) {                             // Uses try-catch in case the last name isn't long enough
            System.out.println("Please enter a last name of 5 or more letters");
            return;
        }
        System.out.println("Username Generated: " + genUserName);   // Prints generated username
        System.out.println("Good Bye!");
    }
}
/* Sample output
********Username Generator********
Enter your first name: Adam
Enter your last name: Carpenter
Username Generated: ACarpe79
Good Bye!
*/