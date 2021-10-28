
/**
 * A program to test useful array algorithms.
 *
 * @author Ms Camilleri
 * @version 0.1
 */
public class App
{
    public static void main(String[] args) {
        // Test linear search on array of int
        System.out.println("Test 1 Linear Search Integers");
        int[] elements = {5, 6, 4, 8, 12};
        int elementPosition = ArrayHelpers.linearSearch(elements, 4);
        System.out.println("Expected result is: 2     Actual result is " + elementPosition);
        
        // Test linear search on array of String
        System.out.println("Test 1 Linear Search String");
        String[] names = {"Jaylan", "Ervin", "Emma", "Violet"};
        int namePosition = ArrayHelpers.linearSearch(names, "Violet");
        System.out.println("Expected result is: 3     Actual result is " + elementPosition);
    }
}
