/**
 * Victor Sim
 * 7/6/22
 * JDK 17.0.2
 * 3rd Exception Class
 */
//Package statement
package payrolldemo;

//Exception Class Definition
public class InvalidHoursException extends Exception {

    InvalidHoursException(String errorMessage) {
        //Call to Exception Super Class Constructor
        super(errorMessage);
    }
}
