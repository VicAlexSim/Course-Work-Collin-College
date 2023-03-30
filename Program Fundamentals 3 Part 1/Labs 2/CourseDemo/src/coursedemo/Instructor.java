//import java.security.PublicKey;

/**
   This class stores data about an instructor.
*/
package coursedemo;
public class Instructor implements Comparable
{
   private String lastName;     // Last name   
   private String firstName;    // First name
   private String officeNumber; // Office number

   /**
      This constructor initializes the last name,
      first name, and office number.
      @param lname The instructor's last name.
      @param fname The instructor's first name.
      @param office The office number.
   */

   public Instructor(String lname, String fname,
                     String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }

   /**
      The copy constructor initializes the object
      as a copy of another Instructor object.
      @param object2 The object to copy.
   */
   
   public Instructor(Instructor object2)
   {
      lastName = object2.lastName;
      firstName = object2.firstName;
      officeNumber = object2.officeNumber;
   }

   public Object clone()
   {
      return  new Instructor(this);
   }
   public void finalize()
   {
      System.out.println("Instructor object has been destroyed");
   }
   public int hashCode()
   {
      // Using Joshua Bloch's recipe for hashCode

      int result = 17;

      result = 37 * result + lastName.hashCode();
      result = 37 * result + firstName.hashCode();
      return result;

   }
   public  boolean equals(Instructor obj)
   {
      boolean status;
      if (lastName.equals(obj.lastName) && firstName.equals(obj.firstName) && officeNumber.equals(obj.officeNumber))
         status = true;
      else
         status =false;

      return status;
   }

   public int compareTo(Object obj)
   {
      int result = 0;
      Instructor i = (Instructor)obj;
      if (firstName.equals(i.firstName) && lastName.equals(i.lastName))
         result = 0;
      else if (firstName.equals(i.firstName) && lastName.compareTo(i.lastName) < 0)
         result = -1;
      else
         result = 1;

      return result;
   }



   /**
      The set method sets a value for each field.
      @param lname The instructor's last name.
      @param fname The instructor's first name.
      @param office The office number.
   */
   
   public void set(String lname, String fname,
                   String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   
   /**
      toString method
      @return A string containing the instructor
              information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Last Name: " + lastName +
                   "\nFirst Name: " + firstName +
                   "\nOffice Number: " + officeNumber;

      // Return the string.
      return str;
   }
}