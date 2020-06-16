/**
 * Write a description of class Person here.
 *
 * @author Bhavya Gupta
 * @version 1/15/20
 */

import java.util.ArrayList;

public class Person
{
    private String ownName;
    private int ownAge;
    private ArrayList<String> friendsNames;
    
    public Person(String givenName, int givenAge)
    {
        ownAge = givenAge;
        ownName = givenName;
        friendsNames = new ArrayList<String>();
    }
    public String getOwnName()
    {
        return ownName;
    }
    public int getOwnAge()
    {
        return ownAge;
    }
    public int getFriendCount()
    {
        return friendsNames.size();
    }
    public String getAllFriendsNames()
    {
        String str = "";
        for (int i = 0; i < friendsNames.size(); i++)
            str += friendsNames.get(i) + ", ";
        if (str.length() >= 2)
            str = str.substring(0, str.length() - 2);
        return str;
    }
    public String get1FriendsName(int index)
    {
        return friendsNames.get(index);
    }
    public void setOwnAge(int givenAge)
    {
        ownAge = givenAge;
    }
    public void addFriend(Person aFriend)
    {
        friendsNames.add(aFriend.getOwnName());
    }
    public int indexOfLongestName()
    {
        int longest = 0;
        int index = -1;
        for (int i = 0; i < friendsNames.size(); i++)
        {
            if (friendsNames.get(i).length() > index)
            {
                index = i;
                longest = friendsNames.get(i).length();
            }
        }
        return index;
    }
}