import java.io.* ;
import java.util.Scanner;
/*Files Activity 1 : Writing to a text file
Program Name : WritingToFiles.java
Author : Adam Carpenter
Date : 6/12/19
Class : CSC110AB
Brief Description : This program writes 5 floating-point numbers to a file */


public class WritingToFiles {


   public static void  main(String arg []) throws FileNotFoundException
	{
		//Variables to store exam scores before writing them file
	
		
		double exam[] = new double[5];
		
		//Prompt user for all five scores and store them
		//in the above variables
		Scanner input = new Scanner(System.in);
		for (int i = 0; i<5; i++) {
			System.out.print("Score " + (i+1) + ": ");
			exam[i] = input.nextDouble();
		}
		
		//Define a PrintWriter object reference outFile and 
		//create a PrintWriter object by passing file name StudentData.txt

		PrintWriter outFile = new PrintWriter("StudentData.txt");
	

	    //Use the opened file and write all the exam scores 
	    for (double score : exam) {
	    	outFile.println(score);
	    }
		
	
			


		//write a message back to the user
		System.out.println("Your numbers have been written to the StudentData.txt file.\n");
		
	    //Close the output file

	  	outFile.close();
		
	    System.out.println("Goodbye\n");;

	}
}

/*Please answers the questions below as comments 
Save file with your answers and then upload to Canvas

   1.	Where is StudentData.txt located?
   In the directory WritingToFiles.class is located
   

   2.	What happens to data that is StudentData.txt when you run your
         program again with different exam values?
   The data is overwritten with the new exam values.
         
*/

/* Example Output
Score 1: 1
Score 2: 2
Score 3: 3
Score 4: 4
Score 5: 5
Your numbers have been written to the StudentData.txt file.

Goodbye
*/

