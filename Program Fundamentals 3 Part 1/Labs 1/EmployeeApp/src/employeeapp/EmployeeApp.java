/**
 * Victor Sim
 * 6/13/22
 * JDK 17.0.2
 * This program will be the driver class for the entire project.
 * It will output object's fields from Mutators and Accessor methods,
 * and format them accordingly from reference variables.
 **/

//Package Statement
package employeeapp;

//Driver or Main Method/Class Statement
public class EmployeeApp {
    
    public static void main(String[] args) {
        //Create three employee objects
        Employee employee1 = new Employee("Susan Meyers", 47899, "Accounting", "Vice President");
        Employee employee2 = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee employee3 = new Employee("Joy Rogers", 81744, "Manufacturing", "Engineer");
        
        //Make variables for the headers to be formatted
        String header1 = "Name";
        String header2 = "ID Number";
        String header3 = "Department";
        String header4 = "Position";
        
        //Make reference variables to be formatted
        String name1 = employee1.getName();
        int id1 = employee1.getIDNumber();
        String department1 = employee1.getDepartment();
        String position1 = employee1.getPosition();
        String name2 = employee2.getName();
        int id2 = employee2.getIDNumber();
        String department2 = employee2.getDepartment();
        String position2 = employee2.getPosition();
        String name3 = employee3.getName();
        int id3 = employee3.getIDNumber();
        String department3 = employee3.getDepartment();
        String position3 = employee3.getPosition();    
        
        /*Output reference variables for each field from each version of the 
        class/each object of the same class*/
        System.out.printf("%-20s%-20s%-20s%-20s\n", header1, header2, header3, header4);
        System.out.printf("%-20s%-20s%-20s%-20s\n", name1, id1, department1, position1);
        System.out.printf("%-20s%-20s%-20s%-20s\n", name2, id2, department2, position2);        
        System.out.printf("%-20s%-20s%-20s%-20s\n", name3, id3, department3, position3);   
    }
}
