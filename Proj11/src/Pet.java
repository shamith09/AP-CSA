
public abstract class Pet {
	
	private static int lastPetID;
	private int petID;
	private String petName;
	
	public Pet(int petID, String petName)
	{
		this.petID = petID;
		this.petName = petName;
	}
	
	public String getPetName()
	{
		return petName;
	}
	public abstract void makeNoise();
}
