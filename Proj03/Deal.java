
/**
 * Write a description of class Deal here.
 *
 * @author (Bhavya Gupta)
 * @version (09/11/2019)
 */

import java.util.Random;

public class Deal
{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int card = rand.nextInt(12) + 1;
        int suit = rand.nextInt(3);
        
        System.out.print(card);
        
        if (suit == 0)
            System.out.print("\u2660"); 
        else if (suit == 1)
            System.out.print("\u2663"); 
        else if (suit == 2)
            System.out.print("\u2665"); 
        else
            System.out.print("\u2666"); 
        
        
    }
}
