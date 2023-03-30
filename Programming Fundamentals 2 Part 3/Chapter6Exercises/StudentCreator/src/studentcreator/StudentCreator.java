/* This program will use setters and getters to compile a user-defined class
 *Victor Sim 2/27/2022
 *JDK Version 17.0.2 
 */

package studentcreator;

public class StudentCreator {
    public static void main(String[] args) {
        //Create student objects
        Student student1 = new Student("Bob", 17);
        Student student2 = new Student("Jan", 13);
        
        //Print out student name, age, and schooling type
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Type of Student: " + student1.getType());
        System.out.println("\nName: " + student2.getName());
        System.out.println("Age: " + student2.getAge());
        System.out.println("Type of Student: " + student2.getType());
        
        //Change student1 age
        student1.setAge(18);
        System.out.println("\nName: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Type of Student: " + student1.getType());
    } 
}  
