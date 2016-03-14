package calculator;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int Begin = 1;
        int Number1;
        int Number2;
        int Operation;
        int Sum;
        int Difference;
        int Product;
        double Quotient;
        
        Scanner input = new Scanner (System.in);
        
        System.out.println("Hello! I'm a Calculator.");
        
        while (Begin == 1) {
            System.out.print("\nEnter your first number: ");
            Number1 = input.nextInt(); //Prompts user for input and assigns a value to Number1
        
            System.out.print("Enter your second number: ");
            Number2 = input.nextInt(); //Prompts user for input and assigns a value to Number2
        
            System.out.print("\nTo add, press 1\n"
                    + "To subtract, press 2\n"
                    + "To multiply, press 3\n"
                    + "To divide, press 4\n"
                    + "\nI pick: ");
            Operation = input.nextInt(); // Prompts user for an operation and assigns a value to Operation
        
            if (Operation == 1) {
                Sum = Number1 + Number2;
                System.out.printf("\nThe sum is %d", Sum);
            }

            else if (Operation == 2) {
                Difference = Number1 - Number2;
                System.out.printf("\nThe difference is %d", Difference);
            }
        
            else if (Operation == 3) {
                Product = Number1 * Number2;
                System.out.printf("\nThe product is %d", Product);
            }
        
            else if (Operation == 4) {
                Quotient = (double) Number1 / Number2;
                System.out.printf("\nThe quotient is %f", Quotient);
            }
            
            System.out.print("\n\nTo do another calculation, enter 1.\n"
                    + "If you're done, enter any other number.\n"
                    + "\nI pick: ");
            Begin = input.nextInt();       
        }
        
        if (Begin != 1)
            System.out.println("\nThank you for coming. See you next time!");
       
        
    }
    
}
