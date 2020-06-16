public class SelectionSortTester
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
        int[] scores2 = new int[scores.length];
        for (int i = 0; i < scores.length; i++)
        	scores2[i] = scores[i];
        System.out.println();
        
        // Do selection sort to sort "scores", with "count" elements (increasing)
        //... YOUR CODE HERE
        for (int i = 0; i < scores.length; i++)
        {
        	int mindex = i;
        	for (int j = i + 1; j < scores.length; j++)
        		if (scores[j] < scores[mindex])
        			mindex = j;
        	int temp = scores[mindex];
        	scores[mindex] = scores[i];
        	scores[i] = temp;
        }
        
        // Print resulting array
        //... YOUR CODE HERE
        for (int i = 0; i < count; i++)
            System.out.print(scores[i] + " ");
        System.out.println();

        
        // decreasing
        for (int i = 0; i < scores2.length; i++)
        {
        	int maxdex = i;
        	for (int j = i + 1; j < scores2.length; j++)
        		if (scores2[j] > scores2[maxdex])
        			maxdex = j;
        	int temp = scores2[maxdex];
        	scores2[maxdex] = scores2[i];
        	scores2[i] = temp;
        }
        
        // Print resulting array
        //... YOUR CODE HERE
        for (int i = 0; i < count; i++)
            System.out.print(scores2[i] + " ");
        
    }
}