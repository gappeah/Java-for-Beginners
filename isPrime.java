import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int num = scanner.nextInt(); // User input their number of choice
        boolean isPrime = true; // Assume the number is prime
        
        // Prime numbers are greater than 1
        if (num > 1) {
            // Check for factors from 2 to the square root of num
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // Found a factor, num is not prime
                    break; // No need to check further
                }
            }
        } else {
            isPrime = false; // Numbers <= 1 are not prime
        }
        
        if (isPrime) {
            System.out.println("This number " + num + " is prime");
        } else {
            System.out.println("This number " + num + " is not a prime");
        }
    }
}

  
	  
	  
