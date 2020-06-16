import java.util.Scanner;
/**
 *
 * @author Bhavya Gupta
 * @version 11/03/19
 */
public class Poem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Boolean running = true;
        while (running)
        {
            System.out.print("Enter a number 1-10 (or 0 to quit): ");
            int num = input.nextInt();
            String line = "";
            switch (num)
            {
                case 1:
                    line = "Buckle your shoe";
                    break;
                case 2:
                    line = "Buckle your shoe";
                    break;
                case 3:
                    line = "Open the door";
                    break;
                case 4:
                    line = "Open the door";
                    break;
                case 5:
                    line = "Pick up the sticks";
                    break;
                case 6:
                    line = "Pick up the sticks";
                    break;
                case 7:
                    line = "Lay them straight";
                    break;
                case 8:
                    line = "Lay them straight";
                    break;
                case 9:
                    line = "Do it again!";
                    break;
                case 10:
                    line = "Do it again!";
                    break;
                default:
                    line = "Bye" ;
                    running = false;
            }
            System.out.println(line);
        }
    }
}
