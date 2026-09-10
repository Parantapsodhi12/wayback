public class numbersRiddle {
    public static void main(String[] args) {

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
        System.out.println("The original number is 4");
        double currentTotal = positiveInteger;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println("number after being multiplied by 2: " + currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println("number after adding 6: " + currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println("number after dividing by 2: " + currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - positiveInteger; 
        System.out.println("after subtracting the original number: " + currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

        
//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 2
        // initialize the tracking variable with the test case
        System.out.println("The original number is -6");
        currentTotal = negativeInteger;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println("number after being multiplied by 2: " + currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println("number after adding 6: " + currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println("number after dividing by 2: " + currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - negativeInteger; 
        System.out.println("after subtracting the original number: " + currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);


//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 3
        // initialize the tracking variable with the test case
        System.out.println("The original number is 0");
        currentTotal = zero;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println("number after being multiplied by 2: " + currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println("number after adding 6: " + currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println("number after dividing by 2: " + currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - zero; 
        System.out.println("after subtracting the original number: " + currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 4
        // initialize the tracking variable with the test case
        System.out.println("The original number is 1");
        currentTotal = one;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println("number after being multiplied by 2: " + currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println("number after adding 6: " + currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println("number after dividing by 2: " + currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - one; 
        System.out.println("after subtracting the original number: " + currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 5
        // initialize the tracking variable with the test case 
        System.out.println("The original number is 8.9");
        currentTotal = positiveDouble;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println("number after being multiplied by 2: " + currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println("number after adding 6: " + currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println("number after dividing by 2: " + currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - positiveDouble; 
        System.out.println("after subtracting the original number: " + currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);

        
//-------------------------------------------------------------------------------------------------------------------------------------

        // Perform calculations with test case 6
        // initialize the tracking variable with the test case 
        System.out.println("The original number is -2.7");
        currentTotal = negativeDouble;
        
        // multiply the number by 2
        currentTotal *= 2; 
        System.out.println("number after being multiplied by 2: " + currentTotal);
        
        // add 6 to the total
        currentTotal += 6; 
        System.out.println("number after adding 6: " + currentTotal);
        
        // divide the total by 2
        currentTotal /= 2; 
        System.out.println("number after dividing by 2: " + currentTotal);
        
        // subtract the original number
        currentTotal = currentTotal - negativeDouble; 
        System.out.println("after subtracting the original number: " + currentTotal);
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);
    
    }
}
