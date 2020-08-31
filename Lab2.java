/* 
Data Structures - 2168 005
Author Russell Abernethy
Date: _____
Program: Lab2 - List of Functions
Desc: See methods
*/

import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
        
    }

    public static <E> boolean unique(List<E> list) {
        /* 
        Returns true if all the items in the List are unique
            All the items are unique if none of them are the same.
        Return false otherwise.
        */




        return false;
    }


    public static ArrayList<Integer> allMultiples() {
        /*
        Takes in a List of integers and an int.
        Returns a new List of integers which contains all of the numbers from the input 
        list which are multiples of the given int.
            For example,if the List is [1,25,2,5,30,19,57,2,25] and 5 was provided, 
            the new list should contain [25,5,30,25].
        */


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
    



    }


    public static <E> boolean isPermutaion(List<E> listA, List<E> listB) {
        /*
        Takes in two List objects which contain the same types.
        Returns true if the Lists are permutations of each other and false if not.
            Two lists are permutations if they contain the same elements, including the same number of 
            duplicates, but they don’t have to contain the elements in the same order.
                For example, [1,2, 4] and [2,1,4] are permutations of each other.
        */

        return false;
    }


    public static List<String> stringToListOfWords(String string) {
        /*
        Takes in a String and converts it into a list of words.
            We assumes that each word in the input string is separated by whitespace.
                If our input String is "Hello, world!", then the output should be ["Hello,","world!"].
        This method returns List<String>.

        For extra credit:
            Sanitize the String, cleaning it up so that we re-move the punctuation and other extraneous 
            characters such that the output in the above example would become["Hello", "world"]
        */


    }


    public static <E> void removeAllInstances(List<E> list, E item) {
        /*
        Takes in a List and item.
        The method then proceeds to remove each item in the list that matches the given item.
            For example, if the method is passed the List<Integer> [1, 4, 5, 6,5, 5, 2] and the Integer 5,
            the method removes all 5’s from the List. The List then becomes [1, 4, 6, 2].
        It should return nothing.
        */


    }
    
}