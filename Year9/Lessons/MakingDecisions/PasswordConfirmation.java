
/**
 * In this program a user will type in a password twice and get back whether password is confirmed or not.
 *
 * @author Your Name
 * @version 11.03.2022
 * 
 * Level Easy
 */
public class PasswordConfirmation
{
    public static void main(String[] args) {
        
        // Declaring a variable password of type String
        String password = "";
        
        // TODO: Declaring a variable confirmPassword of type String
        
        // Ask the user to type in a password...
        System.out.println("Please type in your password:");
        password = Keyboard.readString();
        
        // TODO: Ask the user to type it again and store it in confirmPassword
        
        // Check if they are equal
        if (/* TODO: Replace me with the condition */) {
            System.out.println("Password confirmed!");
        } // TODO: Replace me with the else part of the if statement and display a message "Passwords do not match!"
    }
}
