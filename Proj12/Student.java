
/**
 * Write a description of class Student here.
 *
 * @author Bhavya Gupta
 * @version 1/21/19
 */

import java.lang.reflect.Array;

public class Student extends Person
{
    private int scoreCount;
    private int[] earnedPts;
    private int[] possPts;
    
    public Student(String name, int age)
    {
        super(name, age);
        scoreCount = 0;
        earnedPts = new int[10];
        possPts = new int[10];
    }
    public void accumScore(int score, int maxScore)
    {
        earnedPts[scoreCount] = score;
        possPts[scoreCount] = maxScore;
        scoreCount++;
    }
    public String toString()
    {
        String temp = "Name: " + getOwnName() + ", Age: " + getOwnAge() + ", "
                      + "Scores: ";
        for (int i = 0; i < scoreCount; i++)
        {
            if (i == scoreCount - 1)
                temp += earnedPts[i] + "/" + possPts[i];
            else
                temp += "" + earnedPts[i] + "/" + possPts[i] + ", ";
        }
        return temp;
    }
    public double calcGrade()
    {
        double studentScore = 0;
        double possibleScore = 0;
        for (int i = 0; i < scoreCount; i++)
        {
            studentScore += earnedPts[i];
            possibleScore += possPts[i];
        }
        return 100 * studentScore / possibleScore;
    }
    public void dropLowestScore()
    {
        double lowestPercent = 100.0;
        int index = -1;
        for (int i = 0; i < scoreCount; i++)
        {
            if (100 * earnedPts[i] / possPts[i] < lowestPercent)
            {
                lowestPercent = 100.0 * earnedPts[i] / possPts[i];
                index = i;
            }
        }
        for (int i = index; i < scoreCount - 1; i++)
        {
            earnedPts[i] = earnedPts[i+1];
            possPts[i] = possPts[i+1];
        }
        scoreCount--;
    }
}
