/**
 * Victor Sim
 * 7/6/22
 * JDK 17.0.2
 * 4th Exception Class
 */
//Package statement
package payrolldemo;

//Exception Class Definition
public class InvalidHourlyRateException extends Exception {

    InvalidHourlyRateException(String errorMessage) {
        //Call to Exception Super Class Constructor
        super(errorMessage);
    }
}
