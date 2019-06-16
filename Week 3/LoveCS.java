//Program Name:  Hello.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  5/30/19
//Brief Description: A hello world program
//This program demonstrates how to set up a basic program and how to println           
//Description of inputs:  None
//Description of outputs: Displays a few sentences in the console window

import java.util.Scanner;

public class LoveCS
{
    public static void main(String[] args)
    {
		int limit, count, sum;
		
        System.out.print("How many times do you want to print the message? ");  // Input for the limit
        limit = new Scanner(System.in).nextInt();
		count = 1;                //Initialize count to 1
		
		while (count <= limit)    //Condition: print the message [limit] times
		{
          System.out.println(count + " I love Computer Science!! This number is " + ((count%2.0==0) ? "even":"odd"));   // Prints the message, count and whether the count is even or odd
		  count++;                //Increment count 
		}

        System.out.println("Message was printed " + limit + ((limit==1)?" time.":" times."));   // Print the limit inputted
        sum = limit * (limit+1) / 2;            // Sum formula
        System.out.println("The sum of the numbers from 1 to " + limit + " is " + sum);         // Print the sum

    }
}

/* Example output
How many times do you want to print the message? 7
1 I love Computer Science!! This number is odd
2 I love Computer Science!! This number is even
3 I love Computer Science!! This number is odd
4 I love Computer Science!! This number is even
5 I love Computer Science!! This number is odd
6 I love Computer Science!! This number is even
7 I love Computer Science!! This number is odd
Message was printed 7 times.
The sum of the numbers from 1 to 7 is 28
*/
