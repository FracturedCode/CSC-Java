//Program Name:  FamousCS.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/16/19
//Brief Description: Parses data on exam scores into an average          
//Description of inputs:  Inputs from a file (scores.txt)
//Description of outputs: outputs exam averages, number of students parsed to console and CSExamReport.txt

import java.io.*;
import java.util.Scanner;

public class FamousCS {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File inFile = new File("scores.txt");   // The input file
        Scanner reader = new Scanner(inFile);   // To read the scores from the input file
        String name;                            // The name of the student whose average is being calculated
        double scores[] = new double[5];        // For storing the five scores of each student. Not necessary, just convenient
        double sumScores = 0, averageScore;     // For the average calculation of each student
        int studentCounter = 0;                 // To be incremented to count the number of student records
        PrintWriter outFile = new PrintWriter(new FileWriter("CSExamReport.txt"));  // The output file


        echoToFile("Computer Scientist Exam Report\n------------------------------", outFile);  // A greeting

        while (reader.hasNext()) {  // Loops for every student
            name = reader.next() + " " + reader.next(); // The first two words are the first and last name of the student

            for (int i = 0; reader.hasNextDouble(); i++) {  // The next information is the scores
                scores[i] = reader.nextDouble();            // Stores each score
                sumScores += scores[i];                     // Sums the scores for the average calculation
            }

            averageScore = sumScores / 5.0;                 // The average calculation

            echoToFile((name + " has an exam average of " + String.format("%.2f", averageScore)), outFile); // Prints the calculation and student name
            studentCounter++;
        }
        echoToFile("?????? has an exam average of ?????", outFile); // Example formatting
        echoToFile(("There were " + studentCounter + " student records in this file."), outFile);   // Shows how many student records were parsed
        reader.close();
        outFile.close();
    }
    private static void echoToFile(String text, PrintWriter outFile) {
        // Prints to the file outFile (CSExamReport.txt) and the console
        outFile.println(text);
        System.out.println(text);
    }
}