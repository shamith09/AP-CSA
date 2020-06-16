// Chapter 7 Question 13

import java.util.Scanner;

public class Dates
{
  /**
   *  returns true if month1/day1/year1 is later than
   *  month2/day2/year2; otherwise returns false
   */
  public static boolean isLater(int month1, int day1, int year1,
                                int month2, int day2, int year2)
  {
      if (month1 < 13 && month2 < 13 && month1 > 0 && month2 > 0 &&
          day1 < 32 && day2 < 32 && day1 > 0 && day2 > 0)
      {
          if (year1 > year2 || month1 > month2 || (month1 == month2 && day1 > day2))
          {
              return true;
          }
      }
      else if (month1 > 13 || month2 > 13 || month1 < 0 || month2 < 0 ||
            day1 > 32 || day2 > 32 || day1 < 0 || day2 < 0)
      {
          System.out.println("One or more of your values is not a valid month, day or year");
      }
   
      return false;
  }

  public static void main(String[] args)
  {
    Scanner kb = new Scanner(System.in);

    System.out.print("Enter the first date  (month day year): ");
    int month1 = kb.nextInt();
    int day1 = kb.nextInt();
    int year1 = kb.nextInt();

    System.out.print("Enter the second date (month day year): ");
    int month2 = kb.nextInt();
    int day2 = kb.nextInt();
    int year2 = kb.nextInt();

    System.out.println();  // blank line

    String msg = month1 + "/" + day1 + "/" + year1;
    if (isLater(month1, day1, year1, month2, day2, year2))
      msg += " IS ";
    else
      msg += " is NOT ";
    msg += "later than " + month2 + "/" + day2 + "/" + year2;
    System.out.println(msg);
    kb.close();
  }
}

