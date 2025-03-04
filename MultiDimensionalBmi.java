import java.util.Scanner;

public class MultiDimensionalBmi{
        public static void main(String[] args){
                Scanner sc=new Scanner(System.in);

                //Take user input for number of people to consider
                System.out.print("Enter the number of persons: ");
                int n=sc.nextInt();

                //Create a multi-dimensional array to store weight, height and BMI
                double[][] arr = new double[n][3];

                //Create arrays to store status of each individual
                String[] status = new String[n];

                //Take user input for height and weight of each person
		for (int i = 0; i < n; i++) {
			do {
                		System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
                		arr[i][0] = sc.nextDouble();
                		if (arr[i][0] <= 0) {
                   			 System.out.println("Height must be a positive number.");
                		}
            		} 
            		while (arr[i][0] <= 0);

            		do {
                		System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
                		arr[i][1] = sc.nextDouble();
                		if (arr[i][1] <= 0) {
					System.out.println("Weight must be a positive number.");
                		}
			} 
            		while (arr[i][1] <= 0);
		}
                //Calculate bmi value of each person and determine the status
                for(int i=0;i<n;i++){
			arr[i][2] = arr[i][1] / (arr[i][0] * arr[i][0]);
                        if (arr[i][2] <= 18.4) {
                                status[i] = "Underweight";
                        }
                        else if (arr[i][2]>=18.5 && arr[i][2] <= 24.9) {
                                status[i] = "Normal";
                        }
                        else if (arr[i][2]>=25.0 && arr[i][2] <= 39.9) {
                                status[i] = "Overweight";
                        }
                        else {
                                status[i] = "Obese";
                        }
                }

                //print the height, weight, BMI, and weight status of each person
                System.out.println("\nHeight(m)\tWeight(kg)\tBMI\tStatus");
                for(int i=0;i<n;i++){
			System.out.printf("%.2f\t%.2f\t%.2f\t%s\n", arr[i][0], arr[i][1], arr[i][2], status[i]);
                }
        }
}



