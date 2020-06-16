import java.awt.Color;

public class Bird extends Pet{

	private Cage bCage;
	
	public Bird(int birdID, String birdName, String shapeDescr, Color cageColor)
	{
		super(birdID, birdName);
		bCage = new Cage(shapeDescr, cageColor);
	}
	
	public void makeNoise()
	{
		System.out.println("Tweet");
	}
}
