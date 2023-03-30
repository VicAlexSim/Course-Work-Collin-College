/**
 * Victor Sim
 * 7/6/22
 * JDK 17.0.2
 * 1st Exception Class
 */
//Package statement
package payrolldemo;

//Exception Class Definition
public class InvalidNameException extends Exception {

    InvalidNameException(String errorMessage) {
        //Call to Exception Super Class Constructor
        super(errorMessage);
    }
}
