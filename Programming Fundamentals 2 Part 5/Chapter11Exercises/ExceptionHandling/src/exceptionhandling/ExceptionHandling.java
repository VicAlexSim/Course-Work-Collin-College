/**
 * Victor Sim
 * 5/9/22
 * JDK 17.0.2
 * This program will be the driver/main function/method to do a basic division
 * calculation that handles exceptions and prints the result.
 */
//Package Statement
package exceptionhandling;

//Import for Scanner Class
import java.util.Scanner;

//Main class
public class ExceptionHandling {

    //divide Method in the classs with my main method
    public static double divide(double numerator, double denominator) throws DivisionException {
        //If statement jointly handles the exception with main
        if (denominator == 0) {
            //calls the DivisionExcepion class basically
            throw new DivisionException();
        }
        return (numerator / denominator);
    }
    
    //Main Method
    public static void main(String[] args) {
        
        //Scanner object made for input
        Scanner in = new Scanner(System.in);
        //Input Prompt
        System.out.print("Enter numerator: ");
        //Field Reference to Scanner Object
        double numerator = in.nextDouble();
        //Input prompt 2
        System.out.print("Enter denominator: ");
        //Field Reference to Scanner Object 2
        double denominator = in.nextDouble();
        //try & catch statement
        try {
            double result = divide(numerator, denominator);
            System.out.println("Result of dividing these two numbers is " + result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }
    }
}
