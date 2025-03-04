import java.util.Scanner;

public class MultiDimensionalArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Create and Initialise a 2D array
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] matrix=new int[m][n];
		
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				matrix[i][j]=sc.nextInt();
			}
		}

		//Create a 1D array
		int[] arr=new int[m*n];
		
		//Array Index for the 1D array
		int idx=0;

		//Add elements to 1D array
		for(int i=0;i<m;i++){
                        for(int j=0;j<n;j++){
                               arr[idx++] = matrix[i][j];
                        }
                }


        	// Print the 1D array
        	System.out.println("1D array:");
        	for (int i = 0; i < idx; i++) {
        		 System.out.print(arr[i] + " ");
        	}
			
	}
}
