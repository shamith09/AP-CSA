
/**
 *
 * @author Shamith Pasula
 * @version 1/30/20
 */
public class Weather
{
    private  String cityName;
    private int[] temps;
    private int numOfTemps;
    private static final int MAX_COUNT = 6;

    /**
     * Constructor for objects of class Weather
     */
    public Weather(String name)
    {
        cityName = name;
        numOfTemps = 0;
        temps = new int[MAX_COUNT];
    }

    public String toString()
    {
        String s = cityName;
        for (int i = 0; i < numOfTemps; i++)
        {
            s += "\n\t";
            s += temps[i];
        }
        return s;
    }
    
    private int findIndexToInsert(int temp)
    {
        if (numOfTemps == 0)
            return 0;
        for (int i  = 0; i < numOfTemps; i++)
        {
            if (temp < temps[i])
                return i;
        }
        return numOfTemps;
    }
    
    public int[] calcMeanAndMedian()
    {
        int mean = 0;
        int median = 0;
        for (int i = 0; i < numOfTemps; i++)
            mean += temps[i];
        mean /= numOfTemps;
        if (numOfTemps % 2 == 1)
            median = temps[numOfTemps / 2];
        else
            median = (temps[numOfTemps / 2] + temps[numOfTemps / 2 - 1]) / 2;
        int[] result = {mean, median};
        return result;
    }
    
    public boolean addTempInOrder(int latestTemp)
    {
        if (numOfTemps >= MAX_COUNT)
            return false;
        int idx = findIndexToInsert(latestTemp);
        for (int i = numOfTemps; i > idx; i--)
        {
            temps[i] = temps[i-1];
        }
        temps[idx] = latestTemp;
        numOfTemps++; // This is the line of code I added this time
        return true;
    }
}


