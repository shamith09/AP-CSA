
/**
 * A tester program for the MathCalculations class.
 *
 * @author Bhavya Gupta
 * @version 10/03/2019
 */
public class MathCalculationsTester
{
    public static void main(String[] args)
    {
        System.out.println("Actual temperature in farenheit: " + MathCalculations.cToFDeg(12));
        System.out.println("Expected temperature in farenheit: 54");
        System.out.println("Actual distance: " + MathCalculations.distanceFormula(1, 2, 0, 0));
        System.out.println("Expected distance: 2.236...");
        System.out.println("Actual volume: " + MathCalculations.volOfSphere(1));
        System.out.println("Expected volume: 4.188...");
        System.out.println("Actual value: " + MathCalculations.approxE(10));
        System.out.println("Expected value: 2.593...");
        System.out.println("Actual time: " + MathCalculations.timeConverter(62784));
        System.out.println("Expected time: 17:26:24");
    }
}
