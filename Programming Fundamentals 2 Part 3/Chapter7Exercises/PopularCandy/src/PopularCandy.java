
//Import Library
import javax.swing.JOptionPane;

//Main class
public class PopularCandy {

    //Main method
    public static void main(String[] args) {
        //Declaring variables
        int total = 0;
        int minIndex;
        int maxIndex;

        //Creating and initializing a String array
        String candyNames[] = {"Sour Patch Kids", "Swedish Fish", "Starburst", "Skittles"};

        //Creating an integer type array
        int numberOfCandyBoxesSold[] = new int[candyNames.length];

        /* Getting the inputs entered by the user
         * and populate those values into array
         * via JOptionPane then parsing
         */
        for (int i = 0; i < numberOfCandyBoxesSold.length; i++) {
            int numberOfBoxes = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Enter the number of boxes of " 
                    + candyNames[i]));
            //Error Checking numberOfBoxes
            if (numberOfBoxes > 0) {
                // When numberOfBoxes is positive then store in the array
                numberOfCandyBoxesSold[i] = numberOfBoxes;
            } else {
                // When numberOfBoxes is negative then
                JOptionPane.showMessageDialog(null, "Number of candy boxes sold should be positive");
                i--;// Decrement index so that it loops until positive value is inputted
            }
        }
        //Initializing variables
        maxIndex = 0;
        minIndex = 0;
        //Loop to add for total Candy boxes Sold and find highest and lowest sales
        for (int i = 0; i < numberOfCandyBoxesSold.length; i++) {
            total += numberOfCandyBoxesSold[i];
            if (numberOfCandyBoxesSold[minIndex] > numberOfCandyBoxesSold[i]) {
                minIndex = i;
            }
            if (numberOfCandyBoxesSold[maxIndex] < numberOfCandyBoxesSold[i]) {
                maxIndex = i;
            }
        }
        //Display Output via JOptionPane
        JOptionPane.showMessageDialog(null,
                "Total boxes of candy sold: " + total + "\nHighest selling candy: " 
                + candyNames[maxIndex] + "\nLowest selling candy: " 
                + candyNames[minIndex]);
    }
}
