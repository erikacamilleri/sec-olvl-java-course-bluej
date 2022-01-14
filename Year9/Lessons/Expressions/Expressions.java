
/**
 * An expression is a series of variables, operators and values that can 
 * evaluate to a single value.
 *
 * @author Ms Camilleri
 * @version 0.1
 */
public class Expressions
{
    // TODO: There is a mistake in the line below... fix it!
    public static void main() {
        
        // outputting welcome text to the console
        System.out.println("Let's learn about expressions in Java!");
        
        // *** EASY TASK ***
        // Read all the comments and code, and try to fill in the missing code. Instructions for you are labelled with TODO:
        
        // we pay a small tax on products we buy, the tax is normally a percentage of the price
        System.out.println("Expression to calculate amount due for a product: due = price + (price * vat/100).");
        
        // declaring three variables of the same type, do you know which type they are?
        double price, vat, due; 
        
        // TODO assign price with a value of 500, and vat with a value of 17.5 right under this comment
        
        // expression to calculate amount due, notice the use of variables, operators and numerical values
        due = price + (price * (vat/100));
        
        // TODO: add the due value to text outputted
        System.out.println("When price is: " + price + " and vat is: " + vat + " then amount due is: ");
        
        // *** HARD TASK ***
        // During January sales all prices are discounted by 50%, but we still need to pay vat on the discounted price of the product
        // TODO print out expression to calculate discounted price
        // TODO declare and assign a value to a variable to store discount
        // TODO expression to calculate the update the amount due with the discounted price
        
        // *** FREE STYLE ***
        // TODO: make up your own expression under this comment, make sure to use comments and print out explanations
    }
}
