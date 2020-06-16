/**
 * Have a brief conversation with the user.
 * 
 * @author Bhavya Gupta 
 * @version 09/05/2019
 */

import java.util.Scanner;

public class Conversation2
{
  public static void main(String[] args)
  {
    Scanner kboard = new Scanner(System.in); // Create keyboard object to get input from user
    
    System.out.print("What school do you go to? "); // Ask user
    String school = kboard.nextLine();         // Accept answer from user
    
    System.out.println("Nice, I go to " + school + " as well.");
    
    System.out.print("\nWhat grade are you in? "); // Ask user
    int grade = kboard.nextInt();              // Accept answer from user
    
    System.out.println("Hey, I am in " + grade + "th grade too.");    
        
    System.out.print("\nWhat is your gpa? "); // Ask user
    double gpa = kboard.nextDouble();              // Accept answer from user
    System.out.println("Oh, my gpa is much lower than " + gpa + ".");    
    
    System.out.println("\nIt was very nice to meet you!");    
        
    kboard.close(); // Done using the keyboard
  }
}
