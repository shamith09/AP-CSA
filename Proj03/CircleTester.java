
/**
 * A tester program for the class Circle, currently uses
 * hard-coded values.
 *
 * @author Bhavya Gupta
 * @version 09/21/19
 */
public class CircleTester
{
    public static void main(String[] args)
    {
        Circle myCircle = new Circle(1);
        
        System.out.println("Expected Area: 3.1415...");
        System.out.println("Actual Area: " + myCircle.getArea());
        
        System.out.println("Expected Circumference: 6.2831...");
        System.out.println("Actual Circumference: " + myCircle.getCircumf());
    }
}
