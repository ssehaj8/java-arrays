import java.util.*;
 public class MultiplicationTable{
   public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
   
     // take user input for number 
     int n= sc.nextInt();

     //create and Initialise an array
     int[] table= new int[10]; 
     
     //Perform the Multiplication
     for(int i=0;i<table.length; i++){
            table[i]= n*(i+1);
     }

     //print the Result
     for(int i=0;i<=table.length;i++){
         System.out.println(n+"*"+(i+1)+"="+table[i]);
      }
  }
 } 
