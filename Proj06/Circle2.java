import java.lang.Math.*;

/**
 * Users can get the area or circumference of a circle after inputting
 * its radius.
 *
 * @author Bhavya Gupta
 * @version 09/21/19
 */


public class Circle2
{
    // FIELDS
    private double radius;
    
    // CONSTRUCTORS
    /**
     * Constructor for objects of class Circle
     * @param radius the radius of the circle
     */
    public Circle2(double circleRadius)
    {
        radius = circleRadius;
    }
    
    // METHODS
    /**
     * Returns the area of the circle based on the radius given 
     * earlier.
     * @return the area of the circle
     */
    public double getArea()
    {
        return radius * radius * Math.PI;
    }
    
    /**
     * Returns the circumference of the circle based on the radius 
     * given earlier.
     * @return the circumference of the circle
     */
    public double getCircumf()
    {
        return 2 * radius * Math.PI;
    }
}
