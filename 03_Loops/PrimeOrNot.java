import java.util.*;

public class PrimeOrNot
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 2;
		
		if(n == 1){
		    System.out.println("1 is neither prime nor composite");
		}else if (n == 2){
		    System.out.println("Prime");
		}else{
		    boolean is_prime = true;
    		while(i < Math.sqrt(n)){
    		    if(n % i == 0 && i != n){
    		        is_prime = false;
    		    }
    		    i++;
    		}
    		if(is_prime){
    		    System.out.println("Prime");
    		}else{
    		    System.out.println("Not Prime");
    		}
		}
		sc.close();
	}
}
