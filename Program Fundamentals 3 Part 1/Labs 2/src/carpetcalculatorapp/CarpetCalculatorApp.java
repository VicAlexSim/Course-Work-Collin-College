/**
 * Victor Sim
 * 6/22/22
 * JDK 17.0.2
 * Main Class
 */
//Package statement
package carpetcalculatorapp;

//Import statement
import java.util.ArrayList;

//class declaration
public class CarpetCalculatorApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Create 3 RoomCarpet objects
        RoomCarpet roomCarpet_1 = new RoomCarpet(new RoomDimension(17, 18), 20);
        RoomCarpet roomCarpet_2 = new RoomCarpet(new RoomDimension(10, 20), 13);
        RoomCarpet roomCarpet_3 = new RoomCarpet(new RoomDimension(20, 20), 20);

        // create otherRoomCarpet using copy constructor (testing copy constructor)
        RoomCarpet otherRoomCarpet = new RoomCarpet(roomCarpet_1);
        // create roomCarpetCloned using clone method (testing clone() method)
        RoomCarpet roomCarpetCloned = (RoomCarpet) roomCarpet_2.clone();

        // Display the course information with hashcode (testing toString() and hashCode() methods)
        System.out.println("Room #1");
        System.out.println("Hash code: " + roomCarpet_1.hashCode());
        System.out.println(roomCarpet_1);
        System.out.println("Room #2");
        System.out.println("Hash code: " + roomCarpet_2.hashCode());
        System.out.println(roomCarpet_2);
        System.out.println("Room #3");
        System.out.println("Hash code: " + roomCarpet_3.hashCode());
        System.out.println(roomCarpet_3);
        System.out.println("Copied Room for #1");
        System.out.println("Hash code: " + otherRoomCarpet.hashCode());
        System.out.println(otherRoomCarpet);
        System.out.println("Cloned Room for #2");
        System.out.println("Hash code: " + roomCarpetCloned.hashCode());
        System.out.println(roomCarpetCloned);

        // testing equals method
        if (roomCarpet_1.equals(otherRoomCarpet)) {
            System.out.println("roomCarpet_1 is equal to otherRoomCarpet");
        }
        if (roomCarpet_2.equals(roomCarpetCloned)) {
            System.out.println("roomCarpet_2 is equal to cloned roomCarpetCloned");
        }

        // testing compareTo method
        if (roomCarpet_1.compareTo(roomCarpet_2) == 0) {
            System.out.println("same room");
        } else if (roomCarpet_1.compareTo(roomCarpet_2) == 1) {
            System.out.println("not the same room");
        } else {
            System.out.println("error");
        }

        // testing compareTo method
        if (roomCarpet_2.compareTo(roomCarpet_3) == 0) {
            System.out.println("same room");
        } else if (roomCarpet_2.compareTo(roomCarpet_3) == 1) {
            System.out.println("not the same room");
        } else {
            System.out.println("error");
        }

        // using ArrayList to populate course objects
        ArrayList<RoomCarpet> roomCarpets = new ArrayList<>();
        roomCarpets.add(roomCarpet_1);
        roomCarpets.add(roomCarpet_2);
        roomCarpets.add(roomCarpet_3);
    }
}
