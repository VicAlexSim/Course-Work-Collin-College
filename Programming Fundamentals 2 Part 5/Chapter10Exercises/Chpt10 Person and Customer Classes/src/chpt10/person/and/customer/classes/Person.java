/**
 * Victor Sim
 * 5/2/22
 * JDK 17.0.2
 * This program will be a superclass for a subclass, both used to
 * define a person of interest
 */
//Package statement
package chpt10.person.and.customer.classes;

class Person {

    // Data fields
    private String name;
    private String address;
    private String phoneNumber;

    // no-argument constructor
    public Person() {
        this("", "", "");
    }

    // 3 - arg constructor
    public Person(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // toString() method
    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Address: " + address + "\n" + "Phone: " + phoneNumber;
    }
}
