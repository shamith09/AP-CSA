
public class CruiseShip extends Ship {
	
	// Maximum number of passengers
	private int capacity;
	
	public CruiseShip(String name, int yearBuilt, int capacity)
	{
		super(name, yearBuilt);
		this.capacity = capacity;
	}
	
	public String toString()
	{
		return getName() + ", cruise ship, capacity (passengers): " + capacity;
	}
	public int getCapacity()
	{
		return capacity;
	}
	
}
