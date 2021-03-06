import java.util.*;

/**
 * This program will tell you a bad joke on April Fool's.
 *
 * @author Ms. Camilleri
 * @version 1.04.2022
 */
public class TellABadJoke
{
    public static void main(String[] args) {
        // Display a nice title so that the user feels very welcome.
        System.out.println("---------------------------------------------------------------------");
        System.out.println("*** The April Fool's Machine, Where Bad Jokes Come Out For A Day! ***");
        System.out.println("---------------------------------------------------------------------");
        System.out.println("");
        
        // Get today's date from the system clock
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        int todayMonth = calendar.get(Calendar.MONTH); // should give back 3 for April
        int todayDay = calendar.get(Calendar.DAY_OF_MONTH); // should give back 1 for today
        
        // The condition to check if today is indeed April Fool's
        if (todayMonth == 3 && todayDay == 1) {
            // Display a message to the user to ask whether they would like to hear a joke
            System.out.println("Would you like to hear a joke? Press 'y' for yes and 'n' for no.");
            
            // Use the Keyboard class to accept a 'y' for yes and an 'n' for no. Store the user's answer in a char variable called hearJoke
            char hearJoke = Keyboard.readChar();
            
            // Write an if statement, if hearJoke is 'y' then display "Sure thing! Oh this is going to be good... (not really)"
            // In the else part display a message "Joke is on you, because I am going to tell you one anyway!"
            if(hearJoke == 'y') {
                System.out.println("Sure thing! Oh this is going to be good... (not really)");
            } else {
                System.out.println("Joke is on you, because I am going to tell you one anyway!");
            }
            
            // This is code to get a random number between 0 and 4
            int jokeNumber = (int)(Math.random() * 5);
            
            switch(jokeNumber) {
                case 0: {
                    System.out.println("Q: Which day of the year do monkeys like best?");
                    System.out.println("A: The first of APE-ril.");
                    break;
                }
                case 1: {
                    System.out.println("Q: Why is it so easy to prank children who are born on March 31?");
                    System.out.println("A: Because they were born yesterday!");
                    break;
                }
                case 2: {
                    System.out.println("Q: Why is April so good at the high jump?");
                    System.out.println("A: Because it is 'Spring'.");
                    break;
                }
                case 3: {
                    System.out.println("Q: Why do we need a day for the fools?");
                    System.out.println("A: We don't really because they are here all year!");
                    break;
                }
                case 4: {
                    System.out.println("Q: Why is April Fools? Day like a huge open mic night?");
                    System.out.println("A: Millions of people go out of their way to demonstrate how unfunny they are.");
                    break;
                }
            }
            // Display a message to end the program
            System.out.println("Hope you liked my joke. Bye bye. See you next year!");
            
        } else {
            System.out.println("This program only works on April Fool's! Please wake me up on April 1st.");
        }
    }
}
