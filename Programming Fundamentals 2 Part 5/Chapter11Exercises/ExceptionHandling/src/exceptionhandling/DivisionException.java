/**
 * Victor Sim
 * 5/9/22
 * JDK 17.0.2
 * This program will be the exception class that has a constructor that prints
 * an output prompt
 */

//Package Statement
package exceptionhandling;

//DivisonException Class
public class DivisionException extends Exception {

    //No argument constructor
    public DivisionException() {
        super("Error: you cannot divide by zero");
    }
}