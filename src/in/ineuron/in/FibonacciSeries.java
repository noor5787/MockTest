package in.ineuron.in;
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = scanner.nextInt();
        
        // Initializing the first two Fibonacci numbers
        int firstTerm = 0;
        int secondTerm = 1;
        
        System.out.print("Fibonacci series up to " + numTerms + " terms: ");
        
        // Printing the first two terms
        System.out.print(firstTerm + " " + secondTerm + " ");
        
        // Generating the Fibonacci series using a for loop
        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");
            
            // Updating the values of firstTerm and secondTerm
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        
        scanner.close();
    }
}
