/**
 * Write a description of class HelloWorld here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class App
{
    public static void main(String args[]) {
        FoodExpress.displayMenu();
        int foodCode = FoodExpress.placeOrder();
        FoodExpress.addFoodItemToCart(foodCode);
    }
}