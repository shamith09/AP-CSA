
public class Dog extends Pet{

	public Dog(int dogID, String dogName) {
		super(dogID, dogName);
	}

	public void makeNoise()
	{
		System.out.println("Woof");
	}
}
