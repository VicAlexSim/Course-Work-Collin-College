/**
 * Victor Sim
 * 5/2/22
 * JDK 17.0.2
 * This program will be the driver/main function/method to print out
 * objects from a superclass and a subclass.
 */
//Package statement
package chpt10.person.and.customer.classes;

//Driver or Main Method/Class
public class Chpt10PersonAndCustomerClasses {

    public static void main(String[] args) {

        // Create array of 4 people
        Person[] people = new Person[4];

        // The first 2 elements People objects
        people[0] = new Person("John Doe", "123 Main Street,TX 50740", "123-567-9900");
        people[1] = new Person("Peter Parker", "13 River Street,TX 12770", "563-121-1270");

        // The next 2 elements Customer objects
        people[2] = new Customer("James Smith", "31 Forest Street,TX 12341", "121-777-1270", "567-5690");
        people[3] = new Customer("Mary Thin", "31 Sky Street,TX 67000", "121-777-2222", "567-7788");

        // for loop to print each object entry
        for (Person person : people) {
            System.out.println(person + "" + "\n");
        }
    }
}
