package in.ineuron.in;

import java.util.ArrayList;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Read numbers from user until a negative number is entered
        int input;
        do {
            System.out.print("Enter a number (negative number to stop): ");
            input = scanner.nextInt();

            if (input >= 0) {
                numbers.add(input);
            }
        } while (input >= 0);

        // Calculate the average
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        // Print the average
        System.out.println("Average: " + average);
    }
}
