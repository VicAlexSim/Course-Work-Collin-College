/**
 * Victor Sim
 * 7/13/22
 * JDK 17.0.2
 * Main/Driver Class
 */
//Package statement
package palindromedetector;

/**
 * Chapter 16 Programming Challenge 5, Palindrome Detector
 */
public class PalindromeDetector {

    public static void main(String[] args) {
        // Create an array of strings to test.
        String[] testStrings = {"I did did I",
            "Fortune Favors the Bold",
            "That’s one small step for a man, one giant leap for mankind",
            "No devil lived on",
            "E = MC^2",
            "Racecar",
            "Rotator",
            "Level",
            "I have a dream",
            "Pokemon, Gotta Catch Them All"};

        // Test the strings.
        for (int i = 0; i < testStrings.length; i++) {
            System.out.print("\"" + testStrings[i] + "\"");
            if (isPalindrome(testStrings[i].toUpperCase())) {
                System.out.println(" is a palindrome.");
            } else {
                System.out.println(" is not a palindrome.");
            }
        }
    }

    /**
     * The isPalindrome method determines whether a string is a palindrome.
     *
     * @param str The string to test.
     * @return This method returns true if str contains a palindrome. It returns
     * false otherwise.
     */
    public static boolean isPalindrome(String str) {
        boolean status = false;

        if (str.length() <= 1) {
            status = true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            status = isPalindrome(str.substring(1, str.length() - 1));
        }

        return status;
    }
}
