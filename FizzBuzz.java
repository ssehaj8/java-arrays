import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the number is a positive integer
        if (n <= 0) {
            System.out.println("Error: Invalid number");
            return;
        }

        // Create a String array to save the results
        String[] arr = new String[n + 1];

        // Loop from 0 to the number and save Fizz, Buzz, or FizzBuzz
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i] = "Buzz";
            } else {
                arr[i] = String.valueOf(i);
            }
        }

        // Display the results
        System.out.println("FizzBuzz Results:");
        for (int i = 0; i <= n; i++) {
            System.out.println("Position " + i + " = " + arr[i]);
        }
    }
}
