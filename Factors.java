import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check if the number is a positive integer
        if (n < 0) {
            System.out.println(n + " is not a positive integer.");
            return;
        }

	int maxFactor=10;
	int[] arr=new int[maxFactor];
	int idx=0;

	// Find factors and resize array if needed
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (idx == maxFactor) {
                    // Double the array size if it's full
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    System.arraycopy(arr, 0, temp, 0, arr.length);
                    arr = temp;
                }
                arr[idx++] = i;
            }
        }


        // Display the factorial
	for (int i = 0; i < idx; i++) {
        	System.out.print(arr[i] + " ");
        }
    }
}
