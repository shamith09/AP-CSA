import java.awt.Color;

public class RowdyBird extends Bird{

	public RowdyBird(int birdID, String birdName, String shapeDescr, Color cageColor)
	{
		super(birdID, birdName, shapeDescr, cageColor);
	}
	public void makeNoise()
	{
		System.out.print("Tweeeeeeet!!! ");
		super.makeNoise();
	}
}
