import java.util.*;

public class PrintPrimes
{
    public static boolean IsPrime(int num){
        if(num == 2){
            return true;
        }
        for(int i = 2; i <= (int)(Math.sqrt(num)); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		int n = 20;
		int i = 2;
		
		while(i < n){
		    if(IsPrime(i)){
		        System.out.print(i + " ");
		    }
		    i++;
		}
		
	}
}
