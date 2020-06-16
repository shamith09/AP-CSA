
/**
 * Write a description of class StudentTester here.
 *
 * @author Bhavya Gupta
 * @version 1/21/20
 */
public class StudentTester
{
    public static void main(String[] args)
    {
        Student stu = new Student("Bob", 15);
        System.out.println(stu);
        
        stu.accumScore(19, 20);
        stu.accumScore(1, 100);
        stu.accumScore(9, 13);
        stu.accumScore(1, 2);
        stu.accumScore(5, 6);
        stu.accumScore(39, 40);
        stu.accumScore(32, 43);
        stu.accumScore(16, 20);
        stu.accumScore(12, 14);
        stu.accumScore(21, 34);
        
        // 11th score, causes IndexOutOfBounds error
        //stu.accumScore(19, 20);
        
        System.out.println(stu);
        
        System.out.println("Percent Grade: " + stu.calcGrade());
        System.out.format("Percent Grade: %.2f\n", stu.calcGrade());
        
        stu.dropLowestScore();
        System.out.println(stu);
    }
}
