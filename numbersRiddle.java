import java.util.Scanner;

public class numbersRiddle {
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Test cases with different variables representing different data types
        int positiveInteger = 4;
        int negativeInteger = -6;
        int zero = 0;
        int one = 1;
        double positiveDouble = 8.9;
        double negativeDouble = -2.7;
//-------------------------------------------------------------------------------------------------------------------------------------
        // Perform caclulations with test case 1
        // initialize the tracking variable with the test case 
        double currentTotal = positiveInteger;
        
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
        currentTotal = currentTotal - positiveInteger; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

        
//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 2
        // initialize the tracking variable with the test case
        int currentTotal = negativeInteger;
        
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
        currentTotal = currentTotal - negativeInteger; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);


//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 3
        // initialize the tracking variable with the test case
        int currentTotal = zero;
        
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
        currentTotal = currentTotal - zero; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 4
        // initialize the tracking variable with the test case
        int currentTotal = one;
        
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
        currentTotal = currentTotal - one; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 5
        // initialize the tracking variable with the test case 
        int currentTotal = positiveDouble;
        
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
        currentTotal = currentTotal - positiveDouble; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

        
//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 6
        // initialize the tracking variable with the test case 
        int currentTotal = negativeDouble;
        
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
        currentTotal = currentTotal - negativeDouble; 
        System.out.println(currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);
    
        input.close();
    }
}
