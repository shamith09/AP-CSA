import java.awt.Color;
/**
 * This program represents a car and has various fields like the make, 
 * model, year, color, and current speed of it. Users can get these values
 * and also decrease or increase the speed of the car. 
 *
 * @author Bhavya Gupta
 * @version 9/23/19
 */

public class Car
{
    // FIELDS
    private String make;
    private String model;
    private int year;
    private Color color;
    private int speed;

    // CONSTRUCTORS
    /**
     * Constructor for objects of class Car without arguments
     */
    public Car()
    {
        make = "";
        model = "";
        year = 0;
        color = Color.BLACK;
        speed = 0;
    }
    
    /**
     * Constructor for objects of class Car with the following arguments
     * 
     * @param initMake the make of the car
     * @param initModel the model of the car
     * @param initYear the year the car was made
     * @param initColor the color of the car
     * @param initSpeed the speed the color is traveling at
     */
    public Car(String initMake, String initModel, int initYear, 
               Color initColor, int initSpeed)
    {
        make = initMake;
        model = initModel;
        year = initYear;
        color = initColor;
        speed = initSpeed;
    }

    // METHODS
    /**
     * Returns the make of the car
     *
     * @return make the make of the car
     */
    public String getMake()
    {
        return make;
    }
    
    /**
     * Returns the model of the car
     *
     * @return model the model of the car
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * Returns the year of the car
     *
     * @return year the year of the car
     */
    public int getYear()
    {
        return year;
    }
    
    /**
     * Returns the color of the car
     *
     * @return color the color of the car
     */
    public Color getColor()
    {
        return color;
    }
    
    /**
     * Returns the speed of the car
     *
     * @return speed the speed of the car
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /**
     * Increases the speed of the car
     *
     * @param miles the speed to be increased in miles per hour
     */
    public void speedUp(int miles)
    {
        speed += miles;
    }
    
    /**
     * Decreases the speed of the car
     *
     * @param miles the speed to be decreased in miles per hour
     */
    public void slowDown(int miles)
    {
        speed -= miles;
    }
}
