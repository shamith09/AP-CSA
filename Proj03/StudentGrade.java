
/**
 * Creates a new student with a starting grade 0f 0/0. Users can
 * add points the student earned and the total possible points they 
 * could have gotten. It can also subtract these same points and print
 * the student's current grade as a percent out of 100.
 *
 * @author Bhavya Gupta
 * @version 09/21/19
 */
public class StudentGrade
{
    // FIELDS
    private String studentName;
    private int earnedScore = 0;
    private int possibleScore = 0;
    
    // CONSTRUCTORS
    /**
     * Constructor for objects of class StudentGrade
     * @param name the name of the student
     */
    public StudentGrade(String name)
    {
        studentName = name;
    }
    
    // METHODS
    /**
     * Adds the student's score to his total score and the
     * maximum score of that assignment to his current possible
     * maximum score.
     * @param score the student's score on that assingment
     * @param maxScore the maximum possible score for that assignment
     */
    public void accumScore(int score, int maxScore)
    {
        earnedScore += score;
        possibleScore += maxScore;
    }
    
    /**
     * Subtracts the student's score from his total score and the
     * maximum score of that assignment from his current possible
     * maximum score.
     * It can be used to correct an incorrect score or to excuse the 
     * student from that assignment.
     * @param score the student's score on that assingment
     * @param maxScore the maximum possible score for that assignment
     */
    public void dropScore(int score, int maxScore)
    {
        earnedScore -= score;
        possibleScore -= maxScore;
    }
    
    /**
     * Returns the student's current grade out of 100
     * @return the student's grade in percent out of 100%
     */
    public int calcGrade()
    {
        return earnedScore * 100 / possibleScore;
    }
}
