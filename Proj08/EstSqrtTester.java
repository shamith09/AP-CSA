import java.lang.Math;
/**
 * Write a description of class EstSqrtTester here.
 *
 * @author Bhavya Gupta
 * @version 11/06/19
 */
public class EstSqrtTester {

    public static double estSqrt(double a)
    {
        double x = a/2;
        
        do
        {
            x = 0.5 * (x + a / x);
        } while (Math.abs(x * x - a) >= 0.01);
        
        return x;
    }

    public static void main(String[] args) {

        double num;

        for (int i = 0; i < 3; i++) {

            num = Math.random()*Math.pow(10,(Math.random()*4));

            System.out.printf("Square root of %7.2f is %7.2f\n", num, estSqrt(num));

        }

    }

}
