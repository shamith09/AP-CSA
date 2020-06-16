
public class Student extends Person {
	
	private int gradeLevel;
	
	public Student(String name, String address, int phoneNumber, String emailAddress, int gradeLevel)
	{
		super(name, address, phoneNumber, emailAddress);
		this.gradeLevel = gradeLevel;
	}
	
	public String toString()
	{
		return name + ": Student";
	}
}
