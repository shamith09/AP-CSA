import java.util.ArrayList;
import java.awt.Color;

public class HouseOfPets {

	public static void main(String[] args) {
		ArrayList<Pet> petList = new ArrayList<Pet>();
		petList.add(new Dog(1, "Dog"));
		petList.add(new Cat(2, "Cat"));
		petList.add(new Bird(3, "Bird", "Cage", Color.BLUE));
		petList.add(new RowdyBird(4, "RowdyBird", "Cage2", Color.RED));
		
		for (Pet pet : petList)
			pet.makeNoise();
	}
}
