
/**
 * Write a description of class ColorChecker here.
 *
 * @Bhavya Gupta
 * @09/09/2019
 */
import java.awt.Color;

public class ColorChecker
{
    public static void main(String[] args)
    {
        Color myColor = new Color(100,80,160);
        
        System.out.println("Original: " + myColor);
        System.out.println("Brighter: " + myColor.brighter());
    }
}
