/**
 * Victor Sim
 * 6/29/22
 * JDK 17.0.2
 * Super Class
 */
//Package statement
package shipdemo;

//Class Declaration
public class Ship implements Displayable {

//Fields/Attributes
    private String name;
    private String yearBuilt;

//Constructor to initialize name and yearBuilt
    public Ship(String n, String year) {
        name = n;
        yearBuilt = year;
    }

//Setter for the name of ship
    public void setName(String n) {
        name = n;
    }

//Setter for the year built for the ship
    public void setYearBuilt(String year) {
        yearBuilt = year;
    }

//Getter for the name of the ship
    public String getName() {
        return name;
    }

//Getter for the year built for the ship
    public String getYearBuilt() {
        return yearBuilt;
    }

//toString for the representation of the ship name and year built
    @Override
    public String toString() {
        return ("\nShip information: " + "\nName: " + name 
                + "\nYear Built: " + yearBuilt);
    }

    public void display() {
        System.out.println("Ship information: ");
        System.out.println("Name = " + this.getName());
        System.out.println("Year = " + this.getYearBuilt());
    }
}
