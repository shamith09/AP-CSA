/**

 * Write a description of class PersonTesterQ here.

 *

 * @author Anh Nguyen

 * @version v. 07

 */

public class PersonQQA2nd

{   

    public static void main(String[] args)

    {

        String[] nameArr = {"Raj", "Shinika", "Armin", "Walter", "Aarushi", "Reeya", "Bhavya", "Parth", "Vasu", "Derek", "Ramyasree", "Agrim", "Sishir", "Ibrahim Muhammad", "Anthony", "Royce", "Jennifer", "Anshul", "Pevneet", "Spruha", "Shamith", "Nihal", "Vasanth", "Joel", "Divyansh", "Aryan", "Ryan", "Zeeshawn", "Sanjana", "Matt", "Charles"};

       

        int count = nameArr.length;

        int prtCt = count/6;

        int mxFrCt = (int) (Math.random() * prtCt * 2) + prtCt * 2;

       

        int selfAge = 15;

       

        int selfIndex = (int) (Math.random() * count);

        Person selfPerson = new Person(nameArr[selfIndex], selfAge);

        System.out.println("I am " + selfPerson.getOwnName() + ", " + selfPerson.getOwnAge() + " years old.");

       

        System.out.println("\nI have no friends yet." );

        String names = selfPerson.getAllFriendsNames();

        if (names.length() > 0) {

            System.out.println("... BUT THERE ARE NAMES: " + names +"!");

        }

       

 

        System.out.println("\nI am trying to friend with ..." );

       

        int rIndex;

       

        for (int i = 0; i < mxFrCt; i++)

        {

            do rIndex = (int) (Math.random() * count);

                while (rIndex == selfIndex);

            Person aFriend = new Person(nameArr[rIndex], 15);

            selfPerson.addFriend(aFriend);

            System.out.println(i+1 + "..." + aFriend.getOwnName());

        }

       

        if (mxFrCt != selfPerson.getFriendCount())

        {

            System.out.println("\nI tried to add " + mxFrCt +

                               " friends; my list has " + selfPerson.getFriendCount() + "(because duplicates were not added).");

        }

      

       System.out.println("\nBased on method 'getAllFriendsNames', my " + selfPerson.getFriendCount() + " friends are "

                          + selfPerson.getAllFriendsNames() + ".");

       System.out.println("\nBased on the list, my friends are ... ");

       for (int i = 0; i < selfPerson.getFriendCount(); i++)

        {

            System.out.println(i + 1 + ": " + selfPerson.get1FriendsName(i));

        }

 

        System.out.println("\nThe longest name is "

            + selfPerson.get1FriendsName(selfPerson.indexOfLongestName()) + ".");

            

       System.out.println();

       selfPerson.setOwnAge(selfAge+1);

       if (selfPerson.getOwnAge() != selfAge+1)

         System.out.println("The was something wrong with my birthday!");

       else

          System.out.println("I just had a birthday. My age is " + selfPerson.getOwnAge() + " now.");       

    }

}