import java.util.Scanner;

public class numbersRiddle {
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Test cases with different variables representing different data types
        int PositiveInteger = 4;
        int NegativeInteger = -6;
        int Zero = 0;
        int One = 1;
        double PositiveDouble = 8.9;
        double NegativeDouble = -2.7;
        
        // initialize the tracking variable with the user's choice 
        int currentTotal = PositiveInteger;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println(currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println(currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println(currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - PositiveInteger; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

        //-------------------------------------------------------------------------------------------------------------------------------------

                // initialize the tracking variable with the user's choice 
        int currentTotal = NegativeInteger;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println(currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println(currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println(currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - NegativeInteger; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);
        
    
        input.close();
    }
}
