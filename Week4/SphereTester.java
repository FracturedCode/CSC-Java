

/**
 * 
 * @author Dilshad and Java Foundations
 * Do not change the tester. 
 *
 */
public class SphereTester
{ 
//-----------------------------------------------------------------
//  Creates and exercises some Sphere objects.
//-----------------------------------------------------------------
   public static void main(String[] args)
   {
    
	
	Sphere basketBall = new Sphere(4.75);  //in inches
	System.out.println("Basketball\n----------\n" + basketBall);
	//println will implicitly/automaticlly call toString method of the Sphere object.
	
	Sphere eyeBall    = new Sphere(0.5);
	System.out.println("Eyeball\n----------\n"+eyeBall.toString()); //explicitly calling toString()
	
	Sphere softBall;          // 1. Declare a reference "softBall" to the Sphere object
	softBall = new Sphere(); //2. Create the object using new operation
   
	System.out.println("Softball's radius: " + softBall.getRadius() );
	
	softBall.setRadius(18.4);

	System.out.println("Softball after setting radius to " +softBall.getRadius()+"\n------------------------------------" );

	System.out.println(softBall);
	
	
    }
}

/*Basketball
----------
radius: 4.75   volume: 448.921    area: 283.529
numSpheres: 1

Eyeball
----------
radius: 0.5   volume: 0.524    area: 3.142
numSpheres: 2

Softball's radius: 0.0
Softball after setting radius to 18.4
------------------------------------
radius: 18.4   volume: 26094.085    area: 4254.47
numSpheres: 3

*/
