import java.util.Scanner;

public class FrndsCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	//Create arrays for height and age of the the three friends
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        // Take input for ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + friends[i] + ":");

            while (true) {
                System.out.print("Age: ");
                age[i] = sc.nextInt();
                if (age[i] > 0) break;
                System.out.println("Invalid age. Enter a positive number");
            }

            while (true) {
                System.out.print("Height (in cm): ");
                height[i] = sc.nextDouble();
                if (height[i] > 0) break;
                System.out.println("Invalid height. Enter a positive number.");
            }
        }

        // Find the youngest friend
        int youngestIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIdx]) {
                youngestIdx = i;
            }
        }

        // Find the tallest friend
        int tallestIdx = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIdx]) {
                tallestIdx = i;
            }
        }

        // Display the results
        System.out.println("\nThe youngest friend is " + friends[youngestIdx] + " with age " + age[youngestIdx] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIdx] + " with height " + height[tallestIdx] + " cm.");

    }
}
