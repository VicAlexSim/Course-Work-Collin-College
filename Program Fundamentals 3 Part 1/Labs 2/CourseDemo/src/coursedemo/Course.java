/**
   This class stores data about a course.
*/
package coursedemo;
public class Course implements Comparable
{
   private String courseName;      // Name of the course
   private Instructor instructor;  // The instructor
   private TextBook textBook;      // The textbook

   /**
      This constructor initializes the courseName,
      instructor, and text fields.
      @param name The name of the course.
      @param instr An Instructor object.
      @param text A TextBook object.
   */

   public Course(String name, Instructor instr,
                 TextBook text)
   {
      // Assign the courseName.
      courseName = name;

      // Create a new Instructor object, passing
      // instr as an argument to the copy constructor.
      instructor = new Instructor(instr);

      // Create a new TextBook object, passing
      // text as an argument to the copy constructor.
      textBook = new TextBook(text);
   }
   // copy constructor
   public Course(Course obj)
   {
      courseName = obj.courseName;
      instructor = obj.instructor;
      textBook = obj.textBook;

   }

   public Object clone()
   {
      return  new Course(this);
   }
   public void finalize()
   {
      System.out.println("Course object has been destroyed");
   }

   public int hashCode()
   {
      // Using Joshua Bloch's recipe for hashCode

      int result = 17;

      result = 37 * result + courseName.hashCode();
      result = 37 * result + instructor.hashCode();
      result = 37 * result + textBook.hashCode();
      return result;

   }
   public  boolean equals(Course obj)
   {
      boolean status;
      if (courseName.equals(obj.courseName))
         status = true;
      else
         status =false;

      return status;
   }

   public int compareTo(Object obj)
   {
      int result = 0;
      Course c = (Course) obj;
      if (courseName.equals(c.courseName))
         result = 0;
      else if (courseName.compareTo(c.courseName) < 0)
         result = -1;
      else
         result = 1;

      return result;
   }

   /**
      getName method
     @return The name of the course.
   */

   public String getName()
   {
      return courseName;
   }

   /**
      getInstructor method
      @return A reference to a copy of this course's
              Instructor object.
   */

   public Instructor getInstructor()
   {
      // Return a copy of the instructor object.
      return new Instructor(instructor);
   }

   /**
      getTextBook method
      @return A reference to a copy of this course's
              TextBook object.
   */

   public TextBook getTextBook()
   {
      // Return a copy of the textBook object.
      return new TextBook(textBook);
   }

   /**
      toString method
      @return A string containing the course information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Course name: " + courseName +
                   "\nInstructor Information:\n" +
                   instructor +
                   "\nTextbook Information:\n" +
                   textBook;

      // Return the string.
      return str;
   }
}