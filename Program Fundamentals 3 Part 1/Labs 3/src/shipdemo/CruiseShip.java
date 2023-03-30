/**
 * Victor Sim
 * 6/29/22
 * JDK 17.0.2
 * Subclass #1
 */
//Package statement
package shipdemo;

public class CruiseShip extends Ship {

//Field/Attribute
    private int passengers;

//Constructor that initialize the name, year built and maximum passengers
    public CruiseShip(String name, String year, int pass) {
        super(name, year);
        passengers = pass;
    }

//Setter for the maximum number of passengers
    public void setPassengers(int pass) {
        passengers = pass;
    }

//Getter for the maximum number of passengers
    public int getPassengers() {
        return passengers;
    }

//toString for the representation of name and maximum number of passengers
    @Override
    public String toString() {
        return ("\nShip information: " + "\nName: " + this.getName() + "\nYear Built: " + this.getYearBuilt() + "\nMaximum passengers: " + passengers);
    }

    @Override
    public void display() {
        System.out.println("Ship information: ");
        System.out.println("Name = " + this.getName());
        System.out.println("Year = " + this.getYearBuilt());
        System.out.println("Passengers = " + this.getPassengers());
    }
}    


//end of CruiseShip.java
