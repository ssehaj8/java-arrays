import java.util.*;
  public class Sum{
    public static void main(String[] args){

      Scanner sc= new Scanner(System.in);
      
      //create an array using double and initialize the values
      double[] arr= new double[10];
      double sum= 0.0;
      int index= 0;

      //Infinite while loop to take user input
      while(true){
      System.out.print("Enter a number(0 or negative to stop):");
      double n= sc.nextDouble();
      
      //Check if input is 0 or negative
      if(n <= 0){
      break;
      }

      //Check if the array is full (index reaches 10)
      if(index==10){
      break;
      }
       
      arr[index]=n;
      index++;
      }
      
    //print the sum
    for(int i=0;i<index;i++){
      sum= sum+arr[i];
    }
    System.out.println(sum);
    }
  }
