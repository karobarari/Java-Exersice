
package Activity;



public class PrimeCheck {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Boundary and erroneous data handling
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Not prime
            }
        }

        return true; // Prime number
    }

    public static void main(String[] args) {
        int[] testValues = {2, 13, 0, -5,18,33}; // Normal, boundary, and erroneous data

        for (int value: testValues) {
            System.out.println("Is " + value + " a prime number? " + isPrime(value));
        }
    }
}