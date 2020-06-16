import java.util.ArrayList;

public class Faculty extends Employee {
	
	private ArrayList<String> subjects;
	
	public Faculty(String name, String address, int phoneNumber, String emailAddress,
			int roomNumber, double salary, int yearHired, ArrayList<String> subjects)
	{
		super(name, address, phoneNumber, emailAddress, roomNumber, salary, yearHired);
		this.subjects = subjects;
	}
	
	public String toString()
	{
		return name + ": Faculty";
	}
}
