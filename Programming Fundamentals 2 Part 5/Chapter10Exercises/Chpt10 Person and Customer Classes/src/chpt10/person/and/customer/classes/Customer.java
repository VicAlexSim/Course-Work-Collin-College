/**
 * Victor Sim
 * 5/2/22
 * JDK 17.0.2
 * This program will be a subclass for a superclass, both used to
 * define a person of interest
 */
//Package Statement
package chpt10.person.and.customer.classes;

class Customer extends Person {

    // Data field
    private String customerNumber;

    // no-argument constructor
    public Customer() {
        customerNumber = "";
    }

    // 4 - arg constructor
    public Customer(String name, String address, String phoneNumber, String customerNumber) {
        super(name, address, phoneNumber);
        this.customerNumber = customerNumber;
    }

    // Getters and setters
    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    // toString() method
    @Override
    public String toString() {
        return super.toString() + "\n" + "Customer Number: " + customerNumber;
    }
}
