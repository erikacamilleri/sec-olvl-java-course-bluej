/**
 * This is a very simple program that a human user can use to teach a computer how to count.
 * You
 *
 * @author Ms Camilleri
 * @version 0.1
 * 
 * Level: Very Easy
 */

// TODO: to use Scanner for keyboard input uncomment the below and delete this comment
// import java.util.Scanner;

public class CountNumbersTraining
{
    public static void main(String[] args) {
        
        // TODO: to use Scanner for keyboard input uncomment the below and delete this comment
        // Scanner keyboardInput = new Scanner(System.in);
        
        System.out.println("Please teach me how to count from 1 to 5...");
        
        int numberInput = 0;
        
        System.out.println("Teach me a number and I will say it back...");
        // TODO: Use the Keyboard class or the Scanner class to get the number 1 from the user. The input keyed in should be stored in numberInput.
        System.out.println("You told me to say: " + numberInput + "\n\n");
        
        System.out.println("Teach me the next number and I will say it back...");
        // TODO: Use the Keyboard class or the Scanner class to get the number 2 from the user. The input keyed in should be stored in numberInput.
        System.out.println("You told me to say: " + numberInput + "\n\n");
        
        System.out.println("Teach me a bad example of a number and I will not say it back...");
        // TODO: Use the Keyboard class or the Scanner class to get an incorrect number from the user e.g. 100. The input keyed in should be stored in numberInput.
        System.out.println("Ok, I will not say it back.");
        
        // TODO: Code the rest for user to teach the computer to "say" 3, 4 and 5
        
        System.out.println("Thank you for teaching me how to count. Good bye!");
    }
}
