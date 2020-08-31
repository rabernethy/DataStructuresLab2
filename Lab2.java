/* 
Data Structures - 2168 001
Author Russell Abernethy
Date: 8/30/2020
Program: Lab2 - List of Functions
Desc: See methods
*/

import java.util.ArrayList;
import java.util.List;

public class Lab2 {
    public static void main(String[] args) {
    // Test Cases:
    // unique()
        // Integers:
        List<Integer> list1a = new ArrayList<>();
        list1a.add(1);
        list1a.add(2);
        System.out.println(unique(list1a) + " <-- should be true.");
        list1a.add(1);
        System.out.println(unique(list1a) + " <-- should be false.");
        // Strings:
        List<String> list1b = new ArrayList<>();
        list1b.add("Hello");
        list1b.add("World!");
        System.out.println(unique(list1b) + " <-- should be true.");
        list1b.add("Hello");
        System.out.println(unique(list1b) + " <-- should be false.");
        //Empty List:
        List<Integer> list1c = new ArrayList<>();
        System.out.println(unique(list1c) + " <-- should be true.");


    // allMultiples()
        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(6);
        list2.add(2);
        list2.add(9);
        list2.add(15);
        list2.add(18);
        System.out.println(allMultiples(list2, 3));
    // allStringsOfSize()
        List<String> list3 = new ArrayList<>();
        int len = 4;
        list3.add("hello");
        list3.add("how");
        list3.add("are");
        list3.add("doing");
        list3.add("today");
        list3.add("this");
        list3.add("is");
        list3.add("a");
        list3.add("test");
        System.out.println(allStringsOfSize(list3, len));

    // isPermutaion()
        List<String> list4 = new ArrayList<>();
        List<String> list5 = new ArrayList<>();
        list4.add("hello");
        list4.add("world");
        list4.add("neat!");
        list4.add("hello");
        list5.add("hello");
        list5.add("neat!");
        list5.add("hello");
        System.out.println(isPermutaion(list4, list5) + " <-- should be false");
        list5.add("world");
        System.out.println(isPermutaion(list5, list4) + " <-- should be true");
        System.out.println(isPermutaion(list4, list5) + " <-- should be true");

    // stringToListOfWords()
        String testString = "Hello, world! What is going on with Palistine anyway?";
        System.out.println(stringToListOfWords(testString));

        testString = "";
        System.out.println(stringToListOfWords(testString));

    // removeAllInstances()
        List<Integer> list6 = new ArrayList<>();
        list6.add(1);
        list6.add(4);
        list6.add(5);
        list6.add(6);
        list6.add(5);
        list6.add(5);
        list6.add(2);
    
        System.out.println("Before: " + list6);
        removeAllInstances(list6, 5);
        System.out.println("After: " + list6);

        List<String> list7 = new ArrayList<>();
        list7.add("Hello");
        list7.add("World");
        list7.add("How");
        list7.add("Hello");
        list7.add("are");
        System.out.println("Before: " + list7);
        removeAllInstances(list7, "Hello");
        System.out.println("After: " + list7);
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
                if(currentE.equals(list.get(j))) 
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
        // only start the loop if curString is not empty.
        while(curString.length() > 0) {
            // add the substring from the begining to the space.
            output.add(curString.substring(0, curString.indexOf(' ')));
            // change curString to curString - what was already added to the output.
            curString = curString.substring(curString.indexOf(' ' ) + 1);
            // if there are no more spaces, add everything left to the output list.
            if(!curString.contains(" ")) {
                output.add(curString);
                break;
            }
        }
        // remove extraneous characters from the end of strings
        for(int i = 0; i < output.size(); i++) {
            //check last character for punctuation and other special characters
            //note: not all special characters are looked for.
            if(output.get(i).endsWith(".") || output.get(i).endsWith("!") || output.get(i).endsWith("?")|| output.get(i).endsWith(":")|| output.get(i).endsWith(";")|| output.get(i).endsWith(",")|| output.get(i).endsWith("@")|| output.get(i).endsWith("#")|| output.get(i).endsWith("$")|| output.get(i).endsWith("%")|| output.get(i).endsWith("^")|| output.get(i).endsWith("&")|| output.get(i).endsWith("*")) {
                // replace the current element, with the same element without punctuation
                // or special characters at the end.
                output.set(i, output.get(i).substring(0, output.get(i).length() - 1));
            }
        }
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