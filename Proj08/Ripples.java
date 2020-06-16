import java.util.Scanner;
public class Ripples
{
    public static void main(String[] args)
    
    {
        Scanner kb = new Scanner(System.in);
        final double PRICE = 0.26;
        final int SENTINEL = -1;
        while (true)
        {   
            int check = 0;
            System.out.print("Enter quantity: ");
            int quantity = kb.nextInt();
            if (quantity % 25 == 0 && quantity >= 0)
            {
                System.out.printf("You have ordered %d Ripples -- $%.2f\n\n", 
                                    quantity, PRICE*quantity);
            }
            else
            {
                System.out.println("Ripples can only be ordered in packs of 25.\n");
            }
            while (true)
            {
                Scanner kb2 = new Scanner(System.in);
                System.out.println("Next customer (y/n): ");
                char ans;
                
                String str = kb2.nextLine();
                str = str.trim();
                if (str.length() == 1)
                    ans = str.charAt(0);
                else
                    ans = ' ';
                    
                if (ans == 'n')
                {
                    check = SENTINEL;
                    System.out.println("Thank you for using Ripple Systems.");
                    break;
                }else if (ans == 'y')
                {
                    break;
                }
            }
            if (check == SENTINEL)
            {
                break;
            }
        }
    }
}

