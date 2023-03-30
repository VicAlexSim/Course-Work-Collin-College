/**
 * Victor Sim
 * 6/22/22
 * JDK 17.0.2
 * Class #1
 */
//Package statement
package carpetcalculatorapp;

//Class Declaration
public class RoomDimension implements Cloneable, Comparable<RoomDimension> {

    //Instance variable for room dimension
    private double length;
    private double width;

    //Parameterized constructor
    public RoomDimension(double len, double w) {
        this.length = len;
        this.width = w;
    }

    //Copy constructor
    public RoomDimension(RoomDimension copyRD) {
        this.length = copyRD.length;
        this.width = copyRD.width;
    }

    //Getters and Setter
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //getArea method
    public double getArea() {
        return length * width;
    }

    //clone method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return new RoomDimension(this);
    }

    //equals method
    public boolean equals(RoomDimension obj) {
        RoomDimension other = (RoomDimension) obj;
        return this.length == other.width && this.width == other.width;
    }

    //hashcode method using Joshua Bloch's recipe for hashCode
    @Override
    public int hashCode() {
        int hash = 17;
        hash = 37 * hash + (int)length;
        hash = 37 * hash + (int)width;
        return hash;
    }

    //toString method
    @Override
    public String toString() {
        return "Room: " + length + "x" + width + "\nArea: " + getArea();
    }

    //compareTo method
    @Override
    public int compareTo(RoomDimension compareRD) {
        if (this.getArea() > compareRD.getArea()) {
            return 1;
        } else if (this.getArea() < compareRD.getArea()) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public void finalize() throws Throwable {
        try {
            System.out.println("RoomDimension Object has been destroyed.");
        } finally {
            super.finalize();
        }
    }
}
