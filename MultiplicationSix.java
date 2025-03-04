import java.util.*;
  public class MultiplicationSix{
    public static void main(String[] args){
      
      Scanner sc= new Scanner(System.in);

      //take user input for a number
      int n= sc.nextInt(); 

      //create and Initialise an array
      int[] arr= new int[4];

      // perform the multiplication 
      for(int i=6; i<=9; i++){
        arr[i-6]=n*i;
      }  
      for(int i=6; i<=9;i++){
        System.out.println(n+"*"+i+"="+arr[i-6]);

      }

    }
  }
