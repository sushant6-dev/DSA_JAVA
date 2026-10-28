public class BreakAndContinue
{
	public static void main(String[] args) {
		int i = 1;
		do {
		    if(i % 3 == 0){
		        continue;
		    }
		    if(i == 97){
		       break; 
		    }
		    System.out.println(i);
		    i++;
		}while(i<=100);
	}
}
