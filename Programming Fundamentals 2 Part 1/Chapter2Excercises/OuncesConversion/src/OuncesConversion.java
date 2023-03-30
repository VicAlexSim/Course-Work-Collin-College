/*
 * Viotor Sim 1/30/22
 * This program will convert ounces to their conversions
 * JDK 17.0.2
 */


 /*Import libraries*/
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class OuncesConversion {

    public static void main(String[] args) {
// create input dialog
        String ounces = JOptionPane.showInputDialog(null,
                "How many Ounces do you wish to convert?");

// Constants
        final double Eight = 8.0;
        final double SIXTEEN = 16.0;
        final double THIRTY_TWO = 32.0;
        final double ONE_HUNDRED_TWENTY_EIGHT = 128.0;
        
// Parse to input to a double and calculate variables
        double ounce = Double.parseDouble(ounces);
        double cups = ounce / Eight;
        double pint = ounce / SIXTEEN;
        double quart = ounce / THIRTY_TWO;
        double gallon = ounce / ONE_HUNDRED_TWENTY_EIGHT;

// Decimal formatter
        DecimalFormat decimalFormatter = new DecimalFormat("#.##");

//message dialog
        JOptionPane.showMessageDialog(null, "Ounces: " + ounces + "\n"
                + "Cups: " + cups + "\n" + "Pints: " + decimalFormatter.format(pint) + "\n"
                + "Quarts: " + decimalFormatter.format(quart) + "\n" + "Gallon: " + decimalFormatter.format(gallon));
        
        System.exit(0);
    }

}
