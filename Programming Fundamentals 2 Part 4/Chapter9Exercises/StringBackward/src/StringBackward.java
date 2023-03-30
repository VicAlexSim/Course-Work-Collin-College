
/**
 * Victor Sim
 * 4/18/22
 * JDK 17.0.2
 * This program will print a string backwards
 */

import java.util.Scanner;

public class StringBackward {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The String: ");
        String str = input.nextLine();
        //Call to printBackwards method
        printBackwards(str);
    }

    //String argument passed to parameter and prints it in reverse order
    private static void printBackwards(String str) {
        // looping from end of the string
        // and printing char by char
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println("");
    }
}
