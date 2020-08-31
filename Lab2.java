/* 
Data Structures - 2168 001
Author Russell Abernethy
Date: 8/30/2020
Program: Lab2 - List of Functions
Desc: See methods
*/

import java.sql.Struct;
import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {

    // unique()
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        System.out.println(unique(list1) + " <-- should be true.");
        list1.add(1);
        System.out.println(unique(list1) + " <-- should be false.");
        
    // allMultiples()


    // allStringsOfSize()


    // isPermutaion()


    // stringToListOfWords()


    // removeAllInstances()


    }

    public static <E> boolean unique(List<E> list) {
        /* 
        Returns true if all the items in the List are unique
            All the items are unique if none of them are the same.
        Return false otherwise.
        */
        for(int i = 0; i < list.size() - 1; i++) {
            // for each element in the list, compare it to every element after it.
            E currentE = list.get(i);
            for(int j = i+1; j < list.size(); j++) {
                // if the current element matches, return false.
                if(currentE == list.get(j)) 
                    return false;
            }
        }
        return true;
    }


    public static List<Integer> allMultiples(List<Integer> list, int multiple) {
        /*
        Takes in a List of integers and an int.
        Returns a new List of integers which contains all of the numbers from the input 
        list which are multiples of the given int.
            For example,if the List is [1,25,2,5,30,19,57,2,25] and 5 was provided, 
            the new list should contain [25,5,30,25].
        */
        List<Integer> output = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % multiple == 0)
                output.add(list.get(i));
        }
        return output;
    }


    public static List<String> allStringsOfSize(List<String> list, int length) {
        /*
        Takes in a List<String> and  an int length.
        Returns a new List<String> which contains all the Strings from the original 
        list that are length characters long.
            For example, if the inputs are:
            ["I", "like", "to", "eat", "eat", "eat","apples", "and", "bananas"] and 3,
            The new list is: ["eat", "eat", "eat","and"].
        */
        List<String> output = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).length() == length)
                output.add(list.get(i));
        }
        return output;
    }


    public static <E> boolean isPermutaion(List<E> listA, List<E> listB) {
        /*
        Takes in two List objects which contain the same types.
        Returns true if the Lists are permutations of each other and false if not.
            Two lists are permutations if they contain the same elements, including the same number of 
            duplicates, but they don’t have to contain the elements in the same order.
                For example, [1,2, 4] and [2,1,4] are permutations of each other.
        */
        // check that there are the same number of elements in each list
        if(listA.size() != listB.size())
            return false;
        for(int i = 0; i <listA.size(); i++) {
            // for every element in listA, check that the same number of that elment exists in both lists.
            int countA = 0, countB = 0;
            for(int j = 0; j < listA.size(); j++) {
                // if the element at i in listA is the same as the element at j in either list, increment
                // the corosponding list appropreatly.
                if(listA.get(i) == listA.get(j))
                    countA++;
                if(listA.get(i) == listB.get(j))
                    countB++;
            }
            // if there aren't the same number of occurances of the number of elements in each list,
            // return false.
            if (countA != countB) 
                return false;
        }
        return true;
    }


    public static List<String> stringToListOfWords(String string) {
        /*
        Takes in a String.
        Converts it into a list of words.
            We assumes that each word in the input string is separated by whitespace.
                If our input String is "Hello, world!", then the output should be ["Hello,","world!"].
        This method returns List<String>.

        For extra credit:
            Sanitize the String, cleaning it up so that we re-move the punctuation and other extraneous 
            characters such that the output in the above example would become["Hello", "world"]
        */
        List<String> output = new ArrayList<>();
        String curString = string;
        while(true) {
            // add the substring from the begining to the space.
            output.add(curString.substring(0, curString.indexOf(' ')));
            // change curString to curString - what was already added to the output.
            curString = curString.substring(curString.indexOf(' '));
            // if there are no more spaces, add everything left to the output list.
            if(!curString.contains(" ")) {
                output.add(curString);
                break;
            }
        }
        // sanatize output
            //todo
        return output;
    }


    public static <E> void removeAllInstances(List<E> list, E item) {
        /*
        Takes in a List and item.
        The method then proceeds to remove each item in the list that matches the given item.
            For example, if the method is passed the List<Integer> [1, 4, 5, 6, 5, 5, 2] and the Integer 5,
            the method removes all 5’s from the List. The List then becomes [1, 4, 6, 2].
        It should return nothing.
        */
        // go through every element in the list and compare it to the item being looked for.
        for(int i = 0; i < list.size(); i++) {
            // if the item matches the element, remove it and decrement i by 1, otherwise a 
            // comparison would be missed.
            if(item == list.get(i)) {
                list.remove(i);
                i--;
            }
        }

    }
    
}