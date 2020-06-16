import java.awt.Color;
import java.util.Random;
/**
 * A tester program for the class Car.
 *
 * @author Bhavya Gupta
 * @version 09/23/19
 */
public class CarTester
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        Color darkGrey = new Color(172, 172, 172); 
        Car myCar = new Car("BMW", "X5", 2019, darkGrey, rand.nextInt(11) + 30);
        
        System.out.println("Make: " + myCar.getMake());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        System.out.println("Color: " + myCar.getColor());
        System.out.println("Speed in mph: " + myCar.getSpeed());
        
        for (int i = 0; i < 10; i++)
        {
            int num = rand.nextInt(5) + 1;
            if (rand.nextBoolean())
            {
                System.out.println("up " + num);
                myCar.speedUp(num);
            } else {
                System.out.println("down " + num);
                myCar.slowDown(num);
            }
            System.out.println("Speed in mph: " + myCar.getSpeed());
        }
    }
}
