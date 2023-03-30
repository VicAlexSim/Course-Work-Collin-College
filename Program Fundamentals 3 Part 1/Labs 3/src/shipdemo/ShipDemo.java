/**
 * Victor Sim
 * 6/29/22
 * JDK 17.0.2
 * Driver/Main Class
 */
//Package statement
package shipdemo;

//Class Declaration
public class ShipDemo {

    public static void main(String[] args) {

//Create an array to store 3 Ship objects
        Ship ships[] = new Ship[3];

//Create objects for Ship, CruiseShip and CargoShip class
        ships[0] = new Ship("Mayflower", "1620");
        ships[1] = new CruiseShip("Titanic", "1912", 46329);
        ships[2] = new CargoShip("Santa Maria", "1392", 110);

//Loop to display the ships created with display interface also
        for(int i = 0; i < ships.length; i++) {
            System.out.println("\nTostring method version");
            System.out.println(ships[i]);
            System.out.println("\nDisplay method version\n");
            ships[i].display();
        }
    }

}


