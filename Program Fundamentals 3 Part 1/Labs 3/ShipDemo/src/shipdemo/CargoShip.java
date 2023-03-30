/**
 * Victor Sim
 * 6/29/22
 * JDK 17.0.2
 * Subclass #2
 */
//Package statement
package shipdemo;

//Class Definition
public class CargoShip extends Ship {

//Field/Attribute
    private int tonnage;

//Constructor that initialize name, yearBuilt and cargo capacity
    public CargoShip(String name, String year, int ton) {
        super(name, year);
        tonnage = ton;
    }

//Setter for cargo capacity
    public void setTonnage(int ton) {
        tonnage = ton;
    }

//Getter for cargo capacity
    public int getTonnage() {
        return tonnage;
    }

//toString for the representation of Cargo name and capacity
    @Override
    public String toString() {
        return ("\nShip information: " + "\nName: " + this.getName() + "\nYear Built: " + this.getYearBuilt() + "\nCargo Capacity: " + tonnage);
    }
    
    @Override
    public void display() {
        System.out.println("Ship information: ");
        System.out.println("Name = " + this.getName());
        System.out.println("Year = " + this.getYearBuilt());
        System.out.println("Tonnage = " + this.getTonnage());
    }    
}

// end of CargoShip.java
