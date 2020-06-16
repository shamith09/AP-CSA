import java.lang.Math;
/**
 * Write a description of class Die here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die
{
    // instance variables - replace the example below with your own
    private int number;
    
    public Die()
    {
    }
    
    public void roll()
    {
        number = (int)((Math.random() * 6.0 ) + 1);
        
    }
    
    public int getNumDots()
    {
        return number;
    }
}
