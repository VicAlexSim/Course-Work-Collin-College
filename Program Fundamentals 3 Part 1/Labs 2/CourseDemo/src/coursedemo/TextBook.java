/**
   This class stores data about a textbook.
*/
package coursedemo;
public class TextBook implements Comparable
{
   private String title;     // Title of the book
   private String author;    // Author's last name
   private String publisher; // Name of publisher

   /**
      This constructor initializes the title,
      author, and publisher fields
      @param textTitle The book's title.
      @param auth The author's name.
      @param pub The name of the publisher.
   */

   public TextBook(String textTitle, String auth,
                   String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }

   /**
      The copy constructor initializes the object
      as a copy of another TextBook object.
      @param object2 The object to copy.
   */

   public TextBook(TextBook object2)
   {
      title = object2.title;
      author = object2.author;
      publisher = object2.publisher;
   }
   // clone method
   public Object clone()
   {
      return  new TextBook(this);
   }
   // finalize method you need to invoke garbage collection to test this method
   //System.gc()
   public void finalize()
   {
      System.out.println("TextBook object has been destroyed");
   }

   // hashCode method generates a unique number for each objects based on the field values
   public int hashCode()
   {
      // Using Joshua Bloch's recipe for hashCode
      // start with prime number 17 and multiply hashCode() of each fields with prime number 37
      // idea is to generate a unique number

      int result = 17;

      result = 37 * result + title.hashCode();
      result = 37 * result + author.hashCode();
      result = 37 * result + publisher.hashCode();
      return result;

   }
   // equals method "==" operator is only good for comparing primitive data type
   // for any reference objects we need to create equals method instead
   public  boolean equals(TextBook obj)
   {
      boolean status;
      if (title.equals(obj.title) && author.equals(obj.author) && publisher.equals(obj.publisher))
         status = true;
      else
         status =false;

      return status;
   }

   // compareTo method is coming from Interface Comparable<T> this method is good for sorting applications
   // 0 - equal, -1 - less than, 1 - greater than
   public int compareTo(Object obj)
   {
      int result = 0;
      TextBook t = (TextBook) obj;
      if (title.equals(t.title) && author.equals(t.author))
         result = 0;
      else if (title.equals(t.title) && author.compareTo(t.author) < 0)
         result = -1;
      else
         result = 1;

      return result;
   }


   /**
      The set method sets a value for each field.
      @param textTitle The book's title.
      @param auth The author's name.
      @param pub The name of the publisher.
   */

   public void set(String textTitle, String auth,
                   String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }


   /**
      toString method
      @return A string containing the textbook
              information.
   */

   public String toString()
   {
      // Create a string representing the object.
      String str = "Title: " + title +
                   "\nAuthor: " + author +
                   "\nPublisher: " + publisher;

      // Return the string.
      return str;
   }
}