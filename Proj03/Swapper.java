
/**
 * Write a description of class Swapper here.
 *
 * @Bhavya Gupta
 * @09/09/2019
 */


public class Swapper
{
    public static void main(String[] args)
    {
        String school = "California";
        school = school.replace("a", "x");
        school = school.replace("i", "a");
        school = school.replace("x", "i");
        
        System.out.println("Original: " + school);
        System.out.println("Result: " + school);        
        System.out.println("Expected: Cil Hagh");
    }
}
