/**
 * Victor Sim
 * 6/13/22
 * JDK 17.0.2
 * This program will be the driver class for the entire project.
 * It will output object's fields from Mutators and Accessor methods,
 * and format them accordingly from reference variables.
 * */
//Package Statement
package employeeapp;

//Class Statement
public class Employee {
    
    //Instance variables/fields
    private String name;
    private int idNumber;
    private String department;
    private String position;
    //default constructor
    public Employee() {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
//Parameterized constructor (Constructors that can take each amount of arguments for fields specifically)
    public Employee(String name) {
        this.name = name;
        idNumber = 0;
        department = "";
        position = "";
    }    
    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        department = "";
        position = "";
    }

    public Employee(String name, int idNumber, String department) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        position = "";
    }    
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
//Mutator/Setter example
    public void setName(String name) {
        this.name = name;
    }
//Accessor/Getter example
    public String getName() {
        return this.name;
    }

    public void setIDNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIDNumber() {
        return this.idNumber;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }
    
    //toString method
    public String toString() {
        String str = "Name: " + name + "\nIDNumber: " + idNumber 
                   + "\nDepartment: " + department + "\nPosition: " + position;
        return str;
    }
}
