// Chapter 7 Question 13

import java.util.Scanner;

public class BookCost
{
  /**
   *  returns true if month1/day1/year1 is later than
   *  month2/day2/year2; otherwise returns false
   */
  public static double getOrderTotal(int bp, int nb)
  {
      int total = bp + nb;
      if (bp == 1 && nb == 1)
      {
          return 37.95;
      }else if (total >= 3)
      {
          return Math.round(100*total*15.95)/100.0;
      }else if (total >= 12)
      {
          return Math.round(100*total*14.0)/100.0;
      }
      return bp*18.95 + nb*21.95;
  }

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter the number of \"Be Prepared\" books: ");
    int bp = kb.nextInt();

    System.out.print("Enter the number of \"Next Best\" books: ");
    int nb = kb.nextInt();

    System.out.println();  // blank line

    System.out.println("Total price: $" + getOrderTotal(bp, nb));
    kb.close();
  }
}

