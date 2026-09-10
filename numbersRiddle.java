import java.util.Scanner;

public class numbersRiddle {
    public static void main(String[] args) {
        // create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // ask the user for their starting secret number
        System.out.print("Enter a whole number: ");
        int originalNumber = input.nextInt();
        
        // initialize the tracking variable with the user's choice 
        int currentTotal = originalNumber;
        
        // multiply the number by 2
        currentTotal = currentTotal * 2; 
        
        // add 6 to the total
        currentTotal = currentTotal + 6; 
        
        // divide the total by 2
        currentTotal = currentTotal / 2; 
        
        // subtract the original number
        currentTotal = currentTotal - originalNumber; 
        
        // print the final result (it will always be 3)
        System.out.println("The riddle's final answer is: " + currentTotal);
        
    
        input.close();
    }
}
