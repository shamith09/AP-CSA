import java.util.ArrayList;

public class Staff extends Employee {
	
	private String title;
	
	public Staff(String name, String address, int phoneNumber, String emailAddress,
			int roomNumber, double salary, int yearHired, String title)
	{
		super(name, address, phoneNumber, emailAddress, roomNumber, salary, yearHired);
		this.title = title;
	}

	public String toString()
	{
		return name + ": Staff";
	}
}
