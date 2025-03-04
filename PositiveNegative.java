import java.util.Scanner;

public class PositiveNegative{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Create and Initialise an array
		int[] arr=new int[5];

		//Add elements to array using for loop
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		

		//Determine if numbers are positive, negative or zero
		for(int i=0;i<arr.length;i++){
			if(arr[i] > 0){
				System.out.println(arr[i]+" is POSITIVE");
				if(arr[i] % 2 == 0){
					System.out.println(arr[i] + " is EVEN");;
				}
				else{ 
                                        System.out.println(arr[i] + " is ODD");
                                }
			}
			else if(arr[i]<0){
				System.out.println(arr[i] +" is NEGATIVE");
			}
			else{
				System.out.println(" is Zero");
			}
		}
		

		//Compare the first and last element of array
		if(arr[0]>arr[arr.length-1]){
			System.out.println(arr[0] +" is greater than "+ arr[arr.length-1]);
		}
		else if(arr[0]<arr[arr.length-1]){ 
                        System.out.println(arr[0] +" is less than "+ arr[arr.length-1]);
                }
		else{
                        System.out.println(arr[0] +" is equal to "+ arr[arr.length-1]);
                }
			
	}
}
