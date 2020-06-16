
public class Ship {
	
	private String name;
	private int yearBuilt;
	
	public Ship(String name, int yearBuilt)
	{
		this.name = name;
		this.yearBuilt = yearBuilt;
	}
	
	public String getName()
	{
		return name;
	}
	public int getYearBuilt()
	{
		return yearBuilt;
	}
	public String toString()
	{
		return name + ", ship, built in " + yearBuilt;
	}
	
}
