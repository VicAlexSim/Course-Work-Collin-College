/* This program will use setters and getters to compile a user-defined class
 *Victor Sim 2/27/2022
 *JDK Version 17.0.2 
 */

package studentcreator;

public class Student {
    //define instance variables
    private String name = null;
    private int age = 0;
    private String type = null;
    //Student Constructor
    Student(String newName, int newAge) {
        this.setName(newName);
        this.setAge(newAge);
    }
    //Setter method to set the student name
    public void setName(String makeName) {
        this.name = makeName;    
    }
    //Getter method to get the student name
    public String getName() {
        return name;
    }
    //Setter method to check validity of data and set the student age
    public void setAge(int makeAge) {
        if (makeAge > 0) {
            this.age = makeAge;
            this.setType();
        }
    }    
    //Getter method to get the student age
    public int getAge() {
        return age;
    }    
    //Setter method to set the student's type based on age
    public void setType() {
        if (this.age < 5) {
            this.type = "Preschool";
        } else if (this.age == 5) {
            this.type = "Kindergarten";
        } else if (this.age < 11) {
            this.type = "Elementary School";
        } else if (this.age < 14) {
            this.type = "Middle School";
        } else if (this.age < 18) {
            this.type = "High School";
        } else if (this.age >= 18) {
            this.type = "College";
        }
   }
    //Getter method to get the student type
    public String getType() {
        return type;
    }
} 


