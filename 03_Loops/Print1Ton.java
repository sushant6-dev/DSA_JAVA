import java.util.*;

public class Print1Ton
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("Enter number:");
		int user_num = sc.nextInt();
		
		int counter = 1;
		
		while(counter <= user_num){
		    System.out.println(counter);
		    counter++;
		}
		
		sc.close();
	}
}
