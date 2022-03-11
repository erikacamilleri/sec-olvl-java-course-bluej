
/**
 * Write a description of class MyComputerScienceResult here.
 *
 * @author Your Name
 * @version 11.03.2022
 */
public class MyComputerScienceResult
{
    public static void main(String[] args) {
        
        // Declaring all the variables to store my marks 
        int marksForMyBehaviour = 0; // maximum marks 5
        
        int marksForWorksheets = 0; // maximum marks 5
        
        int marksForPayingAttention = 0; // maximum marks 5 (but if you are Francesco maximum marks 2)
        
        int marksForProgramming = 0; // maximum marks 5
        
        int marksForExam = 0; // maximum marks 80
        
        // Let me insert my marks for behaviour...
        System.out.println("Insert a mark between 0 and 5 for your behaviour...");
        marksForMyBehaviour = Keyboard.readInt();
        
        // TODO: Let me insert my marks for worksheets

        // TODO: Let me insert my marks for paying attention
        
        // TODO: Let me insert my marks for programming
        
        // TODO: Let me insert my marks for exam
        
        // TODO: Do you see a small mistake here?
        int myTotalMark = marksForMyBehaviour + marksForWorksheets + marksForPayingAttention - marksForProgramming + marksForExam;
        
        // TODO: If myTotalMark is over 70 then I did very well!
        
        // TODO: If myTotalMark is over 50 then I passed ok!
        
        // TODO: If myTotalMark is over 45 then I failed but can improve by studying a bit more!
        
        // TODO: If myTotalMark is less than 45 then I failed and did not understand!
        
    }
}
