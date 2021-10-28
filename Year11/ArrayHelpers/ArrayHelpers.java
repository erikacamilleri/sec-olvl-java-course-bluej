
/**
 * Write a description of class ArrayHelpers here.
 *
 * @author Ms Camilleri
 * @version 0.1
 */
public class ArrayHelpers
{
    public static int linearSearch(int[] elements, int target) {
        // A flag to store whether we found the element or not
        boolean isFound = false;
        // The array index of the element we are searching for
        int targetPosition = -1;
        // The current element in the array we are looking at
        int current = 0;
        // The number of elements in the array
        int size = elements.length;
        
        // There are elements to look at and we did not find our target yet...
        while(current < size && isFound == false) {
            // Get the current element we are looking at
            int compare = elements[current];
            
            if (compare == target) {
                // Yes, we found the element!
                isFound = true;
                targetPosition = current;
            }
            // Move the pointer to the next location of the array
            current = current + 1;
        }
        return targetPosition;
    }

    public static int linearSearch(String[] elements, String target) {
        // A flag to store whether we found the element or not
        boolean isFound = false;
        // The array index of the element we are searching for
        int targetPosition = -1;
        // The current element in the array we are looking at
        int size = elements.length;
        // The number of elements in the array
        int current = 0;
        
        // There are elements to look at and we did not find our target yet...
        while(current < size && isFound == false) {
            String compare = elements[current];
            // Yes, we found the element!
            if (compare.equals(target)) {
                isFound = true;
                targetPosition = current;
            }
            // Move the pointer to the next location of the array
            current = current + 1;
        }
        return targetPosition;
    }
    
    public static int[] shuffle(int[] elements) {
        int size = elements.length;
        int[] shuffled = new int[size];
        // TODO Fisher Yates Shuffle
        // Write down the numbers from 1 through N.
        // Pick a random number k between one and the number of unstruck numbers remaining (inclusive).
        // Counting from the low end, strike out the kth number not yet struck out, and write it down at the end of a separate list.
        // Repeat from step 2 until all the numbers have been struck out.
        // The sequence of numbers written down in step 3 is now a random permutation of the original numbers.
        return shuffled;
    }
}
