import java.lang.Math;
/**
 * This class has multiple math functions that can be used for various classes
 * or everyday life.
 *
 * @author Bhavya Gupta
 * @version 10/03/2019
 */
public class MathCalculations
{
    // METHODS
    /**
     * Converts temperature in Celsius to temeprature in Farenheit.
     *
     * @param celsius integer degrees in celsius
     * @return equivalent temperature in farenheit
     */
    public static int cToFDeg(int celsius)
    {
        return (int)Math.round(celsius * 1.8 + 32);
    }
    
    /**
     * Returns the distance between 2 points on a 2D graph
     *
     * @param x1 the x value of the first point
     * @param y1 the y value of the first point
     * @param x2 the x value of the second point
     * @param y2 the y value of the second point
     * @return the distance between the two points
     */
    public static double distanceFormula(double x1, double y1, double x2, double y2)
    {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    /**
     * Returns the volume of a sphere after being given its radius.
     *
     * @param radius the radius of the sphere
     * @return the volume of the sphere
     */
    public static double volOfSphere(double radius)
    {
        return (4 * Math.pow(radius, 3) * Math.PI) / 3;
    }
    
    /**
     * Returns the approximate value of e given a value
     *
     * @param n the number to used to calculate e
     * @return the approximate value of e
     */
    public static double approxE(int n)
    {
        return Math.pow(1.0 + (1.0 / n), n);
    }
    
    /**
     * Returns a time duration in hours, minutes, and seconds when given just seconds
     *
     * @param secs the number of seconds to be converted
     * @return the time duration in hours, minutes, and seconds
     */
    public static String timeConverter(int secs)
    {
        int hours = secs / 3600;
        int min = (secs / 60) - (hours * 60);
        secs -= hours * 3600 + min * 60;
        return (hours + ":" + min + ":" + secs);
    }
}
