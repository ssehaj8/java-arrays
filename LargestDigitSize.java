import java.util.Scanner;

public class LargestDigitSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max_digits = 10;
        int[] digits = new int[max_digits];
        int idx = 0;

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Extract digits and store in array
        while (n != 0) {
            if (idx == max_digits) {
                // Increase array size by 10
                max_digits += 10;
                int[] temp = new int[max_digits];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }

            // Get the last digit
            digits[idx] = n % 10;

            // Remove the last digit
            n /= 10;
            idx++;
        }

        if (idx == 0) {
            System.out.println("No digits were entered.");
            return;
        }

        // Find largest and second largest digits
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < idx; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
    }
}
