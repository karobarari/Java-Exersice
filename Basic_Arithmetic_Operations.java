
package Activity;

import java.util.Scanner;

public class Basic_Arithmetic_Operations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the first number:");
        int input1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int input2 = scanner.nextInt();
        int sum = input1 + input2;
        
        int difference = input1 - input2;
        int product = input1 * input2;
        int quotient = input1 / input2;
 // Handle potential division by zero

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
    }
    
}
