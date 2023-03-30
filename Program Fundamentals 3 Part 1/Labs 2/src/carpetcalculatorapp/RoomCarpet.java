/**
 * Victor Sim
 * 6/22/22
 * JDK 17.0.2
 * Class #2, extends Class #1 (Room Dimension)
 */
//Package Statement
package carpetcalculatorapp;

//Class Declaration
public class RoomCarpet implements Cloneable, Comparable {

    //Instance variable for RoomCarpet
    private RoomDimension size;
    private double carpetCost;

    //Parameterized constructor
    public RoomCarpet(RoomDimension dim, double cost) {
        this.size = dim;
        this.carpetCost = cost;
    }

    //Copy constructor
    public RoomCarpet(RoomCarpet copyRC) {
        this.carpetCost = copyRC.carpetCost;
        this.size = copyRC.size;
    }

    //Getters and Setters
    public RoomDimension getRoomDimension() {
        return size;
    }

    public void setRoomDimension(RoomDimension roomDimension) {
        this.size = roomDimension;
    }

    public double getCostPerSqFt() {
        return carpetCost;
    }

    public void setCostPerSqFt(double costPerSqFt) {
        this.carpetCost = costPerSqFt;
    }

    //getTotalCost method
    public double getTotalCost() {
        return size.getArea() * carpetCost;
    }

    //clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new RoomCarpet(this);
    }

    //equals method
    public boolean equals(RoomCarpet obj) {
        {
            boolean status;
            if (carpetCost == (obj.carpetCost) && this.size == obj.size) {
                status = true;
            } else {
                status = false;
            }
            return status;
        }
        // hashcode method
    public int hashCode() {
        int hash = 17;
        hash = 37 * hash + size.hashCode();
        hash = 37 * hash + (int) carpetCost;
        return hash;
    }

    // toString
    public String toString() {
        return size.toString() + "\nTotal cost of carpet: " + getTotalCost() + "\n";
    }

    // compareTo
    public int compareTo(RoomCarpet obj) {
        int result;
        RoomCarpet c = (RoomCarpet) obj;
        if ((this.equals(c) == true)) {
            result = 0;
        } else {
            result = 1;
        }

        return result;
    }

    public void finalize() throws Throwable {
        try {
            System.out.println("RoomCarpet Object has been destroyed.");
        } finally {
            super.finalize();
        }
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
