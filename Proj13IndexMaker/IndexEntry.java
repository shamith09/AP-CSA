import java.util.ArrayList;

public class IndexEntry {
	private String word;
	private ArrayList<Integer> numList;
	
	public IndexEntry(String word)
	{
		this.word = word.toUpperCase();
		numList = new ArrayList<Integer>();
	}
	
	public void add(int num)
	{
		if (!numList.contains(new Integer(num)))
			numList.add(num);
	}
	public String getWord()
	{
		return word;
	}
	public String toString()
	{
		String numStr = "";
		for (int i = 0; i < numList.size() - 1; i++)
		{
			numStr += numList.get(i) + ", ";
		}
		return word + " " + numStr + numList.get(numList.size()-1);
	}
}
