// Question
// Write a program to find the factorial of any number entered by the user.

import java.util.*;

public class CalculateFactorial
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number to calculate factorial:");
		int n = sc.nextInt();
		int fact = 1;
		for(int i = n; i > 0; i--){
		    fact *= i;
		}
    
		System.out.println(fact);
	}
}
