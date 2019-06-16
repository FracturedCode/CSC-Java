//Program Name:  SphereCalculation.java
//Author:        Adam Carpenter
//Class:         CSC 110
//Date Written:  6/6/19
//Brief Description: Calculates the volume and surface area of a sphere given radius
//Prints the volume and surface area to console     
//Description of inputs:  A radius (a number that could be a float)
//Description of outputs: Prompt for the radius and volume and surface area to four decimal places

import java.util.Scanner;
import java.text.DecimalFormat;

public class SphereCalculation {
    public static void main(String[] args) {
        double radius;              // Define Input
        double volume, surfArea;    // Outputs
        DecimalFormat df = new DecimalFormat("#.####");

        System.out.println("*****Volume and Surface Area of a Sphere*****");
        while(true) {                       // Using a try-catch with a while loop, the program asks for a radius
            try {                           // until it recieves a valid input (a number) so that it doesn't just exit if something invalid is entered
                System.out.print("Enter the sphere's radius: ");
                radius = new Scanner(System.in).nextDouble();   // Ok, I know, I know, it's messy, but it sure looks clean and uses fewer lines
                break;                                          // If try is executed with no problems, "break" out of the loop and continue with calculation
            } catch(java.util.InputMismatchException e) {
                System.out.println("Incorrect input, please use a double");
            }
        }

        volume      = 4.0/3 * Math.PI * Math.pow(radius, 3);                // Basic calculations of volume and surface area
        surfArea    = 4 * Math.PI * Math.pow(radius, 2);                    // given radius that was obtained before

        System.out.println("Volume: " + df.format(volume));                 // Prints our 2 calculations up to 4 decimal places
        System.out.println("Surface area: " + df.format(surfArea));
        System.out.println("Goodbye!!");
    }
}

/* Sample output
*****Volume and Surface Area of a Sphere*****
Enter the sphere's radius: 4.2
Volume: 310.3391
Surface area: 221.6708
Goodbye!!
*/