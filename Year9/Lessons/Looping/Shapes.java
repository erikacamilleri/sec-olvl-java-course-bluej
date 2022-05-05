
/**
 * A program that displays simple shapes on screen.
 *
 * @author Your Name
 * @version 06.05.2022
 */
public class Shapes
{
    public static void main(String[] args) {
        // Display a welcome message to the user
        System.out.println("******** Simple Shapes I Can Draw *********");
        System.out.println();
        
        // TODO output "Please enter a shape and I will try to draw it for you."
        String shape = Keyboard.readString();
        
        switch(shape) {
            case "rectangle": {
                System.out.println("I know how to draw a rectangle using a for loop:");
                
                for(int i = 1; i <= 3; i++) {
                    System.out.println("* * * * *");
                }
                
                break;
            }
            case "square": {
                // TODO output "I know how to draw a square using a for loop"
                // TODO loop i from 1 up to 4 and output "* * * *"
                break;
            }
            // TODO A case for "triangle", can you figure out what loop you need?
            default : {
                System.out.println("Sorry, I do not know how to draw that!");
            }
        }
    }
}
