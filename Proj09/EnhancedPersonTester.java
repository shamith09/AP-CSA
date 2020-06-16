
/**
 * Write a description of class EnhancedPersonTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class EnhancedPersonTester
{
    public static void main(String[] args)
    {
        Person bob = new Person("bob", 15);
        
        System.out.println("Name: " + bob.getOwnName());
        System.out.println("Age: " + bob.getOwnAge());
        
        bob.addFriend("john");
        bob.addFriend("BILLY");
        bob.addFriend("catsluna");
        bob.addFriend("billy");
        
        System.out.println(bob.getAllFriendsNames());
        System.out.println(bob);
        
        bob.unfriend("jake");
        bob.unfriend("john");
        
        System.out.println(bob.getAllFriendsNames());
        System.out.println(bob);
    }
}
