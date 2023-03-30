/**
   This program demonstrates a Month Class demo.
*/
import javax.swing.JOptionPane;
public class MonthClient{
   public static void main(String[] args){
      //Get month number from user
      String input=JOptionPane.showInputDialog(null,"Enter a month number");
      int number=Integer.parseInt(input);
      // Create a month object
      Month m1 = new Month(number);
      //Get month number from user
      input=JOptionPane.showInputDialog(null,"Enter another month number");
      number=Integer.parseInt(input);
      // Create a month object
      Month m2 = new Month(number);
      System.out.println("Month " + m1.getMonthNumber() +
                         " is " + m1);
      System.out.println("Month " + m2.getMonthNumber() +
                         " is " + m2);
      //Season
      System.out.println(m1 + " is " + m1.getSeason());
      System.out.println(m2 + " is " + m2.getSeason());
    
      // Is m1 greater than m2?
      if (m1.greaterThan(m2))
         System.out.println(m1 + " comes after " + m2 + " in the year.");
      else
         System.out.println(m1 + " comes before " + m2 + " in the year.");
      
      if (m1.equals(m2))
         System.out.println(m1 + " equals " + m2);
      else
         System.out.println(m1 + " does not equal " + m2);

   }
}
