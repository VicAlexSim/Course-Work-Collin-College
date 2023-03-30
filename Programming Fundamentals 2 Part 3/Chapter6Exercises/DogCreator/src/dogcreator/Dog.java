/*
 *Victor Sim 2/27/2022
 *JDK Version 17.0.2 
 *Practice with Setters and Getters
 */
package dogcreator;

public class Dog {
    //define instance variables
    private String name = null;
    private double weight = 0;
    
    //Dog Constructor
    public Dog(String newName, double newWeight) {
        setName(newName);
        setWeight(newWeight);
    }
    
    //Setter method to set the animal name
    public final void setName(String newName) {
        this.name = newName;
    }
    
    //Setter method to check validity of data a nd set dog weight
    public final void setWeight(double newWeight) {
        if(newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("Weight cannot be negative or zero.");
        }
    }
    
    //Getter method to get the animal name
    public String getName() {
        return this.name;
    }
    
    //Getter method to get dog weight
    public double getWeight() {
        return this.weight;
    }
    
    //method to compare weight of 2 dogs
    public String compare(Dog dogCompare) {
        String message = null;
        if(dogCompare.weight > this.weight) {
            message = dogCompare.name + " weighs more than " + this.name;
        } else if(dogCompare.weight < this.weight){
            message = this.name + " weighs more than " + dogCompare.name;
        } else {
            message = this.name + " weighs equal to " + dogCompare.name;
        }
        return message;
    }
}
