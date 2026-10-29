
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
		
		for(int i = 1; i <= 5; i++){
		    System.out.println("Enter any Number:");
		    int userNum = sc.nextInt();
		    
		    if(userNum % 2 == 0){
		        eveSum += userNum;
		    }else{
		        oddSum += userNum;
		    }
		}
		System.out.println("Even Sum: "+ eveSum + " Odd Sum: " + oddSum);
		sc.close();
	}
}
