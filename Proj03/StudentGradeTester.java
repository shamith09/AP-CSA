
/**
 * A tester program for the class StudentGrade, currently uses
 * hard-coded values.
 *
 * @author Bhavya Gupta
 * @version 9/21/19
 */
public class StudentGradeTester
{
    public static void main(String[] args)
    {
        StudentGrade kiddo = new StudentGrade("juaquin");
        
        kiddo.accumScore(9,10);
        System.out.println("Expected: 90");
        System.out.println("Actual: " + kiddo.calcGrade());
        
        kiddo.dropScore(4,5);
        System.out.println("Expected: 100");
        System.out.println("Actual: " + kiddo.calcGrade());
        
        kiddo.dropScore(5,4);
        System.out.println("Expected: 0");
        System.out.println("Actual: " + kiddo.calcGrade());
    }
}
