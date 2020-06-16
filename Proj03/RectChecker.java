
/**
 * Write a description of class RectChecker here.
 *
 * @Bhavya Gupta
 * @09/09/2019
 */

import java.awt.Rectangle; 

public class RectChecker
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(20, 30, 40, 50);
        double area = box.getWidth() * box.getHeight();
        
        System.out.println("area: " + area);
        System.out.println("Expected: 5000");
    }
}
