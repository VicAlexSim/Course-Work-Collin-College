/* 
 * Viotor Sim 2/13/22
 * Set of procedures for a Rock-Paper-Scissors game. 
 * JDK 17.0.2
 */

// Libraries Imported
import java.util.Random;
import javax.swing.JOptionPane;

public class RockPaperScissors {

    // Method/Function checkTheWinner
    public static int checkTheWinner(int computer, int user) {
        // Local Constants Declared and Initialized
        final int TIE_INDICATOR = -1;
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;
        final int USERWINS = 1;
        final int COMPUTERWINS = 0;
        // Displaying Computer's Choice
        if (computer == ROCK) {
                JOptionPane.showMessageDialog(null, "Computer's Choice: Rock.\n");
        }
        else if (computer == PAPER) {
                JOptionPane.showMessageDialog(null, "Computer's Choice: Paper.\n");
        }
        else if (computer == SCISSORS) {
                JOptionPane.showMessageDialog(null, "Computer's Choice: Scissors.\n");
        }

        // Displaying User's Choice
        if (user == ROCK) {
                JOptionPane.showMessageDialog(null, "User's Choice: Rock.\n");
        } else if (user == PAPER) {
                JOptionPane.showMessageDialog(null, "User's Choice: Paper.\n");
        } else if (user == SCISSORS) {
                JOptionPane.showMessageDialog(null, "User's Choice: Scissors.\n");
        }

        // Displays the result/finalCondition
        if (computer == ROCK && user == SCISSORS) {
            JOptionPane.showMessageDialog(null,  "Result: Computer wins.\n" 
                                                +"Rock beats scissors.\n");
            return COMPUTERWINS;
        } else if (computer == SCISSORS && user == ROCK) {
            JOptionPane.showMessageDialog(null,  "Result: User wins.\n"
                                                +"Rock beats scissors.\n");
            return USERWINS;
        }

        if (computer == SCISSORS && user == PAPER) {
            JOptionPane.showMessageDialog(null,  "Result: Computer wins.\n"
                                                +"Scissor beats paper.\n");
            return COMPUTERWINS;
        } else if (computer == PAPER && user == SCISSORS) {
            JOptionPane.showMessageDialog(null, "Result: User wins.\n"
                                                +"Scissor beats paper.\n");
            return USERWINS;
        }

        if (computer == PAPER && user == ROCK) {
            JOptionPane.showMessageDialog(null,  "Result: Computer wins.\n"
                                                +"Paper beats rock.\n");
            return COMPUTERWINS;
        } else if (computer == ROCK && user == PAPER) {
            JOptionPane.showMessageDialog(null,  "Result: User wins\n"
                                                +"Paper beats rock.\n");
            return USERWINS;
        }
        
        // The Tie or leftover else basically to return a value to retry the while loop in main.
        JOptionPane.showMessageDialog(null,"Result: Tie\n"
                                            +"Nobody won, retry.");
        return TIE_INDICATOR; 
    }
    
    // Method/Function userChoice
    public static int userInput() {
        // Local Constants Declared and Initialized
        final int ROCK = 1;
        final int PAPER = 2;
        final int SCISSORS = 3;
        int inputPlaceholder = 0;
        int choice = 0;
        boolean boolCondition = true;
        while (boolCondition) {
            inputPlaceholder = Integer.parseInt(JOptionPane.showInputDialog(null,
                                      "1. Rock\n"
                                    + "2. Paper\n"
                                    + "3. Scissors\n"
                                    + "Enter (1, 2, or 3): "));
            choice = inputPlaceholder;
            if (choice == ROCK) {
                boolCondition = false;
            } else if (choice == PAPER) {
                boolCondition = false;
            } else if (choice == SCISSORS) {
                boolCondition = false;
            }   
        }
        return choice;
    }
    
    // Method computerChoice
    public static int randomChoice() {
        // Random class object
        Random number = new Random();
        // Generats random number between 1 to 3, + 1 to make range inclusive to 3.
        return number.nextInt(3) + 1;
    }
    
    public static void main(String[] args) {
        final int TIE_INDICATOR = -1;
        // While loop to get computerChoice and userChoice.
        while (true) {
            int computerChoice = randomChoice();
            int userChoice = userInput();
            // Calling checkTheWinner Mmethod/Function
            int finalCondition = checkTheWinner(computerChoice, userChoice);
            /* If finalCondition != TIE_INDICATOR or -1 
            that means the game was not tied
            which means someone won, which then terminates 
            the program when someone has won */
            if (finalCondition != TIE_INDICATOR) {
                System.exit(0);
            }
        }
    }
}
