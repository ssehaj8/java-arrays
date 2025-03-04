import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // In case of negative number, turn it to positive
        n = Math.abs(n);

        // Array to store the frequency of digits (0-9)
        int[] frequency = new int[10];

        // Loop to find digits and count their frequency
        while (n > 0) {
            int digit = n % 10;      
            frequency[digit]++;          
            n /= 10;                
        }

        // Display the frequency of each digit
        System.out.println("Digit Frequency : ");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + " -> " + frequency[i]);
            }
        }
    }
}
