
/**
 * We are getting some inspiration in case we cannot decide what to eat for dinner today!.
 *
 * @author Ms Camilleri
 * @version 24.03.2022
 */
public class MealPlan
{
    public static void main(String[] args) {
        // TODO: Declare a variable of type int and call it dayOfWeek (1 would be Monday and 7 would be Sunday)
        
        // A message to explain what the program does
        System.out.println("Let me give you an idea of what to have for dinner!");
        
        // A message to the user to prompt for day of week
        System.out.println("What day of the week is it today? Key in a value from 1 (Mon) to 7 (Sun).");
        
        // TODO: Use the Keyboard class 
        switch(dayOfWeek) {
            case 1: {
                // Monday
                System.out.println("You should have **vegetable lasagna** for Meatless Mondays.");
                break;
            }
            case 2: {
                // TODO: Display a message that says "Why not try **chicken tacos** for Taco Tuesdays?"
                break;
            }
            // TODO: Do the rest of the cases :). Let the teacher know what you would like for dinner on certain days.
        }
        
        // The program will ask the user for feedback
        System.out.println("Did you like my suggestion? Press 'y' for yes.");
        
        char userRating = Keyboard.readChar();
        
        if (userRating == 'y') {
            // TODO: Display a message like "All right! See you at dinner!"
        } else {
            // TODO: Display a message like "Pff... you are silly. Next time don't ask!"
        }
    }
}
