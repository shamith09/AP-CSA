/**
 * Write a description of class Fraction here.
 *
 * @author Bhavya Gupta
 * @version 11/15/19
 */

public class Fraction
{

  // ******************  Instance variables  ******************

  private int num;
  private int denom;

  // *********************  Constructors  *********************

  public Fraction()       // no-args constructor
  {
    num = 0;
    denom = 1;
  }

  public Fraction(int n)
  {
    num = n;
    denom = 1;
  }

  public Fraction(int n, int d)
  {
    if (d != 0)
    {
      num = n;
      denom = d;
      reduce();
    }
    else
    {
      throw new IllegalArgumentException(
           "Fraction construction error: denominator is 0");
    }
  }

  public Fraction(Fraction other)  // copy constructor
  {
    num = other.num;
    denom = other.denom;
  }

  // ********************  Public methods  ********************

  /** Returns the sum of this fraction and other
   * 
   * @param other the fraction to be added
   * @return the sum of the 2 fractions
   */
  public Fraction add(Fraction other)
  {
    int newNum = num * other.denom + denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }
  
  /** Returns the difference of this fraction and other
   * 
   * @param other the fraction to be subtracted
   * @return the difference of the 2 fractions
   */
  public Fraction subtract(Fraction other)
  {
    int newNum = num * other.denom - denom * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }

  /** Returns the product of this fraction and other
   * 
   * @param other the fraction to be mulitplied
   * @return the product of the 2 fractions
   */
  public Fraction multiply(Fraction other)
  {
    int newNum = num * other.num;
    int newDenom = denom * other.denom;
    return new Fraction(newNum, newDenom);
  }
  
  /** Returns the quotient of this fraction and other
   * 
   * @param other the fraction to be divided
   * @return the quotient of the 2 fractions
   */
  public Fraction divide(Fraction other)
  {
    int newNum = num * other.denom;
    int newDenom = denom * other.num;
    return new Fraction(newNum, newDenom);
  }

  /** Returns double version of the fractional components
   * 
   * @return the double value of the numbers
   */
  public double getValue()
  {
    return (double)num / (double)denom;
  }

  /** Returns the fraction in the form of a string with '/'
   * 
   * @return the fraction in string format
   */
  public String toString()
  {
    return num + "/" + denom;
  }

  // *******************  Private methods  ********************

  /** Returns the reduced form of the fraction
   * 
   * @return the reduced form of the fraction
   */
  private void reduce()
  {
    if (num == 0)
    {
      denom = 1;
      return;
    }

    if (denom < 0)
    {
      num = -num;
      denom = -denom;
    }

    int q = gcf(Math.abs(num), denom);
    num /= q;
    denom /= q;
  }

  /** Returns the gcf of the 2 numbers
   * 
   * @param n the first denom
   * @param n the second denom
   * @return the gcf of the 2 parameters
   */
  private int gcf(int n, int d)
  {
    if (n <= 0 || d <= 0)
    {
      throw new IllegalArgumentException(
                  "gcf precondition failed: " + n + ", " + d);
    }

    if (n % d == 0)
      return d;
    else if (d % n == 0)
      return n;
    else
      return gcf(n % d, d % n);
  }
}
