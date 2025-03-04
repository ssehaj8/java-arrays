import java.util.Scanner;

public class Reverse{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
		//Take user input
		System.out.print("Enter an integer: ");
        	int n = sc.nextInt();
	
		//in case of negative number
		int x=Math.abs(n);

		//Initialise count of digits to 0
		int cnt=0;
		int num=n;

		// Loop to count digits until the number becomes 0
        	while (num != 0) {
        		num /= 10;
        		cnt++;
        	}
		//Create an array to store digits
		int[] arr=new int[cnt];
		for(int i=0; i<cnt; i++){
			//get last digit of number and store it in array
			arr[i]= x%10;
			x/=10;
		}
	
		//Print result
		//If original number was negative then print a -ve sign first else simply print the array elements
		if(n<0){
			System.out.print("-");
		}
		for (int i=0;i<cnt;i++) {
			System.out.print(arr[i]);
        	}

	}
}
