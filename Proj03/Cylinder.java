import java.lang.Math.*;
import java.lang.Math.*;

/**
 * Users can get the volume and/or surface area of a cylinder after
 * inputting the radius.
 *
 * @author Bhavya Gupta
 * @version 09/21/19
 */
public class Cylinder
{
    // FIELDS
    private Circle base;
    private double height;

    // CONSTRUCTORS
    /**
     * Constructor for objects of class Cylinder
     * @param radius the radius of the cylinder
     * @param height2 the height of the cylinder
     */
    public Cylinder(double radius, double height2)
    {
        base = new Circle(radius);
        height = height2;
    }

    // METHODS
    /**
     * Returns the volume of the cylinder.
     *
     * @return the volume of the cylinder
     */
    public double getVolume()
    {
        return height * base.getArea(); 
    }
    
    /**
     * Returns the surface area of the cylinder.
     * 
     * @return the surface area of the cylinder
     */
    public double getSurfArea()
    {
        return base.getCircumf() * height + (2 * base.getArea());
    }
}
