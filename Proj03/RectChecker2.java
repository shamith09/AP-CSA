
/**
 * Write a description of class RectChecker2 here.
 *
 * @Bhavya Gupta
 * @09/09/2019
 */

import java.awt.Rectangle; 

public class RectChecker2
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(150, 120, 80, 60);
        box.translate((int)box.getWidth(), (int)box.getHeight());
        double area = box.getWidth() * box.getHeight();
        
        System.out.println("Result: " + box);
        System.out.println("Expected: [x=20,y=30,width=20,height=30]");
    }
}
