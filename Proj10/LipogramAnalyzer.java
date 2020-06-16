/**
 * 
 */

/**
 * @author Bhavya Gupta
 * @version 12-05-2019
 */

public class LipogramAnalyzer
{
    private String text;

    public LipogramAnalyzer(String txt)
    {
        text = txt;
    }

    public String mark(char c)
    {
        String result = "";
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == c)
                result += '#';
            else
                result += text.charAt(i);
        }
        return result;
    }
    
    public String allWordsWith(char c)
    {
        String result = "";
        for (int i = 0; i < text.length(); i++)
        {
            if (text.charAt(i) == c && !result.contains(getWord(i)))
            {
                result += getWord(i) + "\n";
            }
        }
        return result;
    }
    
    private String getWord(int index)
    {
        int start = 0;
        int end = 0;
        for (int i = index; i < text.length(); i++)
        {
            if (i == text.length())
            {
                end = text.length();
                break;
            }
            if (!Character.isLetterOrDigit(text.charAt(i)))
            {
                end = i;
                break;
            }
        }
        for (int i = index; i >= -1; i--)
        {
        if (i == -1)
            {
                start = 0;
                break;
            }
            else if (!Character.isLetterOrDigit(text.charAt(i)))
            {
                start = i + 1;
                break;
            }
        }
        return text.substring(start, end);
    }
}

