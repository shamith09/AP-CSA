
public class Employee extends Person {
	
	private int roomNumber;
	private double salary;
	private int yearHired;
	
	public Employee(String name, String address, int phoneNumber, String emailAddress,
					int roomNumber, double salary, int yearHired)
	{
		super(name, address, phoneNumber, emailAddress);
		this.roomNumber = roomNumber;
		this.salary = salary;
		this.yearHired = yearHired;
	}
	
	public String toString()
	{
		return name + ": Employee";
	}
}
