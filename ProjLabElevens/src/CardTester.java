/**
 * This is a class that tests the Card class.
 */
import java.util.ArrayList;

public class CardTester {
    /**
     * The main method in this class checks the Card operations for consistency.
     *  @param args is not used.
     */
    public static void main(String[] args) {
        ArrayList<Card> cards = new ArrayList<Card>();
        cards.add(new Card("Ace", "Diamonds", 1));
        cards.add(new Card("Eight", "Spades", 8));
        cards.add(new Card("Jack", "Clubs", 11));
        
        for (Card card : cards)
        {
            System.out.println(card.rank() + ", " + card.suit() + ", " + card.pointValue());
            System.out.println(card);
            System.out.println(card.matches(new Card("Eight", "Spades", 8)));
        }
    }
}
