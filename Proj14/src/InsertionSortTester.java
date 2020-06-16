public class InsertionSortTester
{
    public static void main (String[] args)
    {
        // Generate an array of random integers
        int count = 8, low = 11, high = 99;
        int[] scores = new int[count];
        System.out.println("COUNT = " + count + " , between " + low + " & " + high);       
        for (int i = 0; i < count; i++)
        {
            scores[i] = (int) (Math.random() * (high-low+1)) + low;
            System.out.print(scores[i] + " ");
        }
        
        // Do insertion sort to sort "scores", with "count" elements
        for (int i = 1; i < scores.length; i++)
        {
        	for (int j = 0; j < i; j++)
        	{
        		if (scores[j] > scores[i])
        		{
        			int temp = scores[j];
        			scores[j] = scores[i];
        			scores[i] = temp;
        		}
        	}
        }

        
        // Print resulting array

    	System.out.println();
        for (int i = 0; i < count; i++)
            System.out.print(scores[i] + " ");
        
        
    }
}