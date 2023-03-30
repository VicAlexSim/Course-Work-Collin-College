/**
 * Victor Sim
 * 7/20/22
 * JDK 17.0.2
 * Driver Class
 */
//Package statement
package binarysearchtest;

//Import statement
import java.util.Scanner;

//Class definition
public class BinarySearchTest {

    public static void main(String[] args) {

//Create an array of user inputted strings
        System.out.println("How many strings to input?");
        Scanner kb = new Scanner(System.in);
        int arrayLength = kb.nextInt();
        Comparable[] array = new String[arrayLength];
        String target;
//Input each string into the array
        System.out.println("Enter " + arrayLength + " strings of the array (original order):");
        for(int i = 0; i < array.length; i++) {
            array[i] = kb.next();
        }

//Quicksort the array in ascending order using ObjectQuickSorter
        new ObjectQuickSorter(array).quickSort();

//Output to console the Quicksorted array in ascending order
        System.out.println("QuickSorted order for the array:");

        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//Input the string to search(without whitespace)
        System.out.print("Enter the string to binary search: ");
        target = kb.next();

//Binarysearch for user inputted string using ObjectBinarySearcher
        ObjectBinarySearcher bSearch = new ObjectBinarySearcher(array, array.length);
        int index = bSearch.searchElement(target);

//Output to console the result based on method result
        if (index == -1) {
            System.out.println(target + " not found in array");
        } else {
            System.out.println(target + " found in array at index " + index);
        }

    }

}
