
public class CargoShip extends Ship {
	
	// Cargo capacity
	private int capacity;
	
	public CargoShip(String name, int yearBuilt, int capacity)
	{
		super(name, yearBuilt);
		this.capacity = capacity;
	}
	
	public String toString()
	{
		return getName() + ", cargo ship, capacity (tonnes): " + capacity;
	}
	public int getCapacity()
	{
		return capacity;
	}
	
}
