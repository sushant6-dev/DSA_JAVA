
// Question:
// Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers


import java.util.*;

public class OddEvenSum
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int eveSum = 0; 
		int oddSum = 0;
		
		char choice = 'y';
		
		while(choice == 'y' || choice == 'Y'){
		    
		    System.out.print("Enter a Number of your choice: ");
		    int userNum = sc.nextInt();
		    
		    System.out.println();
		    if(userNum % 2 == 0){
		        eveSum += userNum;
		    }else{
		        oddSum += userNum;
		    }
		    
		    System.out.print("Do you want to continue adding? Press 'Y' for Yes and 'N' for No: ");
		    choice = sc.next().charAt(0);
		}
		System.out.println("Even Sum: "+ eveSum + " Odd Sum: " + oddSum);
		sc.close();
	}
}
