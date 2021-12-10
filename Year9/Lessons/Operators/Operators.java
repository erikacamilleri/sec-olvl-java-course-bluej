/**
 * In this lesson we are learning how to use various operators in Java.
 *
 * @author Ms Camilleri
 * @version 0.1
 */
public class Operators
{
    public static void main(String[] args) {
        /**
         * Let us try some Arithmetic Operators like +, -, *, / and %
         */
        // Declaring and assigning values to variables a, b and c.
        int a = 5;
        
        int b = 2;
        
        double c = 10.00;
        
        // Here we are doing addition.
        System.out.println("Given that a is 5, and b is 2 then a + b = " + (a + b));
        
        // Here we are doing multiplication.
        System.out.println("Given that a is 5, and b is 2 then a x b = " + (a * b));
        
        // Here we are doing division between two integers.
        System.out.println("Given that a is 5, and b is 2 then a / b = " + (a / b));
        
        // Here we are doing division between an integer and a double.
        System.out.println("Given that a is 5, and c is 10.00 then a / c = " + (a / c));
        
        // Here we are doing modulus between two different numbers.
        System.out.println("Given that a is 5, and b is 2, then a % b = " + (a % b));
        
        // Here we are doing modulus between two numbers that are the same.
        System.out.println("Given that a is 5 then a % a = " + (a % a));
        
        /**
         * Let us experiment with Logical Operators like AND, OR and NOT
         */
        boolean needHeavyRaincoat;
        
        boolean isRaining = true;
        
        boolean isCold = true;
        
        // This is how we do an AND expression
        needHeavyRaincoat = isRaining && isCold;
        
        System.out.println("Do I need a heavy rain coat?" + needHeavyRaincoat);
        
        isRaining = false;
        
        isCold = false;
        
        boolean needLightRaincoat = isRaining || isCold;
        
        System.out.println("Do I need a light rain coat?" + needLightRaincoat);
    }
}
