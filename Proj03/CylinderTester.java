
/**
 * A tester program for the class Cylinder, currently uses
 * hard-coded values.
 *
 * @author Bhavya Gupta
 * @version 09/21/19
 */
public class CylinderTester
{
    public static void main(String[] args)
    {
        Cylinder myCylinder = new Cylinder(5, 10);
        
        System.out.println("Expected Volume: 785.39...");
        System.out.println("Actual Volume: " + myCylinder.getVolume());
        
        System.out.println("Expected Surface Area: 471.23...");
        System.out.println("Actual Surface Area: " + myCylinder.getSurfArea());
    }
}
