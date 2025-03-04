import java.util.Scanner;

public class OddEven{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Create and Initialise an array
		int n=sc.nextInt();
		if(n<1){
			System.out.println("Invalid");
			return;
		}
		int[] odd = new int[n/2 +1];
		int[] even = new int[n/2 +1];
		
		//Indices for the two arrays
		int idx1=0;
		int idx2=0;

		//Add elements to arrays using for loop depending on the number being even or not
		for(int i=1;i<=n;i++){
			if(i%2==0){
				even[idx2++]=i;
			}
			else{
				odd[idx1++]=i;
			}
		}
		// Print the even numbers array
        	System.out.println("\nEven numbers:");
        	for (int i = 0; i < idx2; i++) {
            		System.out.print(even[i] + " ");
        	}

        	// Print the odd numbers array
        	System.out.println("\n\nOdd numbers:");
        	for (int i = 0; i < idx1; i++) {
        		 System.out.print(odd[i] + " ");
        	}
			
	}
}
