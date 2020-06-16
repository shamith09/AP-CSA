import java.util.Scanner;
import java.io.File;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
 
  
  private static final String SPACE = " ";
  
  static{
    try {
      System.out.println("Reading cleanSentiment.csv");
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
  
  
  //read in the positive adjectives in postiveAdjectives.txt
     try {
      /*Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        posAdjectives.add(temp);
      }
      input.close();*/
      for (String word : sentiment.keySet())
      {
          if (sentimentVal(word) < 0)
            negAdjectives.add(word);
          else
            posAdjectives.add(word);
      }
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
 /*
  //read in the negative adjectives in negativeAdjectives.txt
     try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
    */
  }

  /** 
   * returns a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  public static double totalSentimentVal(String fileName)
  {
      String text = textToString(fileName);
      double total = 0;
      int end = 0;
      int start = 0;
      for (int i = 0; i < text.length(); i++)
      {
          //String letter = Character.toString(text.charAt(i));
          if (Character.isLetter(text.charAt(i)))
          {
              if (end == 0 && i != 0)
              {
                start = i;
                end = start-1;
              }
              end++;
          }
          else if (!Character.isLetter(text.charAt(i)) || end == text.length()-1)
          {
              if ((start == 0 && i == 0) || start != 0)
                  total += sentimentVal(text.substring(start, end+1));
              end = 0;
              start = 0;
          }
      } 
      return total;
  }
  public static int starRating(String fileName)
    {
    double totalSentiment = totalSentimentVal(fileName);
    int stars = 0;
     if (totalSentiment >= 15)
        stars = 5;
     if(totalSentiment < 15)
     {
         stars = 4;
     }
     if(totalSentiment < 10)
     {
         stars = 3;
     }
     if(totalSentiment < 5)
     {
         stars = 2;
     }
     if(totalSentiment < 0)
     {
         stars = 1;
     }
     return stars;
    } 
  public static String fakeReview(String fileName)
  {
      String text = textToString(fileName);
      String result = "";
      for (int i = 0; i < text.length(); i++)
      {
          if (text.charAt(i) == '*')
          {
              int start = i+1;
              int end = start;
              for (int j = start; j < text.length(); j++)
              {
                  if (Character.isLetter(text.charAt(j)))
                      end++;
                  else
                      break;
              }
              String word = text.substring(start, end+1);
              if (sentimentVal(word) < 0)
                  result += randomPositiveAdj() + SPACE;
              else 
                  result += randomNegativeAdj() + SPACE;
              i = end;
          }
          else
          {
              result += text.charAt(i);
          }
      }
      return result;
  }
  public static String fakeReview2(String fileName)
  {
	  String text = textToString(fileName);
	  for (int i = 0; i < text.length(); i++)
      {
          if (text.charAt(i) == '*')
          {
              int start = i+1;
              int end = start;
              for (int j = start; j < text.length(); j++)
              {
                  if (Character.isLetter(text.charAt(j)))
                      end++;
                  else
                      break;
              }
              String word = text.substring(start, end+1);
              if (sentimentVal(word) < 0)
                  result += randomPositiveAdj() + SPACE;
              else 
                  result += randomNegativeAdj() + SPACE;
              i = end;
          }
          else
          {
              result += text.charAt(i);
          }
      }
      return result;
	  
  }
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
    /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }
}