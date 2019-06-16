//Program Name:  ReadingFile.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/12/19
//Brief Description: Takes exam scores from StudentData.txt and prints them and finds the average
//Description of inputs:  inputs a file's contents
//Description of outputs: Display file contents

import java.io.*;
import java.util.Scanner;

public class ReadingFile {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("StudentData.txt");
        Scanner inFile = new Scanner(file);
        double exam[] = new double[5];
        double sum = 0;

        System.out.println("Scores: ");
        for (int i = 0; i<5; i++) {
            exam[i] = inFile.nextDouble();
            System.out.println(exam[i]);
        }
        for (double score : exam) {
            sum += score;
        }
        System.out.println("Average: " + (sum / 5.0));
        inFile.close();

    }
}
/*What happens if the data in StudentData.txt is separated by spaces on a single line instead of new Line?
Nothing, the Scanner object is smart enough to see that a space is a delimeter

What happens if the data in StudentData.txt is separated by tabs?
Nothing again


What happens if the data in StudentData.txt is separated by commas?
InputMismatchException because a comma is not whitespace it is not seen as a delimeter automatically. The scanner tries to read the comma as part of the input to double
*/
/* Example output
Scores:
1.0
2.0
3.0
4.0
5.0
Average: 3.0
*/