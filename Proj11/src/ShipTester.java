
public class ShipTester {

	public static void main(String[] args)
	{
		Ship ship = new Ship("Ship", 2020);
		CruiseShip cruiseShip = new CruiseShip("CruiseShip", 2020, 100);
		CargoShip cargoShip = new CargoShip("CargoShip", 2020, 1000);
		
		System.out.println(ship);
		System.out.println(cruiseShip);
		System.out.println(cargoShip);
	}
	
}
