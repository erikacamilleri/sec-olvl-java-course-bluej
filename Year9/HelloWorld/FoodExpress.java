import java.util.Scanner;

/**
 * This is a class to model ordering food at a Kiosk.
 *
 * @author Ms Camilleri
 * @version 0.1
 */
public class FoodExpress
{
    public static void displayMenu() {
        // Declaring an **array** that will store our menu items of type String
        String[] kioskMenu = {"Fish and Chips", "Hot Dog and Chips", "Ftira", "Salad Tuna", "Salad Chicken", "Soft Drink"};
        // Display them using a for loop
        for(int i = 0; i < 6; i++) {
            // Display
            System.out.println((i + 1) + " " + kioskMenu[i]);
        }

    }
    
    /**
     * A method that should accept input from the user to display the order
     */
    public static void placeOrder() {
        // Prompt the user to place the order
        System.out.println("Kindly type in your order...");
        // Let's declare a variable to store what the customer wants
        String order = "";

        // Accepting input
        Scanner acceptInput = new Scanner(System.in);  
        order = acceptInput.nextLine();

        // Check that this works
        System.out.println(order);
    }
}
