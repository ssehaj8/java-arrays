import java.util.Scanner;

public class CanVote{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//Create and Initialise an array
		int[] ages=new int[10];

		//Add elements to array using for loop
		for(int i=0;i<10;i++){
			ages[i]=sc.nextInt();
		}
		

		//Determine if students can perform or not
		for(int i=0;i<ages.length;i++){
			if(ages[i]>=18){
				System.out.println("The student with the age " + ages[i] + " can vote");
			}
			else if(ages[i]<0){
				System.out.println("invalid age");
			}
			else{
				System.out.println("The student with the age " + ages[i] + " cannot vote");
			}
		}
			
	}
}
