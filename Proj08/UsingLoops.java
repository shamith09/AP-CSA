
/**
 * This is a class with assorted static methods that can be used for
 * various purposes.
 *
 * @author Bhavya Gupta
 * @version 11/06/19
 */
public class UsingLoops
{
    /**
     * Calculate the year when the population reaches a certain number
     * given the start and end years, percent increasem and and future
     * population wanted.
     *
     * @param initYear the initial year
     * @param initPop the initial population
     * @param futurePop the population in a future year
     * @param rate the growth rate per year
     * @return the year when the population reaches a certain number
     */
    public static int popGrowth(int initYear, double initPop, double futurePop, double rate)
    {
        double pop = initPop;
        int year = initYear;
        double rateg = 1.0 + rate;
        while (pop < futurePop)
        {
            pop *= rateg;
            year++;
        }
        return year;
    }
    
    /**
     * Calculates the sum of the multiples of 3 from 1 to a specified
     * number
     *
     * @param n the ending number, inclusive
     * @return the sum of the multiples of 3 from 1 to n
     */
    public static int addMultOf3(int n)
    {
        int sum = 0;
        for (int i = 0; i <= n; i+=3)
        {
            sum += i;
        }
        return sum;
    }
    
    /**
     * Calculates the number of chairs in another row in the theater given
     * the row numbers, number of chairs increasing or decreasing per row, 
     * and the number of chairs in the first row given.
     * 
     * @param rowNum1 the row number of the given row
     * @param count1 the number of chiars in row1
     * @param k the difference in charis per row
     * @param rowNum2 the row number for which chair count is being food
     * @return the number of chairs in the wanted row
     */
    public static int calcChairs(int rowNum1, int count1, int k, int rowNum2)
    {
       int diff = rowNum2 - rowNum1;
       int count2 = count1;
       if (diff < 0)
       {
            for (int i = 0; i > diff; i--)
                count2 -= k;
       }else {
            for (int i = 0; i < diff; i++)
                count2 += k;
       }
       return count2;
    }
    
    /**
     * Calculates the number of months when a student achieves certain 
     * percentage of the knowledge from studying certain material.
     *
     * @param rate the rate of knowledge gained in one month in decimal form
     * @param desired the amount of knowledge wanted in rate form
     * @return the number of months to obtain the desired % of knowledge
     * material
     */
    public static double knowledgGrowth(double rate, double desired)
    {
       if (desired == 0)
            return 0;
        double knowledge = 0;
        double remaining = 1;
        double months = 0; 
        do
        {
            knowledge += rate*remaining;
            remaining = 1-knowledge;
            months++;
        }while (knowledge < desired);
        return months;

   }

    /**
     * Calculates the value of pi based on the Gregory Series
     *
     * @param n the number of terms to estimate pi
     * @return the value of pi based on 'n' iterations of the series
     */
    public static double estPi(int n)
    {
        double pi = 0;
        double s = 1;
        for (double i = 1; i <= n*2; i+=2)
        {
            pi = pi + s * (4 / i);
            s *= -1;
        }
        return pi;
    }
    
    /**
     * Prints a triangle of X's with the first row having 1 X and the last
     * having 2n-1 X's.
     *
     * @param n the number of rows in the triangle
     */
    public static void starTriangle(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = n-i; j > 1; j--)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i*2+1; j++)
            {
                System.out.print("X");
            }
            System.out.println();
        }
    }

    /**
     * Prints an identity matrix with n rows and columns
     *
     * @param n the number of rows and columns in the matrix
     */
    public static void identMatrix(int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                    System.out.print(1 + " ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args)
    {
        System.out.println(popGrowth(2000, 1.0, 4.0, 1.0));
        System.out.println(addMultOf3(10));
        System.out.println(calcChairs(1,10,10,5));
        System.out.println(knowledgGrowth(0.1, 0.3438));
        System.out.println(estPi(100));
        starTriangle(5);
        identMatrix(4);
    }
}
