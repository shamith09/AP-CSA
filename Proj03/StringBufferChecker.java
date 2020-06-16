
/**
 * Write a description of class StringBufferChecker here.
 *
 * @Bhavya Gupta
 * @09/09/2019
 */


public class StringBufferChecker
{
    public static void main(String[] args)
    {
        StringBuffer text = new StringBuffer("hello");
        
        System.out.println("Original: " + text);
        System.out.println("Result: " + text.reverse());        
        System.out.println("Expected: olleh");
    }
}
