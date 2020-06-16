
public abstract class Person {
	
	protected String name;
	private String address;
	private int phoneNumber;
	private String emailAddress;
	
	public Person(String name, String address, int phoneNumber, String emailAddress)
	{
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public String toString()
	{
		return name + ": Person";
	}
}