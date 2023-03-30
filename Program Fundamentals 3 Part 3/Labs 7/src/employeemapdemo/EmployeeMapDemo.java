/**
 * Victor Sim
 * 7/28/22
 * JDK 17.0.2
 * Driver Class
 */
//Package statement
package employeemapdemo;

//Class Header & Definiton
public class EmployeeMapDemo {

    //Main Method
    public static void main(String[] args) {
        //Make Employee Map object
        EmployeeMap employeeObject = new EmployeeMap();
        //Demonstrate Application by putting Employee Objects into the map
        employeeObject.put(new Employee(234180, "John"));
        employeeObject.put(new Employee(109657, "Martha"));
        //Retrieve said Employee Objects from map and print to output
        System.out.println(employeeObject.get(234180));
        System.out.println(employeeObject.get(109657));
    }
}
