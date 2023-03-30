
package coursedemo;
/**
   This program demonstrates the Course class.
*/
import java.util.ArrayList;
import java.util.Iterator;

public class CourseDemo
{
   public static void main(String[] args)
   {
      // Create three Instructor objects.
      Instructor myInstructor =
          new Instructor("Kramer", "Shawn", "RH3010");
      Instructor myInstructor_2 =
              new Instructor("Mathew", "Shawn", "RH3010");

      Instructor myInstructor_3 =
              new Instructor("Kramer", "Mary", "RH3010");


      // Create a TextBook objects.
      TextBook myTextBook =
          new TextBook("Starting Out with Java",
                       "Gaddis", "Scott/Jones");
                       
      // Create three Course object.
      Course myCourse = 
         new Course("Intro to Java", myInstructor,
                    myTextBook);
      Course myCourse_2 =
              new Course("Data Structure", myInstructor_2,
                      myTextBook);
      Course myCourse_3 =
              new Course("Data Structure", myInstructor_3,
                      myTextBook);

      // create otherCourse using copy constructor (testing copy constructor)
      Course otherCourse = new Course(myCourse);
      // create courseCloned using clone method (testing clone() method)
      Course courseCloned = (Course)myCourse_2.clone();

      
      // Display the course information with hashcode (testing toString() and hashCode() methods)
      System.out.println("my course");
      System.out.println("Hash code: " + myCourse.hashCode());
      System.out.println(myCourse);
      System.out.println("my course 2");
      System.out.println("Hash code: " +myCourse_2.hashCode());
      System.out.println(myCourse_2);
      System.out.println("my course 3");
      System.out.println("Hash code: " +myCourse_3.hashCode());
      System.out.println(myCourse_3);
      System.out.println("other course");
      System.out.println("Hash code: " +otherCourse.hashCode());
      System.out.println(otherCourse);
      System.out.println("cloned course");
      System.out.println("Hash code: " +courseCloned.hashCode());
      System.out.println(courseCloned);

      // testing equals method
      if (myCourse.equals(otherCourse))
         System.out.println("myCourse is equal to otherCourse");
      if (myCourse_2.equals(courseCloned))
         System.out.println("myCourse 2 is equal to cloned Course");

      // testing compareTo method
      if (myCourse.compareTo(myCourse_2) == 0)
         System.out.println("same course");
      else if (myCourse.compareTo(myCourse_2) < 0)
         System.out.println("listed before");
      else
         System.out.println("listed after");

      // testing compareTo method
      if (myCourse_2.compareTo(myCourse_3) == 0)
         System.out.println("same course");
      else if (myCourse_2.compareTo(myCourse_3) < 0)
         System.out.println("listed before");
      else
         System.out.println("listed after");

      // using ArrayList to populate course objects
      ArrayList<Course> courseList = new ArrayList<>();
      courseList.add(myCourse);
      courseList.add(myCourse_2);
      courseList.add(myCourse_3);
      System.out.println(courseList.get(0).getInstructor());
      }
   }
