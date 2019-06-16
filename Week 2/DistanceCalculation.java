//Program Name:  DistanceCalculation.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/4/19
//Brief Description: A distance calculator
//A program that reads two coordinates (integers only) and calculates the distance between          
//Description of inputs:  an x, y, x2, y2
//Description of outputs: Prompts for coordinates, outputs the calculation and coordinates.

import java.util.Scanner;
import java.text.DecimalFormat;

public class DistanceCalculation {
    public static void main(String[] args) {
        Scanner coordsIn = new Scanner(System.in);      // To take user input for coordinates
        DecimalFormat df = new DecimalFormat("#.###");  // To format the distance

        int x1, y1, x2, y2;                             // The inputs (coordinates)
        double distance;                                // The calculated distance
        String result;                                  // distance formatted to three decimal places

        System.out.println("**************Distance Calculation**************");
        System.out.println("Enter the first coordinate values: ");      // Takes input from the user
        System.out.print("x = ");
        x1 = Integer.parseInt(coordsIn.next());                         // Using coordsIn.nextInt() would produce a newline
        System.out.print("y = ");                                       // Instead this uses next() to keep it on one line
        y1 = Integer.parseInt(coordsIn.next());                         // and parseInt() to make the string an integer
        System.out.println("Enter the second coordinate values: ");
        System.out.print("x2 = ");
        x2 = Integer.parseInt(coordsIn.next());
        System.out.print("y2 = ");
        y2 = Integer.parseInt(coordsIn.next());

        distance = Math.sqrt(           // The distance formula
            Math.pow(x2-x1, 2) +        // Using our inputs from above
            Math.pow(y2-y1, 2)
        );
        result = df.format(distance);   // To format our distance to three decimals as required by the instructions

        System.out.println("The distance between (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + result);  // Our final output for the distance


    }
    
}

/* Sample output
**************Distance Calculation**************
Enter the first coordinate values:
x = 2
y = 2
Enter the second coordinate values:
x2 = 1
y2 = 1
The distance between (2, 2) and (1, 1) is 1.414
*/