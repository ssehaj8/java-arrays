import java.util.Scanner;

public class Bonus{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	
	//Create arrays and initialise them
        final int n = 10;
        double[] salary = new double[n];
        double[] yearsOfService = new double[n];
        double[] bonus = new double[n];
        double[] newSalary = new double[n];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        // Input salaries and years of service
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            while (true) {
                System.out.print("Salary: ");
                salary[i] = sc.nextDouble();
		if (salary[i] > 0) {
                        break;
                }
                else{
			System.out.println("Invalid salary. Please enter a positive number.");
                }            

            }

            while (true) {
                System.out.print("Years of Service: ");
                yearsOfService[i] = sc.nextDouble();
                if (yearsOfService[i] >= 0) {
			break;
		}
		else{
                	System.out.println("Invalid years of service. Please enter a non-negative number.");
		}
	    }
        }

        // Calculate bonus, new salary, and totals
        for (int i = 0; i < n; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } 
	    else {
                bonus[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display employee details
        System.out.println("\nEmployee Salary and Bonus Details:");
        for (int i = 0; i < n; i++) {
		 System.out.printf("Employee %d - Old Salary: %.2f, Bonus: %.2f, New Salary: %.2f%n", (i + 1), salary[i], bonus[i], newSalary[i]);
        }

        // Display total amounts
        System.out.printf("\nTotal Bonus Payout: %.2f%n", totalBonus);
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

    }
}
