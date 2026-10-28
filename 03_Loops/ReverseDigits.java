public class ReverseDigits
{
	public static void main(String[] args) {
		int n = 132;
		
		int x = n;
		int rev = 0;
		while(x > 0){
		    int dig = x % 10;
		    rev = dig + (rev*10);
		    x = (int)(x / 10);
		}
		System.out.println(rev);
	}
}
