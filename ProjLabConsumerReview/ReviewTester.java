
/**
 * Write a description of class ReviewTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReviewTester
{
    public static void main(String[] args)
    {
        System.out.println(Review.sentimentVal("warm"));
        System.out.println(Review.totalSentimentVal("26WestReview.txt"));
        System.out.println(Review.starRating("SimpleReview.txt"));
        System.out.println(Review.fakeReview("SimpleReview.txt"));
    }
}
