/* 
 * Viotor Sim 2/12/22
 * Set of procedures for a math quiz that would display the raw amount and overall percentage of total correct equations and their answers. 
 * JDK 17.0.2
 */

//Imported Libraries Needed
import java.util.Random;
import javax.swing.JOptionPane;

public class MathQuiz
{
    //Main method created
    public static void main(String[] args) {
        
       //Declare the variables and initialize them to any arbitrary number, so for now do zero.
       int numbersCorrect = 0;
       int numberOfQuestions = 0;
       final double PERCENTAGE_MAKER = 100.0;
       final double MINIMUM_SCORE_COMPARATOR = 60.0;
       
       //Window prompt used to ask the user to enter an integer for the number of questions they wish to ask.
       numberOfQuestions = Integer.parseInt(JOptionPane.showInputDialog(null,
               "How many equations would you like to solve?"));
       //For Loop to generate questions.
       for(int index = 0; index < numberOfQuestions; index++) {
           //Random object created
           Random randomNumbers = new Random();
           
           //Generates 2 random numbers from 1-10 for each equation/Index with Random class.
           int numberOne = randomNumbers.nextInt(10)+1;
           int numberTwo = randomNumbers.nextInt(10)+1;
           
           //Get user response
           int userreseponse = Integer.parseInt(JOptionPane.showInputDialog(null,
                   numberOne + "+" + numberTwo + "=?"));
           
           //Decision structure to check if userresponse is equal to (num1+num2) or the equation generated.
           //Correct pathway.
           if((numberOne + numberTwo) == userreseponse)
           {
               numbersCorrect++;
               JOptionPane.showMessageDialog(null,
                       "Correct");
           }
           //Incorrect pathway.
           else {
               JOptionPane.showMessageDialog(null,
                       "Incorrect");
           }
       }
       //Calculates the percentage.
       double percentage = ((double)numbersCorrect / numberOfQuestions) * PERCENTAGE_MAKER;
       //Decision strucutre to check if percent is above 50%.
       if(percentage > MINIMUM_SCORE_COMPARATOR) {
           JOptionPane.showMessageDialog(null,
                "You got " + numbersCorrect + " out of "
                           + numberOfQuestions + " questions correct."
                           +"\nwhich equates to " + String.format("%.2f%%", percentage));
       }
       //Other prompt for failed grade
       else {
           JOptionPane.showMessageDialog(null,
                "You got " + numbersCorrect + " out of "
                           + numberOfQuestions + " questions correct."
                           +"\nwhich equates to " + String.format("%.2f%%", percentage)
                           +"\nYou need more practice.");
       }
       //Obligatory shutdown for the sake of RAM
       System.exit(0);
   }
} 