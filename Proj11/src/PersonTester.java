import java.util.ArrayList;

public class PersonTester {
	
	public static void main(String[] args)
	{
		ArrayList<Person> personList = new ArrayList<Person>();
		
		personList.add(new Student("1", "2", 3, "4", 5));
		personList.add(new Employee("2", "2", 3, "4", 5, 6, 7));
		ArrayList<String> subjects = new ArrayList<String>();
		personList.add(new Faculty("3", "2", 3, "4", 5, 6, 7, subjects));
		personList.add(new Staff("4", "2", 3, "4", 5, 6, 7, "8"));
		
		for (Person person : personList)
			System.out.println(person);
	}
}
