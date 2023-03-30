/**
 * Victor Sim
 * 7/6/22
 * JDK 17.0.2
 * 2nd Exception Class
 */
//Package statement
package payrolldemo;

//Exception Class Definition
public class InvalidIDException extends Exception {

    InvalidIDException(String errorMessage) {
        //Call to Exception Super Class Constructor
        super(errorMessage);
    }
}
